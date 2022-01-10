<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Véhicule</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<c:import url="header.jsp"/>
///
<table class="table container mt-5">
    <thead>
    <tr>
        <th scope="col" class="text-center">id_vehicule</th>
        <th scope="col" class="text-center">marque</th>
        <th scope="col" class="text-center">modele</th>
        <th scope="col" class="text-center">couleur</th>
        <th scope="col" class="text-center">immatriculation</th>
        <th scope="col" class="text-center">modification</th>
        <th scope="col" class="text-center">suppression</th>
    </tr>
    </thead>
    <tbody>
    
    <tr>
            <th class="text-center">${element.getId()}</th>
            <td class="text-center">${element.getMarque()}</td>
            <td class="text-center">${element.getModele()}</td>
            <td class="text-center">${element.getCouleur()}</td>
            <td class="text-center">${element.getImmatriculation()}</td>
    </tr>
 ///////////
  <form>
  <fieldset disabled>
   
	    <div class="mb-3">
	      <label for="disabledTextInput" class="form-label">id_vehicule</label>
	      <input type="text" id="disabledTextInput" class="form-control" placeholder="id_vehicule">
	    </div>
	    <div class="mb-3">
	      <label for="disabledTextInput" class="form-label">marque</label>
	      <input type="text" id="disabledTextInput" class="form-control" placeholder="marque">
	    </div>
	    <div class="mb-3">
	      <label for="disabledTextInput" class="form-label">modele</label>
	      <input type="text" id="disabledTextInput" class="form-control" placeholder="modele">
	    </div>
	    <div class="mb-3">
	      <label for="disabledTextInput" class="form-label">couleur</label>
	      <input type="text" id="disabledTextInput" class="form-control" placeholder="couleur">
	    </div>
	    <div class="mb-3">
	      <label for="disabledTextInput" class="form-label">immatriculation</label>
	      <input type="text" id="disabledTextInput" class="form-control" placeholder="immatriculation">
	    </div>
    
   		 <button type="submit" class="btn btn-primary">ajouter ce véhicule</button>
  </fieldset>
</form>
    </tbody>
 </table>
////
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>