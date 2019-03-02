package com.prkandel.filter;

import com.prkandel.controller.CommonConstants;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by leapfrog on 2/1/16.
 */
@WebFilter(filterName = "ExceptionFilter")
public class ExceptionFilter implements Filter {
  private static final Logger LOGGER = Logger.getLogger(ExceptionFilter.class.getName());

  @Override
  public void destroy() {
    //
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws ServletException, IOException {
    try {
      System.out.println("INSIDE DO FILTER");
      chain.doFilter(request, response);
      System.out.println("FILTERED PROPERLY");
    } catch (ServletException e) {
      LOGGER.log(Level.SEVERE, e.getMessage(), e);
      System.out.println("HAMI YAHA AAIPUGYAU NI TA KURA BUJHIDAI CHHA HAHA");
      request.setAttribute(CommonConstants.ERROR_MESSAGE, e.getMessage());
      if (CommonConstants.PAGE_NOT_FOUND.equals(e.getMessage())) {
        ((HttpServletResponse) response).sendError(HttpServletResponse.SC_NOT_FOUND);
      } else {
        ((HttpServletResponse) response).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
      }
    }
  }

  @Override
  public void init(FilterConfig config) throws ServletException {
    //
  }

}
