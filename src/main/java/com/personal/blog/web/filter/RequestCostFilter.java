package com.personal.blog.web.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author weizp
 */
@Slf4j
public class RequestCostFilter implements Filter {

    private static final Logger log = LoggerFactory.getLogger(RequestCostFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		StopWatch stopWatch = new StopWatch(System.currentTimeMillis() + "");
		stopWatch.start();
		chain.doFilter(request, response);
		stopWatch.stop();

		log.debug(httpRequest.getRequestURI() + " -> request cost - " + stopWatch.getTotalTimeMillis());
    }

    @Override
    public void destroy() {

    }
}
