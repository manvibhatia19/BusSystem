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
		background-position: right bottom;
		height: 100vh;
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
        </style>
    </head>
    <body>
        <h2 style="font-family: cursive;">Login to Go Bus !</h2>
        <div class="logo"></div>
        <form action="LoginServlet" method="post">
            <h4>Username: <input type="text" name="uname" placeholder="Enter your Username" pattern="(?=.*[a-z])^[^-\s]{8,}" title="Must not contain spaces and contain all lowercase letters, at least 8 or more characters" required><br><br>
            Password: <input type="password" name="pass" placeholder="Enter your Password" pattern="^[^-\s]{8,}" title="Must not contain spaces and at least 8 or more characters" required><br><br>
            <a href="uname.jsp">Forget Password ?</a><br><br>
            Account Type: <select name="acco">
                <option name="Student/Faculty" value="Student/Faculty">Student/Faculty</option>
		<option name="Staff" value="Staff">Staff</option>
		<option name="Admin" value="Admin">Admin</option>
            </select><br><br>
            <input style="cursor: pointer;" type="submit" value="Login"><br><br>
            Not a User ? <a href="signup.jsp">Sign Up Here</a></h4>
        </form>
    </body>
</html>
