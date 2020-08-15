<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarMain">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item ${requestScope.activePage == 'main' ? 'active' : ''}">
                <a class="nav-link" href="main">Main</a>
            </li>
            <li class="nav-item ${requestScope.activePage == 'catalog' ? 'active' : ''}">
                <a class="nav-link" href="catalog">Catalog</a>
            </li>
            <li class="nav-item ${requestScope.activePage == 'product' ? 'active' : ''}">
                <a class="nav-link" href="product">Product</a>
            </li>
            <li class="nav-item ${requestScope.activePage == 'cart' ? 'active' : ''}">
                <a class="nav-link" href="cart">Cart</a>
            </li>
            <li class="nav-item ${requestScope.activePage == 'order' ? 'active' : ''}">
                <a class="nav-link" href="order">Order</a>
            </li>
        </ul>
    </div>


</nav>

