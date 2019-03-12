<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>LoginForm</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container-fluid bg-light">
            
            <br><br><br>
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                       <center><h3>Delete Product</h3></center>
                    <form action="deleteProduct.html" method="post" >
                <div class="form-group">
                  <label for="userid">Product ID:</label>
                  <input type="text" name="productId" class="form-control" id="userid" maxlength="10">
                </div>
                             
                <center><button type="submit" class="btn btn-success">Delete</button>&nbsp;&nbsp;&nbsp;<button type="reset" class="btn btn-danger ">Reset</button></center>
              </form>
            </div>
            </div>
            </div>
        
    </body>
</html>
