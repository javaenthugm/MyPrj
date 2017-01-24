<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
	<!-- META -->
	<title>Activity Tracker - Welcome page</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<meta name="description" content="" />
	
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="css/kickstart.css" media="all" />
	<link rel="stylesheet" type="text/css" href="css/style.css" media="all" /> 
	
	<!-- Javascript -->
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

	
</head>
<body>
<h2>${message}</h2>    
<div class="container">
	            <div id="panel1" class="panel"> 
                    <div class="panel-body">
                        <form class="vertical" >
                            <div class="col_3">
                            </div>
                            <div class="col_3">
                                 <!-- FirstName-->
                                <label for="userid">User Id</label>
                                <input id="userid" type="text" />
                                <!-- LastName -->
                                <label for="password">Password</label>
                                <input id="password" type="password"/>
                                 <button type="submit">Submit</button>
                            </div>  
                            <div class="col_3">
                            </div>             
                        </form>
                    </div>
                </div>
               
</div> <!-- End Container -->
<script type="text/javascript" src="js/kickstart.js"></script>
<script type="text/javascript" src="js/main.js"></script>

</body>
</html>