/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.75
 * Generated at: 2022-03-15 12:17:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.javaprograms.Product;
import java.util.List;
import com.connections.RegisterConncet;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/NewNavBar.html", Long.valueOf(1647346610911L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.connections.RegisterConncet");
    _jspx_imports_classes.add("com.javaprograms.Product");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write(" ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("#headbar\r\n");
      out.write("		{\r\n");
      out.write("			background-color:cyan;display:flex;height:100px\r\n");
      out.write("		}\r\n");
      out.write("#img1{\r\n");
      out.write("		height:50px;padding-left:200px;padding-top:20px\r\n");
      out.write("	}\r\n");
      out.write("#in1\r\n");
      out.write("	{\r\n");
      out.write("		height:40px;width:410px;margin-top:22px;margin-left:10px;margin-right:25px;font-family:cursive;border-radius:15px\r\n");
      out.write("	}\r\n");
      out.write(".logout\r\n");
      out.write("		{\r\n");
      out.write("			height:39px;width:110px;border-radius:15px;margin-top:25px;margin-left:5px;background-color:lightgrey;font-family:cursive\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("*{margin:0px;padding:0px;font-family:cursive;text-decoration:none}\r\n");
      out.write("\r\n");
      out.write("nav{background-color:transparent;text-align:center}\r\n");
      out.write("\r\n");
      out.write("nav ul{ display:inline-flex;list-style:none;}\r\n");
      out.write("\r\n");
      out.write("nav ul li{width:190px;margin:10px;padding:10px}\r\n");
      out.write("\r\n");
      out.write("nav ul li:hover{background-color:cyan}\r\n");
      out.write("\r\n");
      out.write("#submenu1{display:none;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("nav ul li:hover #submenu1{display:block;position:absolute;background-color:lightgrey;margin-top:20px}\r\n");
      out.write("\r\n");
      out.write("nav ul li:hover #submenu1 ul{display:block}\r\n");
      out.write("\r\n");
      out.write("nav ul li:hover #submenu1 ul li{width:150px;padding:0px;background:transparent;text-align:left}\r\n");
      out.write("\r\n");
      out.write("#submenu1 ul li :hover{background-color:red;}\r\n");
      out.write("\r\n");
      out.write(".submenu2{display:none}\r\n");
      out.write("\r\n");
      out.write("#a1:hover .submenu2{ position:absolute;display:block;margin-top:-40px;margin-left:160px;background:yellow}\r\n");
      out.write("\r\n");
      out.write("#a2:hover .submenu2{ position:absolute;display:block;margin-top:-40px;margin-left:160px;background:yellow}\r\n");
      out.write("\r\n");
      out.write("#submenu2:hover{background-color:red}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("		<div id=\"headbar\"><div><img id=\"img1\" src=\"img/logo.jpg\"></div><div><form action=\"Search.jsp\"><input id=\"in1\" type=\"search\" placeholder=\"Serach\" name=\"search\"><input type=\"submit\" value=\"search\" class=\"logout\"></form></div><div><a href=\"logout.html\"><input type=\"button\" value=\"logOut\" class=\"logout\"></a></div></div>\r\n");
      out.write("		\r\n");
      out.write("		<nav>\r\n");
      out.write("		<ul>\r\n");
      out.write("		<li><figure><img src=\"img/mobile.png\"><figcaption>Mobiles</figcaption></figure></li>\r\n");
      out.write("		<li><figure><a href=\"#\"><img src=\"img/fur.jpg\"></a><figcaption>Furniture</figcaption></figure></li>\r\n");
      out.write("		<li><figure><a href=\"#\"><img src=\"img/elec.png\"></a><figcaption>Electronics</figcaption></figure></li>\r\n");
      out.write("		<li><figure><a href=\"#\"><img src=\"img/fashion.png\"></a><figcaption>Fashion</figcaption></figure>\r\n");
      out.write("		<div id=\"submenu1\"> 	\r\n");
      out.write("		<ul>\r\n");
      out.write("		<li><a href=\"#\">Men</a></li>\r\n");
      out.write("		<li id=\"a1\"><a href=\"#\" >Women</a>\r\n");
      out.write("		<div class=\"submenu2\">\r\n");
      out.write("		<ul>\r\n");
      out.write("		<li><a href=\"#\">Traditional</a></li>\r\n");
      out.write("		<li><a href=\"#\">Designer</a></li>\r\n");
      out.write("		<li><a href=\"#\">Western</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		</li>\r\n");
      out.write("		<li id=\"a2\"><a href=\"#\" >Kids</a>\r\n");
      out.write("		<div class=\"submenu2\">\r\n");
      out.write("		<ul>\r\n");
      out.write("		<li><a href=\"#\">Girl</a></li>\r\n");
      out.write("		<li><a href=\"#\">Boy</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		</li>\r\n");
      out.write("		<li><a href=\"#\">NewBorn</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		</li>\r\n");
      out.write("		<li><figure><a href=\"#\"><img src=\"img/appliances.png\"></a><figcaption>Appliances</figcaption></figure></li>\r\n");
      out.write("		<li><figure><a href=\"#\"><img src=\"img/gor.png\"></a><figcaption>Groceries</figcaption></figure></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("*{font-size:22px;font-family:cursive}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

RegisterConncet r=new RegisterConncet();
List<Product> al=r.displayProducts();

      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<table>\r\n");
      out.write("<h2>Displaying All Products</h2>\r\n");
      out.write("<tr>\r\n");
 
for(Product p:al)
{
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><img src=\"./img/");
      out.print(p.getImage());
      out.write("\" height=100px width=100px></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>");
      out.print(p.getPid());
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>");
      out.print(p.getName());
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>");
      out.print(p.getPrice());
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>");
      out.print(p.getDesc());
      out.write("</td>\r\n");
      out.write("<td><button><a href=\"Cart.jsp?id=");
      out.print(p.getPid() );
      out.write("\"> addToCart</a></button></td>\r\n");
      out.write("</tr>\r\n");
 
}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
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
