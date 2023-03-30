<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>

<title>My html</title>
</head>
<body>
    <%@ include file="common/navigation.jspf" %>
    Welcomes
    ${name}
    <div>
        <a href="todos">manage your todos</a>
    </div>
</body>
</html>