<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<base href="<%=basePath%>">
	<link rel="stylesheet" href="resource/bootstrap/css/bootstrap.min.css" >    
	<link rel="stylesheet" href="resource/bootstrap/css/bootstrap-theme.min.css">
	<script type="text/javascript" src="resource/lib/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="resource/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="resource/css/wukong-ui.css">
	<link rel="stylesheet" href="bootstrap/css/bootstrap-select.min.css">
    <script type="text/javascript" src="bootstrap/js/bootstrap-select.min.js"></script>
</head>

<body>
<div class="row">
    <div class="col-lg-12">
        <ul class="breadcrumb wk-breadcrumb">
            <li><a href="#">企业信息管理系统</a></li>
            <li><a href="#">日常管理</a></li>
            <li><a href="#">编辑部门日程</a></li>
        </ul>
    </div>
</div>
    
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default wk-panel ">
                <div class="panel-heading">
                    编辑部门日程 Create Data
                </div>
                <form action="<%=basePath%>/editDeptSchedule/${deptSchedule.id}.html" method="POST">
                <div class="panel-body">
                    <div class="row">
                      <div class="form-inline">  
                      
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">日程内容: </label>
                                 <div class="input-group">
                                    <input required="required" value="${deptSchedule.content}" name="content" type="text" class="form-control wk-long-2col-input" id="mark" placeholder="请输入日程内容"/>
                                </div>
                            </div>
                                
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">所属部门: </label>
                                <select class="wk-select" name="deptId">
                                    <c:forEach items="${depts}" var="var">
                                        <c:choose>
								          		<c:when test="${var.id == deptSchedule.deptId}">
								          			<option value="${var.id}" selected="selected">${var.name}</option>
								          		</c:when>
								          		<c:otherwise>
								          			<option value="${var.id}" >${var.name}</option>
								          		</c:otherwise>
								          	</c:choose>
                                    </c:forEach>
                                </select>
                            </div>
                            
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">工作地点: </label>
                                 <div class="input-group">
                                    <input required="required" value="${deptSchedule.position}" name="position" type="text" class="form-control wk-normal-input" id="mark" placeholder="请输入工作地点"/>
                                </div>
                             </div>
                            
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">开始时间: </label>
                                <div class="input-group">
                                    <input id="startDate" required="required" value="${deptSchedule.start}" name="startDate" type="date" class="form-control wk-normal-input" id="mark" placeholder="请输入开始时间"/>
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <label  class="control-label wk-filed-label">结束时间: </label>
                                <div class="input-group">
                                    <input required="required" value="${deptSchedule.end}" name="endDate" type="date" class="form-control wk-normal-input" id="mark" placeholder="请输入结束时间"/>
                                </div>
                            </div>
                            
                        </div>

                    </div>
                 </div>

                <div class="panel-footer wk-panel-footer">
                    <button type="submit" class="btn btn-default wk-btn">提&nbsp;&nbsp;交</button>
                </div>
                </form>
            </div>
        </div>
    </div>
    
    
</body>
</html>