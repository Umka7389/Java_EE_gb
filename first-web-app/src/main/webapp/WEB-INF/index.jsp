<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<jsp:include page="fragments/head.jsp"/>

<body>

<jsp:include page="fragments/navigation.jsp">
    <jsp:param name="pageName" value="Продукт"/>
</jsp:include>
<div class="container">
    <div class="row py-2">
        <div class="col-12">
            <c:url value="/new" var="newEditUrl"/>
            <a class="btn btn-primary" href="${newEditUrl}">Add product</a>
        </div>

        <div class="col-12">
            <table class="table table-bordered my-2">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Description</th>
                    <th scope="col">Price</th>
                    <th scope="col">Actions</th>
                </tr>
                </thead>
                <tbody>

                <%--                <% for (Product prod : repository.findAll()) { %>--%>
                <c:forEach var="prod" items="${requestScope.products}">
                    <tr>
                        <th scope="row">
                            <c:out value="${prod.id}"/>
                                <%--                        <%= prod.getId() %>--%>
                        </th>
                        <td>
                            <c:out value="${prod.name}"/>
                                <%--                        <%= prod.getName() %>--%>
                        </td>
                        <td>
                            <c:out value="${prod.description}"/>
                                <%--                        <%= prod.getDescription() %>--%>
                        </td>
                        <td>
                                <c:out value="${prod.price}"/>
                                <%--                        $<%= prod.getPrice() %></td>--%>
                        <td>
                            <c:url value="/edit" var="productEditUrl">
                                <c:param name="id" value="${prod.id}"/>
                            </c:url>
                            <a class="btn btn-success" href="${productEditUrl}"><i class="fas fa-edit"></i></a>
                            <a class="btn btn-danger" href="#"><i class="far fa-trash-alt"></i></a>
                        </td>
                    </tr>
                </c:forEach>
                <%--                <% } %>--%>
                </tbody>
            </table>
        </div>
    </div>
</div>

<div class="container">
    <div class="row py-2">
        <div class="col-12">
            <c:url value="/upsert" var="productPostUrl"/>
            <form action="${productPostUrl}" method="post">
                <input type="hidden" id="id" name="id" value="${product.id}">
                <div class="form-group">
                    <label>Name</label>
                    <input type="text" class="form-control" id="name" name="name" placeholder="Enter name"
                           value="${product.name}">
                </div>
                <div class="form-group">
                    <label>Description</label>
                    <input type="text" class="form-control" id="description" name="description" placeholder="Enter description"
                           value="${product.description}">
                </div>
                <div class="form-group">
                    <label>Price</label>
                    <input type="number" class="form-control" id="price" name="price" placeholder="Enter price"
                           value="${product.price}">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<jsp:include page="fragments/scripts.jsp"/>

</body>
</html>