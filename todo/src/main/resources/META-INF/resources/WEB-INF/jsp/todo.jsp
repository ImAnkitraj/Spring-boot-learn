<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>My html</title>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>

    </head>
    <body>
        <%@ include file="common/navigation.jspf" %>
        <div class="container">
            <h1>Add todo</h1>
            <form:form method="POST" modelAttribute="todo">
                <fieldset class="mb-3">
                    <form:label path="description">Description</form:label>
                    <form:input type="text" path="description"/>
                    <form:errors path="description" cssClass="text-wrapping"/>
                </fieldset>
                <fieldset class="mb-3">
                    <form:label path="targetDate">Target Date</form:label>
                    <form:input type="text" path="targetDate"/>
                    <form:errors path="targetDate" cssClass="text-wrapping"/>
                </fieldset>
                <form:input type="hidden" path="id" />
                <form:input type="hidden" path="done" />
                <input class="btn btn-success" type="submit"/>
            </form:form>
        </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"/>
        <script src="webjars/jquery/3.6.0/jquery.min.js"/>
    </body>
</html>