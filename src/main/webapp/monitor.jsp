<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>监控设备管理</title>
</head>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/angular.min.js"></script>
<script type="text/javascript" src="js/herb-jquery-rest.js"></script>
<script type="text/javascript">
var monitorDevMgr = angular.module('monitorDevMgr', []);
monitorDevMgr.controller('monitorDevMgrController', function($scope,$http) {
	$http.get("monitorDevices").success(function(response){
		$scope.monitorDeves = response._embedded.monitorDevices;
	});
	
	//提交
	$scope.submitMonitor=function(){
		var devReq = {
			      "createTime" : "2016-06-22T06:01:21.000+0000",
			      "updateTime" : "2016-06-22T06:01:24.000+0000",
			      "serialNum" : $scope.devSerialNum,
			      "version" : "0",
			      "softVersion" : "11",
			      "communicationMode" : "485",
			      "monitorDevModel" : {
			        "id":1
			      }};
		var url = 'monitorDevices';
		postDate(devReq,url,false,function(data) {
			$http.get("monitorDevices").success(function(response){
				$scope.monitorDeves = response._embedded.monitorDevices;
			});
		});
	}
});

</script>
<body ng-app="monitorDevMgr" ng-controller="monitorDevMgrController">
	<table border="1">
		<tr>
			<th>
				设备序列号
			</th>
			<th>
				485地址
			</th>
			<th>
				创建时间
			</th>
		</tr>
		<tr ng-repeat="dev in monitorDeves">
			<th>
				{{dev.serialNum}}
			</th>
			<th>
				{{dev.serialNum}}
			</th>
			<th>
				{{dev.createTime}}
			</th>
		</tr>
	</table>
	<table border="1">
		<tr>
			<td>设备序列号</td>
			<td><input type="text" name="devSerialNum" ng-model="devSerialNum"/></td>
		</tr>
		<tr>
			<td>485地址</td>
			<td><input type="text" name="attributes485" ng-model="attributes485"/></td>
		</tr>
	</table>
	<button ng-click="submitMonitor()">提交</button>
</body>
</html>