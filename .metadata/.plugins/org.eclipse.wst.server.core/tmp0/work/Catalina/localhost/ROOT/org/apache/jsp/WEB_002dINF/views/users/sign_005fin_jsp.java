/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-10-18 08:56:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1580293303682L));
    _jspx_dependants.put("jar:file:/C:/Users/geekh/Desktop/jrcp_workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SpringProject_JobRecipe/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\"\r\n");
      out.write("\tintegrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<title>JobRecipe</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("/* sign in FORM */\r\n");
      out.write("#logreg-forms {\r\n");
      out.write("\twidth: 412px;\r\n");
      out.write("\tmargin: 10vh auto;\r\n");
      out.write("\tbackground-color: #f3f3f3;\r\n");
      out.write("\tbox-shadow: 0 1px 3px rgba(0, 0, 0, 0.12), 0 1px 2px rgba(0, 0, 0, 0.24);\r\n");
      out.write("\ttransition: all 0.3s cubic-bezier(.25, .8, .25, 1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms form {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmax-width: 410px;\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .form-control {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .form-control:focus {\r\n");
      out.write("\tz-index: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .form-signin input[type=\"email\"] {\r\n");
      out.write("\tmargin-bottom: -1px;\r\n");
      out.write("\tborder-bottom-right-radius: 0;\r\n");
      out.write("\tborder-bottom-left-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .form-signin input[type=\"password\"] {\r\n");
      out.write("\tborder-top-left-radius: 0;\r\n");
      out.write("\tborder-top-right-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .social-login {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tmargin-bottom: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .social-btn {\r\n");
      out.write("\tfont-weight: 100;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tfont-size: 0.9rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tcolor: lightseagreen;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-form .lines {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\tborder: 1px solid red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms button[type=\"submit\"] {\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .facebook-btn {\r\n");
      out.write("\tbackground-color: #3C589C;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .google-btn {\r\n");
      out.write("\tbackground-color: #DF4B3B;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .form-reset, #logreg-forms .form-signup {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .form-signup .social-btn {\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logreg-forms .form-signup input {\r\n");
      out.write("\tmargin-bottom: 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signup .social-login {\r\n");
      out.write("\twidth: 210px !important;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar msg = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\r\n");
      out.write("\tif(msg == 'success') {\r\n");
      out.write("\t\talert('로그인을 하세요 ');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"logreg-forms\">\r\n");
      out.write("\t\t<form class=\"form-signin\" action=\"signinCheck.do\" method=\"post\">\r\n");
      out.write("\t\t\t<h1 class=\"h3 mb-3 font-weight-normal\" style=\"text-align: center\">로그인</h1>\r\n");
      out.write("\t\t\t<div class=\"social-login\">\r\n");
      out.write("\t\t\t\t<button class=\"btn facebook-btn social-btn\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t<span><i class=\"fab fa-facebook-f\"></i> 페이스북 로그인</span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p style=\"text-align: center\">OR</p>\r\n");
      out.write("\t\t\t<input type=\"email\" name=\"u_email\" class=\"form-control\" placeholder=\"이메일 \">\r\n");
      out.write("\t\t\t<input type=\"password\" name=\"u_pw\" class=\"form-control\" placeholder=\"비밀번호\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<button class=\"btn btn-success btn-block\" type=\"submit\"><i class=\"fas fa-sign-in-alt\"></i> 로그인</button>\r\n");
      out.write("\t\t\t<a href=\"./findPw.do\" id=\"forgot_pswd\">비밀번호 찾기</a>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<!-- <p>Don't have an account!</p>  -->\r\n");
      out.write("\t\t\t<button class=\"btn btn-primary btn-block\" type=\"button\" id=\"btn-signup\">\r\n");
      out.write("\t\t\t\t<i class=\"fas fa-user-plus\"></i> 회원가입\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
