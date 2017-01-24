<!DOCTYPE html>
<html>
<head>
	<!-- META -->
	<title>Activity Tracker - Home page</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<meta name="description" content="" />
	
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="css/kickstart.css" media="all" />
	<link rel="stylesheet" type="text/css" href="css/style.css" media="all" /> 
	
	<!-- Javascript -->
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <!--<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
    <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>-->
	
</head>
<body>
    
<div class="container">
	<div class="jumbotron" >
        <h1>Activity Tracker</h1>
        <!-- Buttons w/Colors -->
        <button id="bluebtn" class="medium blue"><i class="fa fa-star"></i> Spring and Hiberate</button>
        <!--<a class="button orange" href=""><i class="fa fa-star"></i> jQuery</a>-->
        <button id="orangebtn" class="medium orange"><i class="fa fa-star"></i> jQuery</button>
        <button id="pinkbtn" class="medium pink"><i class="fa fa-star"></i> Node Js</button>
        <button id="greenbtn" class="medium green"><i class="fa fa-star"></i> D3</button>
        <button id="redbtn" class="medium red"><i class="fa fa-star"></i> HtmlKickStart</button>

    </div>
                <!-- style="border:1px solid blue;padding:10px;" -->
                <div id="panel1" class="panel"> 
                    <div class="panel-body">
                        <form class="vertical" >
                        <div class="col_4">
                                <ul id="users">
                                    
                                </ul>
                            </div>
                            <div class="col_4">
                                 <!-- FirstName-->
                                <label for="lfirstname">First Name</label>
                                <input id="firstname" type="text" />
                                <!-- LastName -->
                                <label for="llastname">Last Name</label>
                                <input id="lastname" type="text"/>
                                <!-- Nick Name -->
                                <label for="lnickname">Nick Name</label>
                                <input id="nickname" type="text" />
                                <!-- Date of Birth-->
                                <label for="ldob">Date of Birth <span class="right">A-Z, 0-9</span></label>
                                <input id="dob" type="text" />
                                
                            </div>               
                            
                            <div class="col_4">
                                <div class="notice error"><i class="fa fa-remove fa-large"></i> This is an Error Notice 
                                <a href="#close" class="fa fa-remove"></a></div>
                                <div class="notice warning"><i class="fa fa-warning fa-large"></i> This is a Warning Notice 
                                <a href="#close" class="fa fa-remove"></a></div>
                                <div class="notice success"><i class="fa fa-check fa-large"></i> This is a Success Notice 
                                <a href="#close" class="fa fa-remove"></a></div>

                                <label for="textarea1">TextArea</label>
                                <textarea id="textarea1" placeholder="Placeholder Text"></textarea>

                                <button type="submit">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>
                <div id="panel2" class="panel" style="border:1px solid orange;padding:10px;" > 
                    <ul id="tabsleft" class="tabs left">
                        <li><a href="#tabr1">Tab1</a></li>
                        <li><a href="#tabr2">Tab2</a></li>
                        <li><a href="#tabr3">Tab3</a></li>
                        <li><a href="#tabr4 ">Tab4</a></li>
                    </ul>

                        <div id="tabr1" class="tab-content">Tab1</div>
                        <div id="tabr2" class="tab-content">Tab2</div>
                        <div id="tabr3" class="tab-content">Tab3</div>
                        <div id="tabr4" class="tab-content">Tab4</div>
               </div>
</div> <!-- End Container -->
    
    <script type="text/javascript" src="js/kickstart.js"></script>
    <script type="text/javascript" src="js/main.js"></script>

</body>
</html>
