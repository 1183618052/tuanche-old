<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib  uri="/WEB-INF/func.tld"  prefix="func"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>团车网二手车车型管理</title>
<script type="text/javascript" src="/js/common/jquery.js"></script>
<script type="text/javascript" src="/js/usedCarstyle.js"></script>
<link type="text/css" rel="stylesheet" href="/css/base.css" />
<link type="text/css" rel="stylesheet" href="/css/common.css" />
<link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css" />
<link type="text/css" rel="stylesheet" href="/css/common/tipsy.css"/>
<link type="text/css" rel="stylesheet" href="/css/layout.css"/>
</head>
<body>
<form action="<c:if test="${obj==null }">/used/add</c:if><c:if test="${obj!=null }">/used/update</c:if>" 
	method="post" style="padding:0 10px 0 10px;margin-top:0px;" id="usedCarstyle" class="formCar">
	<div id="tabs" class="tabs">  
		<ul>
			<li  style="background:url(/images/ui-bg_glass_75_e6e6e6_1x400.png) #e6e6e6 repeat-x 50% 50%"><a href="/used/toListFtype">二手车车型列表</a></li>
			<li class="tabs_active" ><a href="/used/toAdd?modelstr=type">添加二手车车型</a></li>
		</ul>
   </div>
   <input type="hidden" name="id" value="${obj.id }" id="objId"/>
   <input type="hidden" name="modelstr" value="type">
   <table>
   		<tr>
   			<td>所属品牌:</td>
   			<td>
   				<select name="bid" class="selectBrand">
   					<c:forEach items="${brands }" var="brand">
   						<option value="${brand.id }" <c:if test="${obj.bid== brand.id}">selected</c:if>>${brand.typepinyI }${brand.name }</option>
   					</c:forEach>
   				</select>
   			</td>
   		</tr>
   		<tr>
   			<td>关联新车车型:</td>
   			<td>
   				<select name="rid" id="rid">
   					<option value="">请选择</option>
   					<c:forEach items="${rList }" var="robj">
   						<option value="${robj.id }" <c:if test="${robj.id==obj.rid }">selected</c:if>>${robj.style }</option>
   					</c:forEach>
   				</select>
   			</td>
   		</tr>
   		<tr>
   			<td>二手车型</td>
   			<td>
   				<input type="text" name="cname" id="cname" value="${obj.cname }"/>
   			</td>
   		</tr>
   		<tr>
   			<td></td>
   			<td>
   				<input type="button" value="保存" id="saveBut"  class="btn btn-info" />
   			</td>
   		</tr>
   </table>	
</form>
<div id="menuContent" style="display:none; position: absolute;" >
	<ul id="treeCity" class="ztree"  ></ul>
</div>

<div id="menuContentClass" style="display:none; position: absolute;" >
	<ul id="treeClass" class="ztree"  ></ul>
</div>
<div id="menuContentselectCarStyle" style="display:none; position: absolute;" >
	<ul id="treeselectCarStyle" class="ztree"  ></ul>
</div>
</body>
</html>