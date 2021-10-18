<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<h1>This is a pizza order form</h1>
<form method="POST">
<label>
    <select name="crust">
        <option>Standard</option>
        <option>Chicago</option>
        <option>Thin n' Crispy</option>
        <option>Stuffed Crust</option>
    </select>
</label>
<label>
<select name="sauce">
    <option>Tomato Sauce</option>
    <option>Alfredo</option>
    <option>None</option>
</select>
</label>
<label>
    <select name="size">
        <option>Small</option>
        <option>Medium</option>
        <option>Large</option>
    </select>
</label>
    <br>
<input type="checkbox" id="Pepperoni" name="toppings" value="Pepperoni">
<label for="Pepperoni"> Pepperoni</label><br>
<input type="checkbox" id="Sausage" name="toppings" value="Sausage">
<label for="Sausage"> Sausage</label><br>
<input type="checkbox" id="Jalapenos" name="toppings" value="Jalapenos">
<label for="Jalapenos"> Jalapenos</label><br>
<input type="checkbox" id="Anchovies" name="toppings" value="Anchovies">
<label for="Anchovies"> Anchovies</label><br>
<input type="text" name="address">
<button type="submit">Submit</button>
</form>
</body>
</html>
