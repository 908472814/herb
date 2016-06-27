<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/angular.min.js"></script>
<script type="text/javascript" src="js/herb-jquery-rest.js"></script>
<script type="text/javascript" src="js/mqttws31.js"></script>


<script type="text/javascript">
var test = angular.module('test', []);
test.controller('testController', function($scope,$http){
	
	 	client = new Messaging.Client("127.0.0.1", 61614, "test2");

	    client.onMessageArrived = function(message){
	    	$.trigger("ng-click");
	    };
	    client.onConnectionLost = function(rsp){
	    	alert(rsp)
	    };            
		
	    client.connect({onSuccess:function(){
	    	client.subscribe("test");
	    	alert(2);
	    }, onFailure:function(){
	    	
	    }}); 
	    
	    $scope.msg=9999;
	    
	    $scope.ac = function(){
	    	alert(0);
	    }
});

</script>
<body>
	<div ng-app="test" ng-controller="testController" >
		<input type="text" value="" ng-model="msg" ng-click="ac()">
		<div>
			{{msg}}
		</div>
	</div>
</body>
</html>