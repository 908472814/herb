<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电梯管理</title>
</head>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/angular.min.js"></script>
<script type="text/javascript" src="js/herb-jquery-rest.js"></script>
<script type="text/javascript">
var elevatorMgr = angular.module('elevatorMgr', []);
elevatorMgr.controller('elevatorMgrController', function($scope,$http) {
	var url = 'elevators';
	var elevatorType = ${elevatorType};
	var elevatorTypeArray=[];
	for(var key in elevatorType){
		var tmp = {};
		tmp['typeCode']=key;
		tmp['typeName']=elevatorType[key];
		elevatorTypeArray.push(tmp)
	}
	$scope.elevatorTypeArray=elevatorTypeArray;
	$http.get(url).success(function(response){
		$scope.elevators = response._embedded.elevators;
		$scope.elevatorType=elevatorType;
		$scope.go2Detail=function(url){
			alert(url.substring(url.length-1,url.length));
			alert(elevatorType);
		}
	});
	
	//提交
	$scope.submitElevator=function(){
		var elevatorReq = {
			      "createTime" : "2016-06-22T06:16:53.000+0000",
			      "updateTime" : "2016-06-22T06:17:00.000+0000",
			      "serialNum" : new Date().getMilliseconds(),
			      "elevatorType" : $scope.elevatorKind,
			      "dragMode" : 0,
			      "controlMode" : 0,
			      "elevatorFntClass" : 0,
			      "speed" : 0,
			      "ratedLoad" : 0,
			      "passengersNumber" : 0,
			      "registrationCode" : "0",
			      "runStatus" : 0,
			      "payStauts" : 0,
			      "onLineStatus" : 0,
			      "checkStatus" : 0,
			      "healthStatus" : 0,
			      "isPeopleTrapped" : false,
			      "longitude" : 0.0,
			      "latitude" : 0.0,
			      "x" : $scope.elevatorX,
			      "y" : $scope.elevatorY,
			      "addressDetail" : {
			        "id":1
			      },
			      "name" : $scope.elevatorNum+$scope.elevatorCode,
			      "floor" : 0,
			      "elevatorModel" : {
			        "id":"1"
			      },
			      "monitorDevice" : {
			        "id":$scope.monitorDev
			      },
			      "area" : {
					"id":5
			      }
			    };
		var url = 'elevators';
		postDate(elevatorReq,url,false,function(data) {
			$http.get(url).success(function(response){
				$scope.elevators = response._embedded.elevators;
				$scope.elevatorType=elevatorType;
				$scope.go2Detail=function(url){
					alert(url.substring(url.length-1,url.length));
					alert(elevatorType);
				}
			});
		});
	}
});

</script>
<body ng-app="elevatorMgr" ng-controller="elevatorMgrController">
	<input type="button" value="添加电梯"><br/>
	<table border="1">
		<thead>
			<tr>
				<th>电梯名称</th>
				<th>电梯类型</th>
				<th>X坐标</th>
				<th>Y坐标</th>
				<th>监控设备</th>
			</tr>
		</thead>
		<tbody>
			<tr ng-repeat="elevator in elevators">
				<td>{{elevator.name}}</td>
				<td>{{elevator.name}}</td>
				<td>{{elevator.x}}</td>
				<td>{{elevator.y}}</td>
				<td>{{elevator.monitorDevice.serialNum}}</td>
				<td>
					<a href="javascript:void(0)" ng-click='go2Detail(elevator._links.self.href)'>
						删除
					</a>
				</td>
			</tr>
		</tbody>
	</table>
	
	<div title="添加电梯">
		<form action="" method="post">
			<table border="1">
				<tr>
					<td>
						梯号：
					</td>
					<td>
						<input type="text" name="elevatorNum" ng-model="elevatorNum"/>
					</td>
					<td>
						编码:
					</td>
					<td>
						<input type="text" name="elevatorCode" ng-model="elevatorCode"/>
					</td>
				</tr>
				<tr>
					<td>
						电梯名称：
					</td>
					<td>
						{{elevatorNum}}{{elevatorCode}}
					</td>
					<td>
						类型:
					</td>
					<td>
						<select name="elevatorKind" ng-model="elevatorKind">
							<option ng-repeat="type in elevatorTypeArray" value="{{type.typeCode}}">{{type.typeName}}</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						X：
					</td>
					<td>
						<input type="text" name="elevatorName" ng-model="elevatorX"/>
					</td>
					<td>
						Y:
					</td>
					<td>
						<input type="text" name="elevatorName" ng-model="elevatorY"/>
					</td>
				</tr>
				<tr>
					<td>
						监控设备
					</td>
					<td colspan="3">
						<input type="text" name="monitorDev" ng-model="monitorDev" ng-change/>
						<div>
							<p></p><!-- ajax查询结果 -->
						</div>
					</td>
				</tr>
			</table>
		</form>
		<button ng-click="submitElevator()">提交</button>
	</div>
</body>
</html>