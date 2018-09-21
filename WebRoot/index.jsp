<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'index.jsp' starting page</title>
	
  </head>
  
  <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.0.min.js"></script>
  <body>
   <input type="button" id="btn" value="click me" ></input>
    
    
    <script type="text/javascript">
    
   
    	$(function(){
    	
    	var params="username=张三"
    	
    	$("#btn").click(function(){
    		$.post("/ajax/jqueryajax",params,function(d){
    				alert(d);
    		})
    	});
    	})
    
    </script>
  </body>
</html>
