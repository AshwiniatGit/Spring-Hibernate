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
                       <center><h3>Update Product</h3></center>
                    <form action="updateProduct.html" method="POST" >
                <div class="form-group">
                  <label for="userid">Product ID:</label>
                  <input name="productId" type="text" class="form-control" id="userid" maxlength="10">
                </div>
                <div class="form-group">
                    <label for="password">Product Name:</label>
                    <input name="productName" type="text" class="form-control" name="name" minlength="8" maxlength="20">
                  </div>
  
                  <div class="form-group">
                      <label for="password">Price:</label>
                      <input name="price" type="number" class="form-control" name="price" >
                  </div>
  
                  <div class="form-group">
                          <label for="contactNumber:">Quantity:</label>
                          <input name="quantity" type="number" class="form-control" name="quantity">
                  </div>
                             
                <center><button type="submit" class="btn btn-success">Update</button>&nbsp;&nbsp;&nbsp;<button type="reset" class="btn btn-danger ">Reset</button></center>
              </form>
            </div>
            </div>
            </div>
        
    </body>
</html>
