package modelo.persistencia;

public class Jugador {

    private float altura;
    private String cedula;
    private int edad;
    private Mediciones mediciones;
    private String nombre_completo;
    private float peso;
    private String sexo;

    public Jugador() {

    }

    public Jugador(float altura, String cedula, int edad, String nombre_completo, float peso, String sexo) {
        this.altura = altura;
        this.cedula = cedula;
        this.edad = edad;
        this.nombre_completo = nombre_completo;
        this.peso = peso;
        this.sexo = sexo;
    }

    public Jugador(float altura, String cedula, int edad, Mediciones mediciones, String nombre_completo, float peso, String sexo) {
        this.altura = altura;
        this.cedula = cedula;
        this.edad = edad;
        this.mediciones = mediciones;
        this.nombre_completo = nombre_completo;
        this.peso = peso;
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mediciones getMediciones() {
        return mediciones;
    }

    public void setMediciones(Mediciones mediciones) {
        this.mediciones = mediciones;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "altura=" + altura + ", cedula=" + cedula + ", edad=" + edad + ", mediciones=" + mediciones + ", nombre_completo=" + nombre_completo + ", peso=" + peso + ", sexo=" + sexo + '}';
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
    }

}
