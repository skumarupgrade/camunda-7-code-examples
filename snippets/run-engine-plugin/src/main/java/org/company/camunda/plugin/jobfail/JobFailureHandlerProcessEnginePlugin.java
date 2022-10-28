package org.company.camunda.plugin.jobfail;

import org.camunda.bpm.engine.impl.cfg.AbstractProcessEnginePlugin;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.interceptor.Command;
import org.camunda.bpm.engine.impl.jobexecutor.FailedJobCommandFactory;
import org.company.camunda.auth.CamundaSecurityFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobFailureHandlerProcessEnginePlugin extends AbstractProcessEnginePlugin {
    private static final Logger LOG = LoggerFactory.getLogger(JobFailureHandlerProcessEnginePlugin.class);
    @Override
    public void preInit(ProcessEngineConfigurationImpl engineConfig) {
        // replace DefaultJobCommandFactory with own Factory, which will use our custom command
        engineConfig.setFailedJobCommandFactory(new FailedJobCommandFactory() {
            @Override
            public Command<Object> getCommand(String jobId, Throwable exception) {
                LOG.info("SUMANT-CAMUNDA COmmand is getting trigerred");
                return new MyJobRetryCmd(jobId, exception);
            }
        });
    }
}

