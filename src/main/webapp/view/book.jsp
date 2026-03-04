<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Book</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background-color: white;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        width: 350px;
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
    }

    label {
        font-weight: bold;
    }

    input[type="text"] {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        margin-bottom: 15px;
        border-radius: 5px;
        border: 1px solid #ccc;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-weight: bold;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Search Book</h2>

    <form action="searchBook" method="get">
     <h2 style='color:red'>${message }</h2>
        <label for="bookId">Book ID:</label>
        <input type="text" id="bookId" name="bookId" 
               placeholder="Enter the Book ID" required>

        <input type="submit" value="Search">
    </form>
    <h3>Book ID->      ${book.id }</h3> <br>
    <h3>Book Name->    ${book.name }</h3> <br>
    <h3>Book Price->   ${book.price }</h3> <br>
    <h3>Book Quantity->${book.qty }</h3>  <br>
    
    
</div>

</body>
</html>