package model.logic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Peliculas implements Comparable<Peliculas> {

	private String nombre;
	private String director;
	private Date fecha;
	private String[] actores;
	private Double puntuacion;
	private Integer id;
	private String[] genero;

	/**
	 * Constructor de la clase Peliculas
	 * 
	 * @param idCasting numero de identificacion de la pelicula !=null
	 * @param dir       director, si no hay informacion en el csv dir=""
	 * @param nom       nombre pelicula, si no hay informacion en el csv nom=""
	 * @param punt      puntuacion, si no hay informacion en el csv punt=null
	 * @param act       lista con los actores de la pel�cula
	 * @param rdate     fecha de estreno de la pelicula
	 */
	public Peliculas(Integer pID, String dir, String nom, Double punt, String[] act, Date rdate, String[] gen) 
	{
		director = dir;
		id = pID;
		nombre = nom;
		puntuacion = punt;
		actores = act;
		fecha = rdate;
		genero = gen;
	}

	// M�todos de devolver informaci�n
	public String darNombre() {
		return nombre;
	}

	public String darDirector() {
		return director;
	}

	public Double darPuntuacion() {
		return puntuacion;
	}

	public Integer darId() {
		return id;
	}

	public String[] darActores() {
		return actores;
	}

	public Date darFecha() {
		return fecha;
	}

	public String[] darGenero() {
		return genero;
	}

	/**
	 * Requerimiento de Comparable de implementar metodo compareTo
	 */
	public int compareTo(Peliculas pelicula) {

		return pelicula.darId().compareTo(this.id);

	}

	/**
	 * Retorna la informacion de la pelicula en formato String
	 * 
	 * @return String con los datos de la pelicula
	 */
	public String darInfo() 
	{
		// Convierte la fecha al formato correcto
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String strFecha = formato.format(fecha);
		String str = "Pelicula: " + nombre + "\nFecha: " + strFecha + "\nID: " + id + "\nGenero(s): ";
		// Agrega los generos
		for (String i : genero) 
		{
			str = str + i + ",";
		}
		
		str = str.substring(0, str.length() - 1);
		// Agrega los actores
		str = str + "\nActores: ";
		for (String i : actores) 
		{
			if (i != null) 
			{
				str = str + i + ",";
			}
		}
		str = str.substring(0, str.length() - 1);
		str = str + "\n ---------------------";
		return str;
	}
}
