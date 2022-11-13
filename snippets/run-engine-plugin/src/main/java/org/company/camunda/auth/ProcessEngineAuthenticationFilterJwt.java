package org.company.camunda.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Component
public class ProcessEngineAuthenticationFilterJwt {//implements Filter {
//    private static final Logger LOG = LoggerFactory.getLogger(ProcessEngineAuthenticationFilterJwt.class);
//    public static final String AUTHENTICATION_PROVIDER_PARAM = "authentication-provider";
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        LOG.info("SUMANT-CAMUNDA insider filter init");
//        String authenticationProviderClassName = filterConfig.getInitParameter(AUTHENTICATION_PROVIDER_PARAM);
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        LOG.info("SUMANT-CAMUNDA insider filter doFilter");
//    }
//
//    @Override
//    public void destroy() {
//        LOG.info("SUMANT-CAMUNDA insider filter destroy");
//
//    }
}
