package cl.ipvg.myapplication;

public class Calcular_Nota {
    private String idCalculodeNotas;
   private String Nombre;
   private String Asignatura;
   private  int NotaUno;
   private int NotaDos;
   private int NotaTres;

    public Calcular_Nota(String idCalculodeNotas, String nombre, String asignatura, int notaUno, int notaDos, int notaTres) {
        this.idCalculodeNotas = idCalculodeNotas;
        Nombre = nombre;
        Asignatura = asignatura;
        NotaUno = notaUno;
        NotaDos = notaDos;
        NotaTres = notaTres;
    }
    public Calcular_Nota() {
        this.idCalculodeNotas = "";
        Nombre = "";
        Asignatura = "";
        NotaUno = 0;
        NotaDos = 0;
        NotaTres = 0;
    }

    public String getIdCalculodeNotas() {
        return idCalculodeNotas;
    }

    public void setIdCalculodeNotas(String idCalculodeNotas) {
        this.idCalculodeNotas = idCalculodeNotas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }

    public int getNotaUno() {
        return NotaUno;
    }

    public void setNotaUno(int notaUno) {
        NotaUno = notaUno;
    }

    public int getNotaDos() {
        return NotaDos;
    }

    public void setNotaDos(int notaDos) {
        NotaDos = notaDos;
    }

    public int getNotaTres() {
        return NotaTres;
    }

    public void setNotaTres(int notaTres) {
        NotaTres = notaTres;
    }

    @Override
    public String toString() {
        return "Calcular_Nota{" +
                "idCalculodeNotas='" + idCalculodeNotas + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Asignatura='" + Asignatura + '\'' +
                ", NotaUno=" + NotaUno +
                ", NotaDos=" + NotaDos +
                ", NotaTres=" + NotaTres +
                '}';
    }
}
