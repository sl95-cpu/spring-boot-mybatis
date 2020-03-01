package com.sl.srpingboot001.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
       String language = request.getParameter("l");
        Locale locale = Locale.getDefault();//如果没有就使用默认的
        //如果请求携带了 国际化的参数
        if (!StringUtils.isEmpty(language)){
           String[] split = language.split("_");
           //国家
         locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
