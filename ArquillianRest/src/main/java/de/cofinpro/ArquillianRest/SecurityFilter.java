package de.cofinpro.ArquillianRest;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.HttpMethod;
import java.io.IOException;

@WebFilter(urlPatterns = "/rest/cofinpro/*")
public class SecurityFilter implements Filter {

    public void destroy()
    {
    }

    public void doFilter(ServletRequest request, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        final HttpServletRequest httpRequest = (HttpServletRequest) request;
        if (HttpMethod.POST.equals(httpRequest.getMethod())) {
            final String authorization = httpRequest.getHeader("Authorization");
            if (null == authorization || !"abc".equals(authorization)) {
                ((HttpServletResponse) servletResponse).sendError(401);
                return;
            }
        }
        filterChain.doFilter(request, servletResponse);
    }

    public void init(FilterConfig filterConfig) throws ServletException
    {
    }
}
