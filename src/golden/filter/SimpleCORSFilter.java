package golden.filter;
 
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class SimpleCORSFilter implements Filter
 {
   private boolean isCross = false;
   public void destroy() {
   this.isCross = false;
  }

   
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
     if (this.isCross) {
      HttpServletRequest httpServletRequest = (HttpServletRequest)request;
      HttpServletResponse httpServletResponse = (HttpServletResponse)response;
      System.out.println("«Î«Û¿πΩÿ: " + httpServletRequest.getServletPath());
      httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
      httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
      httpServletResponse.setHeader("Access-Control-Max-Age", "0");
      httpServletResponse.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
      httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
      httpServletResponse.setHeader("XDomainRequestAllowed", "1");
    } 
    chain.doFilter(request, response);
   }
 
   
   public void init(FilterConfig filterConfig) throws ServletException {
     String isCrossStr = filterConfig.getInitParameter("IsCross");
     this.isCross = isCrossStr.equals("true");
     System.out.println(isCrossStr);
   }
 }
