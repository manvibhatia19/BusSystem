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
		height: auto;
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
                border-color: green;
            }
            
            a{
                text-decoration: none;
                color: black;
            }
        </style>
    </head>
    <body>
        <h2 style="font-family: cursive;">Sign Up to Go Bus !</h2>
        <div class="logo"></div>
        <form action="SignupServlet" method="post">
            <h4>First Name: <input type="text" name="fname" placeholder="Enter your First Name" required><br><br>
            Last Name: <input type="text" name="lname" placeholder="Enter your Last Name" required><br><br>
            Email: <input type="email" name="email" placeholder="Enter your Email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="Please include an '@' and '.domain' in the email address, e.g. 'abc@gmail.com'" required><br><br>
            Username: <input type="text" name="uname" placeholder="Enter your Username" pattern="(?=.*[a-z])^[^-\s]{8,}" title="Must not contain spaces and contain all lowercase letters, at least 8 or more characters" required><br><br>
            Account Type: <select name="acco">
                <option name="Student/Faculty" value="Student/Faculty">Student/Faculty</option>
		<option name="Staff" value="Staff">Staff</option>
		<option name="Admin" value="Admin">Admin</option>
            </select><br><br>
            Password: <input type="password" name="pass" placeholder="Enter your Password" pattern="^[^-\s]{8,}" title="Must not contain spaces and at least 8 or more characters"  required><br><br>
            Confirm Password: <input type="password" name="cpass" placeholder="Enter your Confirm Password" pattern="^[^-\s]{8,}" title="Must not contain spaces and at least 8 or more characters"  required><br><br>
            <input style="cursor: pointer;" type="submit" value="Sign Up"><br><br>
            Already a User ! <a href="index.jsp">Login Here</a></h4>
        </form>
    </body>
</html>
