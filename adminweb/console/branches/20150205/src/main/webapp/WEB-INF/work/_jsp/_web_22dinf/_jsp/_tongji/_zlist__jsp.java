/*
 * JSP generated by Resin-4.0.23 (built Fri, 30 Sep 2011 09:31:50 PDT)
 */

package _jsp._web_22dinf._jsp._tongji;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _zlist__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = new TagState();

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_state.release();
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=UTF-8");
    com.caucho.jsp.IteratorLoopSupportTag _jsp_loop_1 = null;
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jsp_FormatDateTag_2 = null;

    out.write(_jsp_string0, 0, _jsp_string0.length);
    pageContext.include("/inc/header.jsp", false);out.write(_jsp_string1, 0, _jsp_string1.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string2, 0, _jsp_string2.length);
    _jsp_loop_1 = _jsp_state.get_jsp_loop_1(pageContext, _jsp_parent_tag);
    java.lang.Object _jsp_items_3 = _caucho_expr_1.evalObject(_jsp_env);
    java.util.Iterator _jsp_iter_3 = com.caucho.jstl.rt.CoreForEachTag.getIterator(_jsp_items_3);
    _jsp_loop_1.init(0, Integer.MAX_VALUE, 1, false, false, false);
    while (_jsp_iter_3.hasNext()) {
      Object _jsp_i_3 = _jsp_iter_3.next();
      _jsp_loop_1.setCurrent(_jsp_i_3, _jsp_iter_3.hasNext());
      pageContext.setAttribute("city", _jsp_i_3);
      out.write(_jsp_string3, 0, _jsp_string3.length);
      _caucho_expr_2.print(out, _jsp_env, false);
      out.write('"');
      if (_caucho_expr_3.evalBoolean(_jsp_env)) {
        out.write(_jsp_string4, 0, _jsp_string4.length);
      }
      out.write('>');
      _caucho_expr_4.print(out, _jsp_env, false);
      out.write(_jsp_string5, 0, _jsp_string5.length);
    }
    pageContext.pageSetOrRemove("city", null);
    out.write(_jsp_string6, 0, _jsp_string6.length);
    _jsp_loop_1 = _jsp_state.get_jsp_loop_1(pageContext, _jsp_parent_tag);
    java.lang.Object _jsp_items_4 = _caucho_expr_5.evalObject(_jsp_env);
    java.util.Iterator _jsp_iter_4 = com.caucho.jstl.rt.CoreForEachTag.getIterator(_jsp_items_4);
    _jsp_loop_1.init(0, Integer.MAX_VALUE, 1, false, false, false);
    while (_jsp_iter_4.hasNext()) {
      Object _jsp_i_4 = _jsp_iter_4.next();
      _jsp_loop_1.setCurrent(_jsp_i_4, _jsp_iter_4.hasNext());
      pageContext.setAttribute("brand", _jsp_i_4);
      out.write(_jsp_string7, 0, _jsp_string7.length);
      _caucho_expr_6.print(out, _jsp_env, false);
      out.write('"');
      if (_caucho_expr_7.evalBoolean(_jsp_env)) {
        out.write(_jsp_string4, 0, _jsp_string4.length);
      }
      out.write(_jsp_string8, 0, _jsp_string8.length);
      _caucho_expr_8.print(out, _jsp_env, false);
      out.write('-');
      _caucho_expr_9.print(out, _jsp_env, false);
      out.write(_jsp_string9, 0, _jsp_string9.length);
    }
    pageContext.pageSetOrRemove("brand", null);
    out.write(_jsp_string10, 0, _jsp_string10.length);
    if (_caucho_expr_10.evalBoolean(_jsp_env)) {
      out.write(_jsp_string4, 0, _jsp_string4.length);
    }
    out.write(_jsp_string11, 0, _jsp_string11.length);
    if (_caucho_expr_11.evalBoolean(_jsp_env)) {
      out.write(_jsp_string4, 0, _jsp_string4.length);
    }
    out.write(_jsp_string12, 0, _jsp_string12.length);
    _jsp_FormatDateTag_2 = _jsp_state.get_jsp_FormatDateTag_2(pageContext, _jsp_parent_tag);
    _jsp_FormatDateTag_2.setValue((java.util.Date) _caucho_expr_12.evalObject(_jsp_env));
    _jsp_FormatDateTag_2.doEndTag();
    out.write(_jsp_string13, 0, _jsp_string13.length);
    _jsp_FormatDateTag_2.setValue((java.util.Date) _caucho_expr_13.evalObject(_jsp_env));
    _jsp_FormatDateTag_2.doEndTag();
    out.write(_jsp_string14, 0, _jsp_string14.length);
    if (_caucho_expr_14.evalBoolean(_jsp_env)) {
      out.write(_jsp_string15, 0, _jsp_string15.length);
    }
    out.write(_jsp_string16, 0, _jsp_string16.length);
    _jsp_loop_1 = _jsp_state.get_jsp_loop_1(pageContext, _jsp_parent_tag);
    java.lang.Object _jsp_items_13 = _caucho_expr_15.evalObject(_jsp_env);
    java.util.Iterator _jsp_iter_13 = com.caucho.jstl.rt.CoreForEachTag.getIterator(_jsp_items_13);
    _jsp_loop_1.init(0, Integer.MAX_VALUE, 1, false, false, false);
    while (_jsp_iter_13.hasNext()) {
      Object _jsp_i_13 = _jsp_iter_13.next();
      _jsp_loop_1.setCurrent(_jsp_i_13, _jsp_iter_13.hasNext());
      pageContext.setAttribute("rate", _jsp_i_13);
      out.write(_jsp_string17, 0, _jsp_string17.length);
      _caucho_expr_16.print(out, _jsp_env, false);
      out.write(_jsp_string18, 0, _jsp_string18.length);
      _caucho_expr_17.print(out, _jsp_env, false);
      out.write(_jsp_string19, 0, _jsp_string19.length);
      if (_caucho_expr_14.evalBoolean(_jsp_env)) {
        out.write(_jsp_string20, 0, _jsp_string20.length);
        _caucho_expr_18.print(out, _jsp_env, false);
        out.write(_jsp_string18, 0, _jsp_string18.length);
        _caucho_expr_19.print(out, _jsp_env, false);
        out.write(_jsp_string18, 0, _jsp_string18.length);
        _caucho_expr_20.print(out, _jsp_env, false);
        out.write(_jsp_string21, 0, _jsp_string21.length);
      }
      out.write(_jsp_string22, 0, _jsp_string22.length);
      _caucho_expr_21.print(out, _jsp_env, false);
      out.write(_jsp_string23, 0, _jsp_string23.length);
      _caucho_expr_22.print(out, _jsp_env, false);
      out.write(_jsp_string23, 0, _jsp_string23.length);
      _caucho_expr_23.print(out, _jsp_env, false);
      out.write(_jsp_string24, 0, _jsp_string24.length);
      _caucho_expr_24.print(out, _jsp_env, false);
      out.write(_jsp_string25, 0, _jsp_string25.length);
    }
    pageContext.pageSetOrRemove("rate", null);
    out.write(_jsp_string26, 0, _jsp_string26.length);
    if (_caucho_expr_14.evalBoolean(_jsp_env)) {
      out.write(_jsp_string27, 0, _jsp_string27.length);
      pageContext.include("/WEB-INF/snippets/page.jsp", false);out.write(_jsp_string28, 0, _jsp_string28.length);
    }
    out.write('\n');
    if (_caucho_expr_25.evalBoolean(_jsp_env)) {
      out.write(_jsp_string27, 0, _jsp_string27.length);
      pageContext.include("/WEB-INF/snippets/page1.jsp", false);out.write(_jsp_string28, 0, _jsp_string28.length);
    }
    out.write(_jsp_string29, 0, _jsp_string29.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -1793038186146849453L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/jsp/tongji/zlist.jsp"), 9184266453989331057L, false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(mergePath.lookup("jar:file:/F:/workspace/Console/src/main/webapp/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld"), 7849922606946648492L, false);
    _caucho_depends.add(depend);
    _caucho_depends.add(new com.caucho.make.ClassDependency("org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag", 7844905413159918656L));
  }

  static {
    try {
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  final static class TagState {
    private com.caucho.jsp.IteratorLoopSupportTag _jsp_loop_1;

    final com.caucho.jsp.IteratorLoopSupportTag get_jsp_loop_1(PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jsp_parent_tag) throws Throwable
    {
      if (_jsp_loop_1 == null) {
        _jsp_loop_1 = new com.caucho.jsp.IteratorLoopSupportTag();
        _jsp_loop_1.setParent((javax.servlet.jsp.tagext.Tag) null);
      }

      return _jsp_loop_1;
    }
    private org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jsp_FormatDateTag_2;

    final org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag get_jsp_FormatDateTag_2(PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jsp_parent_tag) throws Throwable
    {
      if (_jsp_FormatDateTag_2 == null) {
        _jsp_FormatDateTag_2 = new org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag();
        _jsp_FormatDateTag_2.setPageContext(pageContext);
        if (_jsp_parent_tag instanceof javax.servlet.jsp.tagext.Tag)
          _jsp_FormatDateTag_2.setParent((javax.servlet.jsp.tagext.Tag) _jsp_parent_tag);
        else if (_jsp_parent_tag instanceof javax.servlet.jsp.tagext.SimpleTag)
          _jsp_FormatDateTag_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jsp_parent_tag));
        else
          _jsp_FormatDateTag_2.setParent((javax.servlet.jsp.tagext.Tag) null);
        _jsp_FormatDateTag_2.setPattern("yyyy-MM-dd");
      }

      return _jsp_FormatDateTag_2;
    }

    void release()
    {
      if (_jsp_FormatDateTag_2 != null)
        _jsp_FormatDateTag_2.release();
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jsp/jstl/core");
      manager.addTaglibFunctions(_jsp_functionMap, "fmt", "http://java.sun.com/jsp/jstl/fmt");
      manager.addTaglibFunctions(_jsp_functionMap, "func", "/WEB-INF/func.tld");
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
      _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${styleId}");
      _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${citys}");
      _caucho_expr_2 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${city.value.id}");
      _caucho_expr_3 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${city.value.id==cityId}");
      _caucho_expr_4 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${city.value.orderName}");
      _caucho_expr_5 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${brands}");
      _caucho_expr_6 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${brand.id}");
      _caucho_expr_7 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${brand.id==brandName}");
      _caucho_expr_8 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${brand.typepinyI}");
      _caucho_expr_9 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${brand.name}");
      _caucho_expr_10 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${pagetype==200}");
      _caucho_expr_11 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${pagetype==300}");
      _caucho_expr_12 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${starttime}");
      _caucho_expr_13 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${endtime}");
      _caucho_expr_14 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${flag==1}");
      _caucho_expr_15 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${rate}");
      _caucho_expr_16 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${rate.date}");
      _caucho_expr_17 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${func:getallCity(rate.cityId)}");
      _caucho_expr_18 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${func:getallBrand(rate.brandId)}");
      _caucho_expr_19 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${func:getallStyle(rate.styleId)}");
      _caucho_expr_20 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${func:getPageType(rate.pageType)}");
      _caucho_expr_21 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${rate.pv}");
      _caucho_expr_22 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${rate.uv}");
      _caucho_expr_23 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${rate.rate}");
      _caucho_expr_24 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${rate.applyNumber}");
      _caucho_expr_25 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${flag==null}");
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;
  private static com.caucho.el.Expr _caucho_expr_2;
  private static com.caucho.el.Expr _caucho_expr_3;
  private static com.caucho.el.Expr _caucho_expr_4;
  private static com.caucho.el.Expr _caucho_expr_5;
  private static com.caucho.el.Expr _caucho_expr_6;
  private static com.caucho.el.Expr _caucho_expr_7;
  private static com.caucho.el.Expr _caucho_expr_8;
  private static com.caucho.el.Expr _caucho_expr_9;
  private static com.caucho.el.Expr _caucho_expr_10;
  private static com.caucho.el.Expr _caucho_expr_11;
  private static com.caucho.el.Expr _caucho_expr_12;
  private static com.caucho.el.Expr _caucho_expr_13;
  private static com.caucho.el.Expr _caucho_expr_14;
  private static com.caucho.el.Expr _caucho_expr_15;
  private static com.caucho.el.Expr _caucho_expr_16;
  private static com.caucho.el.Expr _caucho_expr_17;
  private static com.caucho.el.Expr _caucho_expr_18;
  private static com.caucho.el.Expr _caucho_expr_19;
  private static com.caucho.el.Expr _caucho_expr_20;
  private static com.caucho.el.Expr _caucho_expr_21;
  private static com.caucho.el.Expr _caucho_expr_22;
  private static com.caucho.el.Expr _caucho_expr_23;
  private static com.caucho.el.Expr _caucho_expr_24;
  private static com.caucho.el.Expr _caucho_expr_25;

  private final static char []_jsp_string7;
  private final static char []_jsp_string8;
  private final static char []_jsp_string10;
  private final static char []_jsp_string6;
  private final static char []_jsp_string29;
  private final static char []_jsp_string25;
  private final static char []_jsp_string13;
  private final static char []_jsp_string21;
  private final static char []_jsp_string5;
  private final static char []_jsp_string11;
  private final static char []_jsp_string20;
  private final static char []_jsp_string26;
  private final static char []_jsp_string0;
  private final static char []_jsp_string14;
  private final static char []_jsp_string1;
  private final static char []_jsp_string15;
  private final static char []_jsp_string18;
  private final static char []_jsp_string27;
  private final static char []_jsp_string17;
  private final static char []_jsp_string2;
  private final static char []_jsp_string23;
  private final static char []_jsp_string28;
  private final static char []_jsp_string4;
  private final static char []_jsp_string24;
  private final static char []_jsp_string12;
  private final static char []_jsp_string9;
  private final static char []_jsp_string19;
  private final static char []_jsp_string16;
  private final static char []_jsp_string3;
  private final static char []_jsp_string22;
  static {
    _jsp_string7 = "\n							<option value=\"".toCharArray();
    _jsp_string8 = " >".toCharArray();
    _jsp_string10 = "\n					</select>\n          		</label>\n          		<label class=\"pr15\">\u9009\u62e9\u8f66\u578b:\n					<select name=\"styleId\" name='pppid' id='muio'>\n						<option value=\"\">\u8bf7\u9009\u62e9</option>\n					</select>\n          		</label>\n          		<label class=\"pr15\">\u9875\u9762\u7c7b\u578b:\n          		<select name=\"pageType\" id=\"pageType\">\n          		<option value=\"\">\u8bf7\u9009\u62e9</option>\n          		<option value=\"200\" ".toCharArray();
    _jsp_string6 = "\n          		</select>\n          		</label>\n          		<label class=\"pr15\">\u9009\u62e9\u54c1\u724c:\n          			<select name=\"brandName\" onchange=\"getStylemy(this.options[this.options.selectedIndex].value)\" id=\"brandName\">\n						<option value=\"\">\u8bf7\u9009\u62e9</option>\n						".toCharArray();
    _jsp_string29 = "\n</form>\n<script type=\"text/javascript\">\n$('.querytime').live(\"click\",function() {\n	WdatePicker({\n	isShowClear:false,\n	qsEnabled:false,\n	dateFmt:'yyyy-MM-dd'\n	});\n	});\n	function downExcel(){\n		$(\"#downexcel\").attr('action',\"/apply/downloadRate\");\n		$(\"#downexcel\").submit();\n		$(\"#downexcel\").attr('action',\"/apply/zlist\");\n	}\n	function selectAll(){\n		var brand=$(\"#brandName\").val();\n		var pageType=$(\"#pageType\").val();\n		if(brand!=\"\"){\n			alert(\"\u5bf9\u4e0d\u8d77\uff0c\u6c47\u603b\u6682\u4e0d\u652f\u6301\u54c1\u724c\u6c47\u603b\");\n			return;\n		}\n		if(pageType!=\"\"){\n			alert(\"\u5bf9\u4e0d\u8d77\uff0c\u6c47\u603b\u6682\u4e0d\u652f\u6301\u9875\u9762\u7c7b\u578b\u6c47\u603b\");\n			return;\n		}\n		$(\"#downexcel\").attr('action',\"/apply/zzlist\");\n		$(\"#downexcel\").submit();\n		$(\"#downexcel\").attr('action',\"/apply/zlist\");\n	}\n	function downAllExcel(){\n		var brand=$(\"#brandName\").val();\n		var pageType=$(\"#pageType\").val();\n		if(brand!=\"\"){\n			alert(\"\u5bf9\u4e0d\u8d77\uff0c\u6c47\u603b\u6682\u4e0d\u652f\u6301\u54c1\u724c\u6c47\u603b\");\n			return;\n		}\n		if(pageType!=\"\"){\n			alert(\"\u5bf9\u4e0d\u8d77\uff0c\u6c47\u603b\u6682\u4e0d\u652f\u6301\u9875\u9762\u7c7b\u578b\u6c47\u603b\");\n			return;\n		}\n		$(\"#downexcel\").attr('action',\"/apply/downloadRateAll\");\n		$(\"#downexcel\").submit();\n		$(\"#downexcel\").attr('action',\"/apply/zlist\");\n	}\n</script>\n<script type=\"text/javascript\">\n$(document).ready(function(){ \n	var pid=$(\"#brandName\").val();\n	if(pid!=null && \"\"!=pid){\n		 $(\"#muio option\").remove();\n		 $.ajax({\n			   type: \"POST\",\n			   url: \"/json/carstyle/ajaxStyle\",\n			   dataType:'json',\n			   data: {\n				   'brandID':pid\n			   },\n			   success: function(data){\n				 $(\"#muio\").val(\"\");\n				 $(\"#muio\").append(\"<option value=''>\u8bf7\u9009\u62e9</option>\");\n				   for(i in data) {\n				   		if(data[i].id==$(\"#styleId\").val()){\n				   			$(\"#muio\").append(\"<option  selected='selected'  value=\"+data[i].id+\">\"+data[i].style+\"</option>\");\n				   		}else{\n				   			$(\"#muio\").append(\"<option  value=\"+data[i].id+\">\"+data[i].style+\"</option>\");\n				   		}\n				   }\n				   } \n			\n			});\n	}\n	\u3000\u3000}); \nfunction getStylemy(pid){\n	 $(\"#muio option\").remove();\n	 if($(\"#brandName\").val()!=null&&\"\"!=$(\"#brandName\").val()){\n	 $.ajax({\n		   type: \"POST\",\n		   url: \"/json/carstyle/ajaxStyle\",\n		   dataType:'json',\n		   data: {\n			   'brandID':pid\n		   },\n		   success: function(data){\n			 $(\"#muio\").val(\"\");\n			 $(\"#muio\").append(\"<option value=''>\u8bf7\u9009\u62e9</option>\");\n			   for(i in data) {\n				   /* alert(data[i].style+\"\u540d\");\n			   		alert(data[i].id); */\n			   		$(\"#muio\").append(\"<option value=\"+data[i].id+\">\"+data[i].style+\"</option>\");\n			   }\n				  \n			   } \n		\n		});\n	 }\n}\n</script>\n</body>\n</html>".toCharArray();
    _jsp_string25 = "&nbsp;&nbsp;&nbsp;\u4eba</td>\n						</tr>\n						".toCharArray();
    _jsp_string13 = "\" readonly=\"readonly\" autocomplete=\"off\" />\n                      	</div>-\n                      	<div class=\"input-prepend\">\n                      		<span class=\"add-on\"><i class=\"icon-calendar\"></i></span>\n                      		<input type='text' name='endtime' class=\"querytime span2\" value=\"".toCharArray();
    _jsp_string21 = "</td>	\n		  					".toCharArray();
    _jsp_string5 = "</option>\n          		".toCharArray();
    _jsp_string11 = ">\u54c1\u724c\u5e95\u5c42\u9875</option>\n          		<option value=\"300\" ".toCharArray();
    _jsp_string20 = "\n		  					<td>".toCharArray();
    _jsp_string26 = "\n	          	</tbody>\n	          </table>\n	     </div>\n	</div>\n</div>\n".toCharArray();
    _jsp_string0 = "\n\n\n\n".toCharArray();
    _jsp_string14 = "\" readonly=\"readonly\" autocomplete=\"off\" />\n                      	</div>\n          		</label>\n          		<input type=\"submit\" value=\"\u67e5\u8be2\" class=\"btn btn-info\"/>&nbsp;&nbsp;\n          		<a  class=\"btn btn-info\" id=\"download\" onclick='downExcel()'>\u4e0b\u8f7d\u8be6\u7ec6</a>\n          		<input type=\"button\" value=\"\u67e5\u8be2\u6c47\u603b\" class=\"btn btn-info\" onclick='selectAll()'/>&nbsp;&nbsp;\n          		<a  class=\"btn btn-info\" id=\"download\" onclick='downAllExcel()'>\u4e0b\u8f7d\u6c47\u603b</a>\n          	</div>\n         </div>\n	</div>\n	<div class=\"rb-con\">\n		<div class=\"over-auto\">\n			<table class=\"table table-bordered chargeTable\">\n				<thead>\n					<tr style=\"background:none repeat scroll 0 0 #E8F1FD\">\n						<th>\u65e5\u671f</th>\n						<th>\u57ce\u5e02</th>\n						".toCharArray();
    _jsp_string1 = "\n<title>\u7ad9\u70b9\u62a5\u540d\u67e5\u8be2</title>\n</head>\n<body>\n<form method=\"post\" action=\"/apply/zlist\" id='downexcel' name='downexcel'>\n<div id=\"man_zone\">\n	<div>\n		<div class=\"b-con a-form\">\n			<input type=\"hidden\" id='styleId' value='".toCharArray();
    _jsp_string15 = "\n						<th>\u54c1\u724c</th>\n						<th>\u8f66\u578b</th>\n						<th>\u9875\u9762\u7c7b\u578b</th>\n						".toCharArray();
    _jsp_string18 = "</td>\n		  					<td>".toCharArray();
    _jsp_string27 = "\n<div class=\"page_and_btn\" style=\"text-align:center;\">\n   ".toCharArray();
    _jsp_string17 = "\n						<tr style=\"background:none repeat scroll 0 0 #E8F1FD\">\n							<td>".toCharArray();
    _jsp_string2 = "'/>\n          	<div class=\"pd5\">\n          		<label class=\"pr15\">\u9009\u62e9\u57ce\u5e02:\n          		<select name=\"cityId\" id=\"cityId\">\n          		<option value=\"\">\u8bf7\u9009\u62e9</option>\n          		".toCharArray();
    _jsp_string23 = "</td>\n							<td>".toCharArray();
    _jsp_string28 = "\n</div>\n".toCharArray();
    _jsp_string4 = "selected='selected'".toCharArray();
    _jsp_string24 = "</td>\n							<td style='text-align:right'>".toCharArray();
    _jsp_string12 = ">\u8f66\u578b\u5e95\u5c42\u9875</option>\n          		</select>\n          		</label>\n          		<label class=\"pr15\">\n          			\u65e5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\u671f:\n          			<div class=\"input-prepend\">\n                      		<span class=\"add-on\"><i class=\"icon-calendar\"></i></span>\n                      		<input type='text' name='starttime' class=\"querytime span2\" value=\"".toCharArray();
    _jsp_string9 = "</option>\n						".toCharArray();
    _jsp_string19 = "</td>\n		  					".toCharArray();
    _jsp_string16 = "\n						<th>pv</th>\n						<th>uv</th>\n						<th>\u8f6c\u5316\u7387(%)</th>\n						<th>\u62a5\u540d\u6570</th>\n					</tr>\n	          	</thead>\n	          	<tbody>\n						".toCharArray();
    _jsp_string3 = "\n          		<option value=\"".toCharArray();
    _jsp_string22 = "\n							<td>".toCharArray();
  }
}