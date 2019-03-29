package io.jpress.module.shopping.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.config.Interceptors;
import com.jfinal.i18n.I18nInterceptor;

public class I18nTestInterceptor extends I18nInterceptor {

    public void configInterceptor(Interceptors me){
        me.add(new I18nTestInterceptor());
    }
}
