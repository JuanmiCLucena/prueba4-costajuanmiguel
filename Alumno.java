package colegio;

import java.util.Date;

/**
 *
 * @author usuario
 */
public abstract class Alumno implements Escolarizable {
    
    private String nombre;
    private String apellidos;
    private Date nacimiento;
    private int[] notas;
    private static int numAlumnos = 0;

    /**
     *
     */
    protected Curso curso;
    
    /**
     *
     */
    public Alumno () { numAlumnos++; }
    
    /**
     *
     * @param nombre primer parámetro del constructor. Tipo String.
     * @param apellidos segundo parámetro del constructor. Tipo String.
     */
    public Alumno (String nombre, String apellidos) {
        this();
        this.nombre    = nombre;
        this.apellidos = apellidos;
    }
    
    /**
     *
     * @param nombre primer parámetro del constructor. Tipo String.
     * @param apellidos segundo parámetro del constructor. Tipo String.
     * @param nacimiento tercero parámetro del constructor. Tipo Date.
     * @param notas cuarto parámetro del constructor. Array de tipo int.
     */
    public Alumno (String nombre, String apellidos, Date nacimiento, int[] notas) {
        this (nombre, apellidos);
        this.nacimiento = nacimiento;
        this.notas = notas;
    }
     
    /**
     *
     * @return devuelve el nombre del alumno.
     */
    public String getNombre () {
        return nombre;
    }

    /**
     *
     * @param nombre cambia el nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *
     * @return devuelve los apellidos del alumno.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos cambia los apellidos del alumno
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return devuelve la fecha de nacimiento del alumno.
     */
    public Date getNacimiento() {
        return nacimiento;
    }

    /**
     *
     * @param nacimiento cambia la fecha de nacimiento del alumno.
     */
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    /**
     *
     * @return devuelve las notas del alumno.
     */
    public String getNotas_str() {
        StringBuffer str = new StringBuffer();
        str = str.append(notas[0]).append(" ").append(notas[1]).append(" ").append(notas[2]);
        return str.toString();
    }

    /**
     *
     * @return devuelve las notas del alumno.
     */
    public int[] getNotas() {
        return notas;
    }

    /**
     *
     * @param notas cambia las notas del alumno.
     */
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    /**
     *
     * @return devuelve el curso del alumno.
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     *
     * @return devuelve el número de alumnos.
     */
    public static int getNumAlumnos () { return numAlumnos; }
    
    // public abstract void matricular (Curso curso);
    // public abstract void desmatricular ();

    /**
     *
     * @throws Throwable Lanza una excepción-
     */

    @Override
    protected void finalize() throws Throwable {
        numAlumnos --;
        super.finalize();
    }  

}
