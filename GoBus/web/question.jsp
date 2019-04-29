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
        <h2 style="font-family: cursive;">Secure with Go Bus !</h2>
        <div class="logo"></div>
        <form action="QuesServlet" method="post">
            <%
                String uname =(String) session.getAttribute("uname");
                session.setAttribute("uname",uname);
            %>
            <h4>Username:<br>
            <input type="text" name="uname" value="<%= uname%>" placeholder="Enter your Username" pattern="(?=.*[a-z])^[^-\s]{8,}" title="Must not contain spaces and contain all lowercase letters, at least 8 or more characters" required><br><br>
            Secret Question 1:<br>
            <select name="ques1" required>
                <option disabled="disabled" selected="selected">Choose your Secret Question</option>
                <option value="What Is your favorite book?">What Is your favorite book?</option>
                <option value="What is your mothers maiden name?">What is your mother's maiden name?</option>
                <option value="What was the first company that you worked for?">What was the first company that you worked for?</option>
                <option value="Where did you go to high school/college?">Where did you go to high school/college?</option>
                <option value="What is your favorite food?">What is your favorite food?</option>
                <option value="What city were you born in?">What city were you born in?</option>
                <option value="Where is your favorite place to vacation?">Where is your favorite place to vacation?</option>
            </select><br>
            Secret Answer 1:<br>
            <input type="text" name="ans1" placeholder="Enter your Answer" required><br><br>
            Secret Question 2:<br>
            <select name="ques2" required>
                <option disabled="disabled" selected="selected">Choose your Secret Question</option>
                <option value="What Is your favorite book?">What Is your favorite book?</option>
                <option value="What is your mothers maiden name?">What is your mother's maiden name?</option>
                <option value="What was the first company that you worked for?">What was the first company that you worked for?</option>
                <option value="Where did you go to high school/college?">Where did you go to high school/college?</option>
                <option value="What is your favorite food?">What is your favorite food?</option>
                <option value="What city were you born in?">What city were you born in?</option>
                <option value="Where is your favorite place to vacation?">Where is your favorite place to vacation?</option>
            </select><br>
            Secret Answer 2:<br>
            <input type="text" name="ans2" placeholder="Enter your Answer" required><br><br>
            Secret Question 3:<br>
            <select name="ques3" required>
                <option disabled="disabled" selected="selected">Choose your Secret Question</option>
                <option value="What Is your favorite book?">What Is your favorite book?</option>
                <option value="What is your mothers maiden name?">What is your mother's maiden name?</option>
                <option value="What was the first company that you worked for?">What was the first company that you worked for?</option>
                <option value="Where did you go to high school/college?">Where did you go to high school/college?</option>
                <option value="What is your favorite food?">What is your favorite food?</option>
                <option value="What city were you born in?">What city were you born in?</option>
                <option value="Where is your favorite place to vacation?">Where is your favorite place to vacation?</option>
            </select><br>
            Secret Answer 3:<br>
            <input type="text" name="ans3" placeholder="Enter your Answer" required><br><br>
            <input style="cursor: pointer;" type="submit" value="Secure"><br><br>
            Not a User ? <a href="signup.jsp">Sign Up Here</a>
            </h4>
        </form>
    </body>
</html>
