<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Association</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<c:import url="header.jsp"/>
/////
<table class="table">
  <thead>
    <th scope="col" class="text-center">id_association</th>
        <th scope="col" class="text-center">conducteur</th>
        <th scope="col" class="text-center">vehicule</th>
        <th scope="col" class="text-center">modification</th>
        <th scope="col" class="text-center">suppression</th>
    </tr>
  </thead>
  <tbody>
  <tr>
      <th class="text-center">${element.getId()}</th>
            <td class="text-center">${element.getNomConducteur()} ${element.getPrenomConducteur()}<br>${element.getId_conducteur()}</td>
            <td class="text-center">${element.getMarqueVehicule()} ${element.getModeleVehicule()}<br>${element.getId_vehicule()}</td>
         
   </tr>
///////////
<form>
  <fieldset disabled>
   
	<div class="mb-3">
	      <label for="disabledSelect" class="form-label">conducteur</label>
	      <select id="disabledSelect" class="form-select">
	        <option>choisir le conducteur</option>
	      </select>
    </div>
    <div class="mb-3">
	      <label for="disabledSelect" class="form-label">vehicule</label>
	      <select id="disabledSelect" class="form-select">
	        <option>choisir cette association</option>
	      </select>
    </div>
   		 <button type="submit" class="btn btn-primary">ajouter cette association</button>
  </fieldset>
</form>
  </tbody>
  </table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>