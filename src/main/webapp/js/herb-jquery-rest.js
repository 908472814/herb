function postDate(data, url,isAsync,successCallback) {
	$.ajax({
		url : url,
		dataType : 'json',
		type : 'POST',
		async:isAsync,
		data : JSON.stringify(data),
		contentType : 'application/json',
		success : successCallback
	});
}

function getDate(url, callBack) {
	$.get(url, callBack);
}

function putDate(data, url, successCallback) {
	$.ajax({
		url : url,
		dataType : 'json',
		type : 'PUT',
		data : JSON.stringify(data),
		contentType : 'application/json',
		success : successCallback
	});
}

function deleteDate(url, successCallback) {
	$.ajax({
		url : url,
		dataType : 'json',
		type : 'DELETE',
		contentType : 'application/json',
		success : successCallback
	});
}