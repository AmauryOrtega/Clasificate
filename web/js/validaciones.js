
function validarEquipo() {
    var nombre = document.form.txtNombre.value.toString();
    var nacionalidad = document.form.txtNacionalidad.value.toString();
    var no = nombre.trim();
    var na = nacionalidad.trim();

    if (na.lenght == 0 && no.length == 0) {
        document.getElementById("nacio").style.border = "2px solid red";
        document.getElementById("nombre").style.border = "2px solid red";
        document.getElementById("nacio").value = "";
        document.getElementById("nombre").value = "";
        return false;
    } else if (no.length == 0) {
        document.getElementById("nombre").style.border = "2px solid red";
        return false;
    } else if (na.lenght == 0) {
        document.getElementById("nacio").style.border = "2px solid red";
        return false;
    } else {
        return true;
    }
}

function validarJugador() {
    var cooper = document.formJ.txtCooper.value.toString();
    var burpee = document.formJ.txtBurpee.value.toString();
    var fBrazos = document.formJ.txtFBrazos.value;
    var sAlto = document.formJ.txtSAlto.value;
    var sLargo = document.formJ.txtSLargo.value;
    var p1 = document.formJ.ruffierP1.value;
    var p2 = document.formJ.ruffierP2.value;
    var p3 = document.formJ.ruffierP3.value;
    var peso = document.formJ.txtPeso.value;
    var altura = document.formJ.txtAltura.value;
    var elasticidad = document.formJ.txtElasticidad.value;
    if (cooper.length == 0 || cooper == null) {
        document.formJ.txtCooper.value = -1;
        return false;
    } else if (burpee.length == 0 || burpee == null) {
        document.formJ.txtBurpee.value = -1;
        return false;
    } else if (fBrazos.length == 0 || fBrazos == null) {
        document.formJ.txtFBrazos.value = -1;
        return false;
    } else if (sAlto.length == 0 || sAlto == null) {
        document.formJ.txtSAlto.value = -1;
        return false;
    } else if (sLargo.length == 0 || sLargo == null) {
        document.formJ.txtSLargo.value = -1;
        return false;
    } else if (elasticidad.length == 0 || elasticidad == null) {
        document.formJ.txtElasticidad.value = -100;
        return false;
    } else if (p1.length == 0 || p1 == null) {
        document.formJ.ruffierP1.value = -1;
        return false;
    } else if (p2.length == 0 || p2 == null) {
        document.formJ.ruffierP2.value = -1;
        return false;
    } else if (p3.length == 0 || p3 == null) {
        document.formJ.ruffierP3.value = -1;
        return false;
    } else if (peso.length == 0 || peso == null) {
        document.formJ.txtPeso.value = -1;
        return false;
    } else if (altura.length == 0 || altura == null) {
        document.formJ.txtAltura.value = 0;
        return false;
    }
    return true;
}
         