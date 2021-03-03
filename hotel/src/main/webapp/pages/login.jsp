<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>鹰啸天酒店管理系统</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8"/>
    <meta name="keywords"/>


    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <!-- Meta tag Keywords -->

    <!-- css files -->
    <link rel="stylesheet" href="../css/style.css" type="text/css" media="all"/>
    <!-- Style-CSS -->
    <link rel="stylesheet" href="../css/fontawesome-all.css">
    <!-- Font-Awesome-Icons-CSS -->
    <!-- //css files -->

    <!-- web-fonts -->
    <link href="//fonts.googleapis.com/css?family=Tangerine:400,700" rel="stylesheet">

    <link href="//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet">
    <!-- //web-fonts -->
</head>

<body>
<!-- title -->
<h1>
    <span></span>鹰啸天酒店管理系统
</h1>
<!-- //title -->

<!-- content -->
<div class="sub-main-w3">
    <form class="login" action="${pageContext.request.contextPath}/pages/login" mothed="post">
        <fieldset>
            <p class="legend">用户登录<i class="far fa-hand-point-down"></i></p>
            <div class="input">
                <input id="username" type="username" placeholder="请输入用户名" name="username" required/>
                <span>
                    <i class="fas fa-address-book"></i>
                </span>
            </div>
            <div class="input">
                <input id="password" type="password" placeholder="请输入密码" name="password" required/>
                <span>
                    <i class="fas fa-lock-open"></i>
                </span>
            </div>

            <div style="color: white; width: 100% ;height: 35px;text-align: center" >
                <span>${errorUsername}</span>
                <span>${errorPassword}</span>
            </div>

            <%--<button type="submit" class="submit" onclick="f()">
                <i class="fas fa-sign-in-alt"></i>
            </button>--%>
            <button type="submit" class="submit" >
                <i class="fas fa-sign-in-alt"></i>
            </button>
        </fieldset>
        <div class="feedback">
            您已登录
            <br/> 成功.
        </div>
    </form>
</div>

<!-- Jquery -->
<script src="../js/jquery-2.2.3.min.js"></script>
<!-- //Jquery -->
<!-- script -->
<script>



    $(".input").focusin(function () {
        $(this).find("span").animate({
            "opacity": "0"
        }, 200);
    });

    $(".input").focusout(function () {
        $(this).find("span").animate({
            "opacity": "1"
        }, 300);
    });

    /*function f() {
        var account = {
            username: document.getElementById("username").value,
            password: document.getElementById("password").value
        }
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/pages/login",
            data: JSON.stringify(account),
            contentType: "application/json;charset=utf-8",
            success:function (data) {
                alert(data);
            },
        });
    }*/
</script>
<!-- //script -->

</body>
</html>
