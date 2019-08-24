<!DOCTYPE html>
<html lang="en">
<head>
  <title>User Registration</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <div class="row">
    <h3>User Registration</h3><hr>
  </div>
  <div class="row">
    <div class="col-sm-4">
      <form action="user-login.html" method="post">
        <div class="form-group">
          <label for="name">Name:</label>
          <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
        </div>
        <div class="form-group">
          <label for="email">Email:</label>
          <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
        </div>
        <div class="form-group">
          <label for="pwd">Password:</label>
          <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
        </div>
        
        <button type="button" class="btn btn-success">Register</button>
        <a href="user-login.html" type="button" class="btn btn-default">Login</a>
      </form>
    </div>
  </div>
</div>

<script type="text/javascript">
      $(document).ready(function() {
        $("#submit").click(function() {
          $.ajax({
            type: 'POST',
            url: '/registeruser',
            success: function(data) {
              
            } 
            error: function(e) {
              alert("Error..");
            }
          });
          
        });  
      });
    </script>
</body>
</html>
