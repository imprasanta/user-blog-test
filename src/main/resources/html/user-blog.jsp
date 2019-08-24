<!DOCTYPE html>
<html lang="en">
<head>
  <title>User Blog</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    .logout {

    }
  </style>
</head>
<body>

<div class="container">
  <div class="row">
    <div class="col-sm-11">
      <h3>Blog page</h3>
    </div>
    <div class="col-sm-1">&nbsp;
      <a href="user-login.html" type="button" class="btn btn-danger">Logout</a>
    </div>
  </div>
  <hr>
  <div class="row">
    <div class="col-sm-4">
      <form action="/">
        <div class="form-group">
          <label for="title">Title:</label>
          <input type="text" class="form-control" id="title">
        </div>
        <div class="form-group">
          <label for="description">Description:</label>
          <textarea class="form-control" rows="5" id="description"></textarea>
        </div>
        <button type="submit" class="btn btn-success"><b>+</b> Add Blog</button>
      </form>
    </div>
    <div class="col-sm-8">
      <div class="blogs">
        <h3>Title</h3>
        <p>Description: Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
        <hr>
      </div>
      <div class="blogs">
        <h3>Title</h3>
        <p>Description: Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
        <hr>
      </div>
    </div>
  </div>
</div>

<script type="text/javascript">
      $(document).ready(function() {
        $("#submit").click(function() {
          $.ajax({
            type: 'POST',
            url: '/addblog',
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
