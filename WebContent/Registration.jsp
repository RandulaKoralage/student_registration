<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="./css/Styles.css">
	<title>Register</title>
</head>
<body>
	<div class="container">  
  <form id="contact" action="add" method="post">
    <h3>Register Student</h3>
    
    <fieldset>
     <label>Index Number </label>
     <input name="IndexNumber" type="text" tabindex="1"  >
    </fieldset>
    <fieldset>
     <label>Your Name </label>
      <input name="Name" type="text" tabindex="2">
    </fieldset>
    <fieldset>
     <label>Your Phone Number </label>
      <input name="Telephone" type="text" tabindex="3">
    </fieldset>
    <fieldset>
     <label>Your Email Address </label>
      <input name="Email" type="text" tabindex="4">
    </fieldset>
   
    <fieldset>
      <button name="submit" type="submit" id="contact-submit">Submit</button>
    </fieldset>
    
  </form>
</div>
</body>
</html>