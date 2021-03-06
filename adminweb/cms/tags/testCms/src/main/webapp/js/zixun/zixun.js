 
function searchforZixun(){
	if($("#zixunId").val()==""){
		//$("#zixunId").val(0);
	}
	$('#searchZixunForm').submit();
}

function selectAll(){
	$("#dataBody input[type='checkbox']").attr("checked",$("#allSelect").attr("checked")?true:false)
}

function batchUpdate(status){
	var  datas = "";
	var ids = $("input[name='idBox']:checked");
	if(ids.length==0){
		alert("未选中任何行！");
		return;
	}
	var tip = "确认"
		tip+= status==-1?"删除":(status==0?"取消发布":"发布");
	tip+="?";
	if(!confirm(tip)){
		return;
	}
	
	var acUrl  = "/zixun/";
	if(status==-1){
		acUrl += "delZixun";
	}else {
		acUrl += "deployZixun";
		datas += "type="+(status==1?"true":"false");
	}
	
	for(var i =0 ;i<ids.length; i++){
		datas+= ("&id="+$(ids[i]).val());
	}
	
	$.ajax({
		url:acUrl,
		data:datas,
		type:'POST',
		dataType:'text',
		success:function(data){
			window.location.href = "/zixun/home?page.pageNo="+$("#currentNo").val();
		}
	})
}

function remoteData(url,param){
	$.ajax({
		type:'POST',
		url:url,
		data:param,
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		dataType:'text',
		async:false,
		success:function(data){
			return data;
		}
	})
}

var setting = {
			async: {
				enable: true,
				url:"/local/ajax/zone"
			},
			view: {
				dblClickExpand: false
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				beforeClick: citybeforeClick,
				onClick: cityonClick
			}
		};

function citybeforeClick(treeId, treeNode) {
	var check = (treeNode && !treeNode.isParent || treeNode.id==-1);
	return check;
}

function cityonClick(e, treeId, treeNode) {

	$("#cityId").val(treeNode.id);
	$("#city").val(treeNode.name);
	
	$("#classId").val("");
	$("#classIdh").val(0);
	
	hideMenu();
}
function hiddenNode(tree){
	var zTreeobj = $.fn.zTree.getZTreeObj(tree);
	var nodes = zTreeobj.transformToArray(zTreeobj.getNodes());
	for(node in nodes){
		var no = nodes[node];
		if(no.level && no.level==1 &&!no.isParent){
			zTreeobj.hideNode(no);
		}
	}
}

function showMenu() {
	hiddenNode("treeCity");
	var cityObj = $("#city");
	var cityOffset = $("#city").offset();
	$("#menuContent").css({left:cityOffset.left + "px", top:cityOffset.top + cityObj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDown);
}

function hideMenu() {
	$("#menuContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDown);
}

function onBodyDown(event) {
	if (!(event.target.id == "city" || event.target.id == "menuContent" || $(event.target).parents("#menuContent").length>0)) {
		hideMenu();
	}
}



var settingclass = {
			async: {
				enable: true,
				url:"/local/ajax/class"
			},
			view: {
				dblClickExpand: false
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				beforeClick: classbeforeClick,
				onClick: classonClick
			}
		};


function classbeforeClick(treeId, treeNode) {
	return true;
}

function classonClick(e, treeId, treeNode) {
	$("#classId").val(treeNode.name);
	$("#classIdh").val(treeNode.id);
	classhideMenu();
}

function classshowMenu() {
	
	var zTreeobj = $.fn.zTree.getZTreeObj("treeClass");
	var nodes = zTreeobj.transformToArray(zTreeobj.getNodes());
	
	
	var isAll = $("#cityId").val()<1;
	for(var node in nodes){
		
		zTreeobj.showNode(nodes[node]);
		
//		if(nodes[node].status==0&&nodes[node].id>0){
//			zTreeobj.hideNode(nodes[node]);
//		}
		
		if(isAll){
			if(nodes[node].cityAttr==1){
				zTreeobj.hideNode(nodes[node]);
			}
		}else{
			if(nodes[node].id==0){
				continue;
			}
			if(nodes[node].cityAttr==0){
				zTreeobj.hideNode(nodes[node]);
			}
		}
	}
	
	var cityObj = $("#classId");
	var cityOffset = $("#classId").offset();
	$("#menuContentClass").css({left:cityOffset.left + "px", top:cityOffset.top + cityObj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", classonBodyDown);
}

function classhideMenu() {
	$("#menuContentClass").fadeOut("fast");
	$("body").unbind("mousedown", classonBodyDown);
}

function classonBodyDown(event) {
	if (!(event.target.id == "menuContentClass" || $(event.target).parents("#menuContentClass").length>0)) {
		classhideMenu();
	}
}


var settingselectCarStyle = {
		async: {
			enable: true,
			url:"/local/ajax/carstyles"
		},
		view: {
			dblClickExpand: false
		},
		data: {
			simpleData: {
				enable: true
			}
		},
		callback: {
			beforeClick: selectCarStylebeforeClick,
			onClick: selectCarStyleonClick
		}
	};

function selectCarStyleshow() {
	hiddenNode("treeselectCarStyle");
	var cityObj = $("#selectCarStyle");
	var cityOffset = $("#selectCarStyle").offset();
	$("#menuContentselectCarStyle").css({left:cityOffset.left + "px", top:cityOffset.top + cityObj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", selectCarStyleonBodyDown);
}

function selectCarStylebeforeClick(treeId, treeNode) {
	if(treeNode.level && treeNode.level==1){
		return false;
	}
	var zTree = $.fn.zTree.getZTreeObj("treeselectCarStyle");
	var nodes = zTree.getSelectedNodes();
	if(nodes.length>4){
		return false;
	}
	return true;
}

function selectCarStyleonClick(e, treeId, treeNode) {
	
	var zTree = $.fn.zTree.getZTreeObj("treeselectCarStyle");
	var nodes = zTree.getSelectedNodes();
	var bv ="";
	var bid="";
	var sv ="";
	var sid ="";
	
	nodes.sort(function compare(a,b){return a.id-b.id;});
	
	for (var i=0, l=nodes.length; i<l; i++) {
			var node = nodes[i];
			if(node.pId>0){
				sv+=node.name+",";
				sid+=node.id+",";
			}else{
				bv+=node.name+",";
				bid+=node.id+",";
			}
			
	}
	
	var v = bv+sv;
	 v = v.substring(0,v.length-1);
	$("#selectCarStyle").val(v);
	$("#brindId").val(bid);
	$("#styleId").val(sid);
	
}


function selectCarStylehideMenu() {
$("#menuContentselectCarStyle").fadeOut("fast");
$("body").unbind("mousedown", selectCarStyleonBodyDown);
}

function selectCarStyleonBodyDown(event) {
if (!(event.target.id == "menuContentselectCarStyle" || $(event.target).parents("#menuContentselectCarStyle").length>0)) {
	selectCarStylehideMenu();
}
}


$(document).ready(function(){
			$.fn.zTree.init($("#treeCity"), setting);
			$.fn.zTree.init($("#treeClass"), settingclass);
			$.fn.zTree.init($("#treeselectCarStyle"), settingselectCarStyle);
			$("#listPicFile").live("change",function(){
				  upload();
			});
});

function upload(){
	if(!checkImg()){
		return;
	}
	$.ajaxFileUpload({
		url:"/zixun/uploadImg",
		secureuri:false,
		async:true,
		fileElementId:'listPicFile',
		dataType: 'text',				
		success: function (data){
			if(isNaN(data)){//成功
				$("#listPic").val(data.trim());
				$("#listImage").attr("src","http://pic.tuanche.com/zixun/"+data.trim()+"_s.jpg"+"?"+Math.random());
				
				setTimeout(function(){
					$("#listImage").attr("src","http://pic.tuanche.com/zixun/"+data.trim()+"_s.jpg"+"?"+Math.random());
				} ,1000)
				
			}else{
				alert("上传失败");
			}
		},
		error: function (data, status, e){
			alert(e);
		}
	});
}

//检查文件格式
function checkImg(){
	//$("#imgMsg").text('');//清空错误信息
	var fileName = $("#listPicFile").val(), //文件名称
	fileType=["jpg","png","gif","bmp"], //图片类型
	fileExt = ""; //图片拓展名
	fileExt = fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase();
	for(var i in fileType){
		if(fileExt==fileType[i]){
			return true;
		}
	}
	return false;
}


function checkNewZixunProperties(){
	var zixunTitle = $('#zixunTitle').val();
	var keyword = $('#keyword').val();
	var description = $('#description').val();
	editor.sync();
	if(zixunTitle == '' || ( editor && editor.getContent()=="") || $("#classIdh").val()=="" || $("#classIdh").val()==0) {
		$('#errMsg').html('请填写所有信息');
		return;
	}
	//alert($("#newZixunPropertiesForm").serialize());
	$("#newZixunPropertiesForm").submit();
}

function saveZixunProperties(){
	var zixunTitle = $('#zixunTitle').val();
	var keyword = $('#keyword').val();
	var description = $('#description').val();
	editor.sync();
	if(zixunTitle == '' ||( editor && editor.getContent()=="") || $("#classIdh").val()=="" || $("#classIdh").val()==0 ) {
		$('#errMsg').html('请填写所有信息');
		return;
	}
	$("#newZixunPropertiesForm").attr("action", "/zixun/saveZixunProperties");
	$("#newZixunPropertiesForm").submit();
}


function preStep(id){
	$("#zixunForm").attr("action", "/zixun/getZixunProperties");
	$("#zixunForm").submit();
}

function saveZixun(newZixun){
	var hotWords = $(".hotWord");
	var hotWordUrls = $(".hotWordUrl");
	var hotWordsTxt = "";
	for(var i = 0; i < hotWords.length; i++) {
		hotWordsTxt += ($(hotWords[i]).val() + "||" + $(hotWordUrls[i]).val() + ",");
	}
	if($('#priceLowTxt').val() == '') {
		$('#priceLowTxt').val(0);
	}
	if($('#priceHighTxt').val() == '') {
		$('#priceHighTxt').val(0);
	}
	if($('#recordAll').attr('checked')) {
		$('#recordCount').val(0);
	}
	$("#hotWordsTxt").val(hotWordsTxt.substring(0, hotWordsTxt.length - 1));
	
		//$("#zixunForm").attr("action", "/zixun/saveZixun");
	
		$("#zixunForm").attr("action", "/zixun/saveZixunHouseInfo");
	
	
	$("#zixunForm").submit();
}


function setRecordCount(count) {
	if(count > 0) {
		$('#recordAll').attr('checked',false);
	}
}

function doSearchZixun() {
	var zixunId = $('#zixunId').val();
	if(zixunId == '') {
		$('#zixunId').val(0);
	} else if(isNaN(zixunId)) {
		alert("资讯编号必须是数字");
		return;
	}
	$('#searchZixunForm').attr('action', '/zixun/search');
	$('#searchZixunForm').submit();
}

function gotoLink(type) {
	$('#hyperlink').val(type);
	$('#zixunId').val(0);
	$('#searchZixunForm').attr('action', '/zixun/search');
	$('#searchZixunForm').submit();
}

function deployZixun(id, type) {
	$.ajax({
		type : "POST",
		async : false,
		url : "/zixun/deployZixun",
		data:{'id':id,'type':type},
		dataType : "text",
		success : function(data) {
			data = eval("("+ data+")")
			if(data.info)  {
				if(type){
					$('#deploy_cell_' + id).html("<a href='javascript:deployZixun("+id+", false)'>取消发布</a>");
					$("#status_td_"+id).html("已发布");
				} else {
					$('#deploy_cell_' + id).html("<a href='javascript:deployZixun("+id+", true)'>发布</a>");
					$("#status_td_"+id).html("待发布");
				}
			}
		}
	});
}

function delZixun(id) {
	var result = confirm("确定要删除该资讯吗？");
	if(result) {
		$.ajax({
			type : "POST",
			async : false,
			url : "/zixun/delZixun" ,
			data:{'id':id},
			dataType : "text",
			success : function(data) {
				data = eval("("+ data+")")
				if(data.info)  {
					$('#tr_' + id).remove();
				}
			}
		});
	}
}
function excel(){
	if($("#file").val()==''){
		alert("请选择上传的文件！");
		return false;
	}
	
	var str=$("#file").val();
	var pos=str.lastIndexOf(".");
	var lastname = str.substring(pos,str.length); 
	
	if(lastname!='.xls'){
		alert("文件格式不支持，请上传 xls 格式的文件");
		return false;
	}
		$("#searchZixunForm").attr("action","/zixun/excleBatchImport");
		$("#searchZixunForm").attr("method","post");
	
		$("#searchZixunForm").submit();
	
}