<%--
  Created by IntelliJ IDEA.
  User: ilove
  Date: 2023-10-23
  Time: 오전 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<script src="/webapp/WEB-INF/js/jquery.js"></script>--%>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
    function fn_detailSetInfo(){
        $.ajax({
            url: "/api/detailInfo",
            type: "GET",
            success: function (res) {
               console.log(res)
            },
            error: function () {
                console.error();
            }
        });
    }

    $(document).ready(function(){
        console.log("test");
        fn_detailSetInfo();
    })
</script>
<html>
<head>
    <title>상세</title>
</head>
<body>
<h1>상세 페이지</h1>
<button onclick="history.back();">이전 페이지 이동</button>
</body>
</html>
