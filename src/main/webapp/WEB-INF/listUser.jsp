<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div >
<a href = "add_user" > Add Student</a>

</div>
  <c:if test = "${!empty users }" >
  
      <table> 
        <thead> 
          <tr> 
             <th>SN</th>
             <th>Id</th>
             <th>User Name <th>
             <th>Password</th>
             <th>Gender <th>
             <th>Hobbies</th>
             <th>Email</th>
             <th>Verification Type</th>
             <th>DOB</th>
             <th>Mobile No</th>
             <th>city Name</th>
             <th>country Name</th>
             <th>Actions</th>
          </tr>
        </thead>
        
        <tbody>
           <c:forEach items = "${users}" var = "user" varStatus = "i">
             <tr>
             
               <td> ${i.count}</td>
               <td> ${user.id}</td>
               <td> ${user.name}</td>
               <td> ${user.password}</td>
               <td> ${user.gender}</td>
               <td> ${user.hobbies}</td>
               <td> ${user.email}</td>
               <td> ${user.verificationType}</td>
               <td> ${user.dob}</td>
               <td> ${user.mobileNo}</td>
               <td> ${user.city}</td>
               <td> ${user.country}</td>
               <td> <a href = "" > Edit</a> | <a href = "delete_user?id =${user.id}"> Delete</a>  </td>
               
               
               
               
             
             </tr>
           
           </c:forEach>
        </tbody>
      
      </table>
  
  
  </c:if>



</body>
</html>