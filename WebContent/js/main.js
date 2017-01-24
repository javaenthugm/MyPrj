$(document).ready(function () {
	var $users = $('#users');
    $.ajax({
        type : 'GET',
        //url: 'http://localhost:9080/MyPrj/getUsers.do',
        url: 'getUsers.do',
        success:function(users){
        	console.log(users);        	
        	//$.each(JSON.parse(users), function(idx, obj) {
        	$.each($.parseJSON(users), function(idx, obj) {
        		$users.append('<li>'+obj.firstname+','+obj.nickname+'</li>');
        	});
        }
        
    });
    
    $(".blue").on("click",function(){
    	$("#panel1").toggle();
    	$("#panel2").hide();
    });
});