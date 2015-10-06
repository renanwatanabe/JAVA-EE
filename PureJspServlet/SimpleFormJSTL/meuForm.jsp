<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="formServlet">
      Name : <input type="text" name="name"/>  <br/>
      Age : <input type="text" name="age"/>  <br/>
      Weight : <input type="text" name="weight"/>  <br/>
      Password : <input type="password" name="password"/> <br/>
      Sex : <input type="radio" name="sex" value="male"/>Male 
            <input type="radio" name="sex" value="female"/>Female <br/>
      Vehicles <input type="checkbox" name="vehicle" value="bike"/> Bike
               <input type="checkbox" name="vehicle" value="plane"/> Plane
               <input type="checkbox" name="vehicle" value="car"/> Car  <br/>
               
      Job : <select name="jobs" >
               <option value="">Select</option>
               <option value="programmer">Programmer</option>
               <option value="designer">Designer</option>
               <option value="analyst">Analyst</option>
            </select> <br/>       
      
      Observation <textarea name="obs" rows="3" cols="30"></textarea>
      <input type="hidden" name="ninja" value="naruto" />
      
      <br/>
      <input type="submit" value="Ok"/>
   </form>
</body>
</html>