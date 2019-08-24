<!DOCTYPE html>
<html lang="en">
<head>
  <title>User Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <div class="row">
    <h3>User Login</h3><hr>
  </div>
  <div class="row">
    <div class="col-sm-4">
      <form action="user-blog.html" method="post">
        <div class="form-group">
          <label for="email">Email:</label>
          <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
        </div>
        <div class="form-group">
          <label for="pwd">Password:</label>
          <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
        </div>
      
        <button type="submit" class="btn btn-success">Login</button>
        <a href="user-registration.html" type="button" class="btn btn-default">Register</a>
      </form>
    </div>
  </div>
</div>

	<script type="text/javascript">
      $(document).ready(function() {
        $("#submit").click(function() {
          $.ajax({
            type: 'POST',
            url: '/login',
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
