<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
        <link rel="icon" type="image/png" href="images/icon.png"/>
        <title>Go Bus !</title>
        <style>
            *{
                position: relative;
                box-sizing: border-box;
                box-shadow: 0px 0px 10px lightblue;
                font-family: cursive;
                padding: 5px;
                border-radius: 5px;
                font-weight: bolder;
            }
            
            body{
                margin: 10px;
                position: relative;
                box-sizing: border-box;
                background-image: url("images/bus_banner.jpg");
                background-repeat: no-repeat;
                background-size: cover;
		background-position: center bottom;
		height: auto;
            }
            
            .header{
                /*background-color: lightblue;*/
                position: relative;
                height: 190px;
                width: 100%;
                margin-bottom: 10px;
                padding: 5px;
                box-sizing: border-box;
            }
            
            .logo{
                height: 50px;
                width: 50px;
                background-image: url("images/icon.png");
                background-repeat: no-repeat;
                background-size: cover;
		background-position: center;
                margin-bottom: 20px;
            }
            
            .container{
                display: flex;
                position: relative;
                height: auto;
                width: 100%;
                margin-top: 10px;
                margin-bottom: 10px;
                box-sizing: border-box;
            }
            
            .left{
                /*background-color: dodgerblue;*/
                height: 100%;
                width: 20%;
                margin-right: 5px;
                padding: 5px;
                box-sizing: border-box;
            }
            
            .right{
                /*background-color: aliceblue;*/
                height: 100%;
                width: 80%;
                margin-left: 5px;
                padding: 5px;
                box-sizing: border-box;
            }
            
            input{
                border-color: lightblue;
            }
            
            input:invalid{
                border-color: red;
            }
            
            input:valid{
                border-color: lightgreen;
            }
            
            a{
                text-decoration: none;
                color: black;
            }
            
            .footer{
                /*background-color: lightblue;*/
                position: relative;
                height: 70px;
                width: 100%;
                margin-top: 10px;
                padding: 5px;
                box-sizing: border-box;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <!--<h1>Admin Panel</h1>-->
        <div class="header"><h2>Go Bus ! Welcomes You...</h2>
            <div class="logo"></div>
            <a href="logout.jsp">Logout</a>
        </div>
        <div class="container">
            <div class="left"><h3>User's Profile</h3>
                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                      <li data-target="#myCarousel" data-slide-to="1"></li>
                    </ol>

                    <!-- Wrapper for slides -->
                    <div class="carousel-inner">
                      <div class="item active">
                        <img src="images/icon.png" alt="Welcome to Go Bus !">
                      </div>

                      <div class="item">
                        <img src="images/bus_icon.png" alt="Welcome to Go Bus !">
                      </div>
                    </div>

                    <!-- Left and right controls -->
                    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                      <span class="glyphicon glyphicon-chevron-left"></span>
                      <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next">
                      <span class="glyphicon glyphicon-chevron-right"></span>
                      <span class="sr-only">Next</span>
                    </a>
                </div>
                <%
                    String uname =(String) session.getAttribute("uname");
                    String acco =(String) session.getAttribute("acco");
                    session.setAttribute("uname",uname);
                    session.setAttribute("acco",acco);
                %>
                <div>User-Name : <%= uname%><br><br>
                    Account-type : <%= acco%></div>
            </div>
            <div class="right"><h3>Services at Go Bus !</h3>
            <h4>Delete Route/Bus Details &nbsp; &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;
            <a style="cursor: pointer;" onclick="goBack()">Back</a></h4>
            <script>
            function goBack() {
              window.history.go(-1);
            }
            </script>
            <% if(uname!=null){ %>
            <form action="DelSchServlet" method="post">
            <h4>Bus No.: <input type="text" name="busno" placeholder="Enter Exisiting Bus No." pattern="[0-9]+" title="Must contain numbers only" required><br><br>
            <input style="cursor: pointer;" type="submit" value="Delete Schedule">
        </form>
            <% } %>
            </div>
            <!--<div style="clear: both"></div>-->
        </div>
        <div class="footer"><h5>Copyright &copy; 2019 by Chitkara University, HP.</h5></div>
    </body>
</html>
