package com.aw.app;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class ZullCustomFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(ZullCustomFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext contex = RequestContext.getCurrentContext();
        HttpServletRequest request = contex.getRequest();
        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        return null;
    }
}
