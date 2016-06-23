<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link href="C:/Users/Chetan/thisworkspace/shoppingc/src/main/resources/plugins/bootstrap.css" rel="stylesheet" />
    <link href="C:/Users/Chetan/thisworkspace/shoppingc/src/main/resources/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="C:/Users/Chetan/thisworkspace/shoppingc/src/main/resources/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
   <link href="C:/Users/Chetan/thisworkspace/shoppingc/src/main/resources/css/style.css" rel="stylesheet" />
      <link href="C:/Users/Chetan/thisworkspace/shoppingc/src/main/resources/css/main-style.css" rel="stylesheet" />
      
  
<title>Shopping Cart</title>

</head>
<body class="body-Login-back" style="align-center">

    <div class="container">
       
        <div class="row">
            <div class="col-md-4 col-md-offset-4 text-center logo-margin ">
              <img src="https://cdn0.vox-cdn.com/thumbor/H9lwq-sO64UwpxlRMkB6Ro9d37M=/cdn0.vox-cdn.com/uploads/chorus_asset/file/3738398/tumblr_ncczy5rzUt1s2yegdo1_500.0.gif" alt=""/>
                </div>
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">                  
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
<form:form action="isValidUser" method="post" role="form">
${message}
                 
                                <div class="form-group">
                                    UserName:<input class="form-control" placeholder="UserName" name="name" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    Password:<input class="form-control" placeholder="Password" name="password" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <input type="submit" value="Login">
                            </fieldset>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>

<script src="C:/Users/Chetan/thisworkspace/shoppingc/src/main/resources/plugins/jquery-1.10.2.js"></script>
    <script src="C:/Users/Chetan/thisworkspace/shoppingc/src/main/resources/plugins/bootstrap.min.js"></script>
    <script src="C:/Users/Chetan/thisworkspace/shoppingc/src/main/resources/plugins/metisMenu/jquery.metisMenu.js"></script>


</body>
</html>