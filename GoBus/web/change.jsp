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
        <h2 style="font-family: cursive;">Secure with Go Bus !</h2>
        <div class="logo"></div>
        <form action="ChangeServlet" method="post">
            <%
                String uname =(String) session.getAttribute("uname");
                session.setAttribute("uname",uname);
            %>
            <h4>Username:<br>
            <input type="text" name="uname" value="<%= uname%>" placeholder="Enter your Username" pattern="(?=.*[a-z])^[^-\s]{8,}" title="Must not contain spaces and contain all lowercase letters, at least 8 or more characters" required><br><br>
            New Password:<br>
            <input type="password" name="pass" placeholder="Enter your New Password" pattern="^[^-\s]{8,}" title="Must not contain spaces and at least 8 or more characters" required><br><br>
            Confirm New Password:<br>
            <input type="password" name="cpass" placeholder="Confirm your New Password" pattern="^[^-\s]{8,}" title="Must not contain spaces and at least 8 or more characters" required><br><br>
            <input style="cursor: pointer;" type="submit" value="Change Password"><br><br>
            Remember Password ? <a href="index.jsp">Login Again</a>
        </form>
    </body>
</html>
