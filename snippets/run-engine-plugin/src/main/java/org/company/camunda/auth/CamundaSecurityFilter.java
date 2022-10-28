package org.company.camunda.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class CamundaSecurityFilter {
    private static final Logger LOG = LoggerFactory.getLogger(CamundaSecurityFilter.class);

    @Bean
    public FilterRegistrationBean processEngineAuthenticationFilter() {
        LOG.info("SUMANT-CAMUNDA starting filter");
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setName("camunda-jwt-auth");
        registration.addInitParameter("authentication-provider",
                "org.company.camunda.auth.AuthenticationFilterJwt");
        registration.addUrlPatterns("/engine-rest/*");
        registration.setFilter(getProcessEngineAuthenticationFilter());
        return registration;
    }

    @Bean
    public Filter getProcessEngineAuthenticationFilter() {
        return new ProcessEngineAuthenticationFilterJwt();
    }

//
//
//
//    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//        // @formatter:off
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/saml/**").permitAll().anyRequest().authenticated().and().apply(saml())
//                .userDetailsService(samlUserService).serviceProvider().protocol(spProtocol).hostname(spHost)
//                .basePath(spBashPath).keyStore().storeFilePath(keyStoreFile).keyPassword(keyStorePassword)
//                .keyname(keyStoreAlias).and().and().identityProvider().metadataFilePath(metadataPath).and().and();
//        // @formatter:on
//    }
//
//    @Bean
//    public FilterRegistrationBean containerBasedAuthenticationFilter() {
//        System.out.println("Inside Spring Filter");
//        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
//        filterRegistration.setFilter(new ContainerBasedAuthenticationFilter());
//        filterRegistration.setInitParameters(Collections.singletonMap("authentication-provider",
//                "com.prad.samldemo.config.SpringSecurityAuthenticationProvider"));
//        filterRegistration.setOrder(101); // make sure the filter is registered after the Spring Security Filter Chain
//        filterRegistration.addUrlPatterns("/camunda/*");
//        return filterRegistration;
//    }
}
