<html>
    <head>
        <title>My html</title>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>

    </head>
    <body>
        <div class="container">
            <h1>Login</h1>
            <span style="color:red">${errorMsg}</span>
            <form method="POST">
                Name: <input type="text" name="name"/>
                Password: <input type="password" name="password"/>
                <input type="submit"/>
            </form>
        </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"/>
        <script src="webjars/jquery/3.6.0/jquery.min.js"/>
    </body>
</html>