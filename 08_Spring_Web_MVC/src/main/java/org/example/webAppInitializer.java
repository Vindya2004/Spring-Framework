package org.example;

import org.example.config.WebAppConfig;
import org.example.config.WebRootConfig;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class webAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //add webroot configuration class in to context
    @Override
    protected Class<?> @Nullable [] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }
    //add webapp config configuration class in to context
    @Override
    protected Class<?> @Nullable [] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}