/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2022-10-17 13:13:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.util.XavaPreferences;
import org.openxava.util.Is;
import org.openxava.model.meta.MetaProperty;
import org.openxava.view.meta.MetaPropertyView;

public final class editor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/xava/htmlTagsEditor.jsp", Long.valueOf(1666012265431L));
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1666012265461L));
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1666012266089L));
    _jspx_dependants.put("jar:file:/C:/Users/Zuriel%20PC/Desktop/openxava-6.6.3/workspace/Aeropuerto/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425996668000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1666012266103L));
    _jspx_dependants.put("jar:file:/C:/Users/Zuriel%20PC/Desktop/openxava-6.6.3/workspace/Aeropuerto/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425996668000L));
    _jspx_dependants.put("/xava/propertyActionsExt.jsp", Long.valueOf(1666012265754L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.util.XavaPreferences");
    _jspx_imports_classes.add("org.openxava.view.meta.MetaPropertyView");
    _jspx_imports_classes.add("org.openxava.util.Is");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody;

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
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
org.openxava.view.View view = (org.openxava.view.View) context.get(request, viewObject);
String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String shasFrame = request.getParameter("hasFrame"); 
boolean hasFrame="true".equals(shasFrame)?true:false;
boolean editable = view.isEditable(p);
boolean lastSearchKey = view.isLastSearchKey(p); 
boolean throwPropertyChanged = view.throwsPropertyChanged(p);
	

int labelFormat = view.getLabelFormatForProperty(p);
String labelStyle = view.getLabelStyleForProperty(p);
if (Is.empty(labelStyle)) labelStyle = XavaPreferences.getInstance().getDefaultLabelStyle();
String label = view.getLabelFor(p);

      out.write('\n');
      out.write('\n');
 if (view.isFlowLayout()) { 
      out.write(" \n");
      out.write("<div>  \n");
 } 
      out.write('\n');
      out.write('\n');

String sfirst = request.getParameter("first"); 
boolean first="true".equals(sfirst)?true:false;

String labelClass = null;
String editorClass = null;

if (view.isAlignedByColumns()) {
	labelClass = editorClass = "ox-layout-aligned-cell";
}
else {
	editorClass = "ox-layout-not-aligned-cell";
	labelClass = first?"ox-layout-aligned-cell":"ox-layout-not-aligned-cell";
}

String preLabel="<div class='" + labelClass + " " + style.getLabel() + "'>";
String postLabel="</div>";
String preEditor="<div class='" + editorClass + " " + style.getEditorWrapper()+ "'>";
String postEditor="</div>";

      out.write('\n');
  
if (first && !view.isAlignedByColumns()) label = org.openxava.util.Strings.change(label, " ", "&nbsp;");

      out.write('\n');
      out.write('\n');
 if (!hasFrame) {  
      out.write('\n');
      out.write('\n');
      out.print(preLabel);
      out.write('\n');
 
if (labelFormat == MetaPropertyView.NORMAL_LABEL) {

      out.write("\n");
      out.write("<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f0_reused = false;
      try {
        _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f0.setParent(null);
        // /xava/editor.jsp(47,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fid_005f0.setName("label_" + view.getPropertyPrefix() + p.getName());
        int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
        if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
        _jspx_th_xava_005fid_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f0_reused);
      }
      out.write("\" class=\"");
      out.print(labelStyle);
      out.write('"');
      out.write('>');
      out.write('\n');
      out.print(label);
      out.write("\n");
      out.write("</span>\n");
 } 
      out.write('\n');
      out.print(postLabel);
      out.write('\n');
      out.print(preEditor);
      out.write('\n');
 
if (labelFormat == MetaPropertyView.SMALL_LABEL) { 

      out.write("\n");
      out.write("<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f1_reused = false;
      try {
        _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f1.setParent(null);
        // /xava/editor.jsp(56,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fid_005f1.setName("label_" + view.getPropertyPrefix() + p.getName());
        int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
        if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
        _jspx_th_xava_005fid_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f1_reused);
      }
      out.write("\" class=\"");
      out.print(style.getSmallLabel());
      out.write(' ');
      out.print(labelStyle);
      out.write('"');
      out.write('>');
      out.print(label);
      out.write("</span><br/> \n");
 } 
      out.write('\n');
 } // if (!hasFrame)
String placeholder = !Is.empty(p.getPlaceholder()) ? "data-placeholder='" + p.getPlaceholder() + "'" : "";
String required = view.isEditable() && p.isRequired() ? style.getRequiredEditor():""; 

      out.write("\n");
      out.write("<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f2 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f2_reused = false;
      try {
        _jspx_th_xava_005fid_005f2.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f2.setParent(null);
        // /xava/editor.jsp(62,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fid_005f2.setName("editor_" + view.getPropertyPrefix() + p.getName());
        int _jspx_eval_xava_005fid_005f2 = _jspx_th_xava_005fid_005f2.doStartTag();
        if (_jspx_th_xava_005fid_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
        _jspx_th_xava_005fid_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f2, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f2_reused);
      }
      out.write("\" class=\"xava_editor ");
      out.print(required);
      out.write('"');
      out.write(' ');
      out.print(placeholder);
      out.write('>');
      out.write('\n');
      //  xava:editor
      org.openxava.web.taglib.EditorTag _jspx_th_xava_005feditor_005f0 = (org.openxava.web.taglib.EditorTag) _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.get(org.openxava.web.taglib.EditorTag.class);
      boolean _jspx_th_xava_005feditor_005f0_reused = false;
      try {
        _jspx_th_xava_005feditor_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005feditor_005f0.setParent(null);
        // /xava/editor.jsp(63,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005feditor_005f0.setProperty(p.getName());
        // /xava/editor.jsp(63,0) name = editable type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005feditor_005f0.setEditable(editable);
        // /xava/editor.jsp(63,0) name = throwPropertyChanged type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005feditor_005f0.setThrowPropertyChanged(throwPropertyChanged);
        int _jspx_eval_xava_005feditor_005f0 = _jspx_th_xava_005feditor_005f0.doStartTag();
        if (_jspx_th_xava_005feditor_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.reuse(_jspx_th_xava_005feditor_005f0);
        _jspx_th_xava_005feditor_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005feditor_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005feditor_005f0_reused);
      }
      out.write("\n");
      out.write("</span>\n");
      out.write("\n");
 if (!(lastSearchKey && view.displayWithFrame())) { 
      out.write(" \n");
      out.write("\t<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f3 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f3_reused = false;
      try {
        _jspx_th_xava_005fid_005f3.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f3.setParent(null);
        // /xava/editor.jsp(67,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fid_005f3.setName("property_actions_" + view.getPropertyPrefix() + p.getName());
        int _jspx_eval_xava_005fid_005f3 = _jspx_th_xava_005fid_005f3.doStartTag();
        if (_jspx_th_xava_005fid_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
        _jspx_th_xava_005fid_005f3_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f3, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f3_reused);
      }
      out.write("\">\n");
      out.write("\t\t");
 if (view.propertyHasActions(p)) { 
      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "propertyActions.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("propertyName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(p.getName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("lastSearchKey", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(lastSearchKey), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("editable", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(editable), request.getCharacterEncoding()), out, false);
      out.write('\n');
      out.write('	');
      out.write('	');
 } 
      out.write("\n");
      out.write("\t</span>\n");
 } 
      out.write(' ');
      out.write('\n');
      out.write('\n');
 if (!hasFrame) { 
      out.write('\n');
      out.write(' ');
      out.write('\n');
      out.print(postEditor);
      out.write('\n');
 if (labelFormat == MetaPropertyView.SMALL_LABEL) { 
      out.write('\n');
 } 
      out.write('\n');
      out.write('\n');
 } // if (!hasFrame) 
      out.write('\n');
      out.write('\n');
 if (view.isFlowLayout()) { 
      out.write(" \n");
      out.write("</div>  \n");
 } 
      out.write('\n');
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
