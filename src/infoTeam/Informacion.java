package infoTeam;

public class Informacion {

	public static void main(String[] args) {
		
			//	MARIANO AVOLA	
			Equipo Persona1 = new Equipo();
			
			Persona1.nombre = "Mariano";
			Persona1.apellido = "Avola";
			Persona1.edad = 23;
			Persona1.skills = "Java";
		
			
			//	AGUSTIN BURGOS
			Equipo Persona2 = new Equipo();
			
			Persona2.nombre = "Agustín";
			Persona2.apellido = "Burgos";
			Persona2.edad = 23;
			Persona2.skills = "Java";
			
			
			// INGRESAR PERSONA
			String Persona = "Persona2";
			
			if (Persona.equals("Persona1")) {
				System.out.println("Nombre : " + Persona1.nombre);
				System.out.println("Apellido : " + Persona1.apellido);
				System.out.println("Edad : " + Persona1.edad);
				System.out.println("Sus Skills son : " + Persona1.skills);
			} else if (Persona.equals("Persona2")) {
				System.out.println("Nombre : " + Persona2.nombre);
				System.out.println("Apellido : " + Persona2.apellido);
				System.out.println("Edad : " + Persona2.edad);
				System.out.println("Sus Skills son : " + Persona2.skills);
			}

	}

}
