public class Persona {
 String persona;
 public int edad;

    public Persona(int edad, String persona) {
        this.edad = edad;
        this.persona = persona;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [persona=" + persona + ", edad=" + edad + "]";
    }

}
