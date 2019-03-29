package io.jpress.module.shopping;

import com.jfinal.config.Interceptors;
import io.jboot.app.JbootApplication;
import io.jboot.core.listener.JbootAppListenerBase;
import io.jpress.module.shopping.interceptor.I18nTestInterceptor;

public class I18nModuleListener extends JbootAppListenerBase {

    @Override
    public void onInterceptorConfig(Interceptors interceptors) {
        interceptors.add(new I18nTestInterceptor());
    }
}
