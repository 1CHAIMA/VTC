<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conducteur</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<c:import url="header.jsp"/>
/////////
<table class="table">
  <thead>
    <tr>
      <th scope="col">id_conducteur</th>
      <th scope="col">prenom</th>
      <th scope="col">nom</th>
      <th scope="col">modification</th>
      <th scope="col">supression</th>
    </tr>
  </thead>
  <tbody>
    <tr>
        <th class="text-center">${element.getId()}</th>
            <td class="text-center">${element.getPrenom()}</td>
            <td class="text-center">${element.getNom()}</td>
        
    </tr>
 ////////
 <form>
  <fieldset disabled>
   
	    <div class="mb-3">
	      <label for="disabledTextInput" class="form-label">prenom</label>
	      <input type="text" id="disabledTextInput" class="form-control" placeholder="prenom">
	    </div>
	    <div class="mb-3">
	      <label for="disabledTextInput" class="form-label">nom</label>
	      <input type="text" id="disabledTextInput" class="form-control" placeholder="nom">
	    </div>
    
   		 <button type="submit" class="btn btn-primary">ajouter ce conducteur</button>
  </fieldset>
</form>
  </tbody>
</table>
////////
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>