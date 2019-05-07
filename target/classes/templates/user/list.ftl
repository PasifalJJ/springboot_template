<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
    <script src="${request.contextPath}/js/jquery.js"></script>
    <script>
        $(function () {
            //添加图片点击数据
            $("#carImg").click(function () {
                alert("你想买这部车吗？");
            });
        });
    </script>
</head>
<body>
ABC<br>
<img id="carImg" src="${request.contextPath}/imgs/1.jpg" width="300px" height="300px">
<#if i==true>
    小朋友
<#elseif j==false>
    大叔
<#else>
    帅哥
</#if>

<table border="1">
    <tr>
        <td>ID</td>
        <td>名字</td>
        <td>性别</td>
    </tr>
    <#--遍历userlist，将其按照id顺序进行排序，倒序输出-->
    <#list userList?sort_by("id")?reverse as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.gender}</td>
        </tr>
    </#list>
</table>
</body>
</html>