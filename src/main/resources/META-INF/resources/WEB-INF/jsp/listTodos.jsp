<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>LIST OF TODOS</title>
    </head>
    <body>
        <h1>LIST OF TODOS ${email}</h1>
        <div>
            ${todos}
        </div>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Description</th>
                    <th>Target date</th>
                    <th>Completed?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="todo" items="${todos}">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.completed}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div>
<%--            <c:forEach var="item" items="${todos}" >--%>
<%--                <div>${item.id}-${item.username}-${item.description}</div>--%>
<%--            </c:forEach>--%>
        </div>
    </body>
</html>