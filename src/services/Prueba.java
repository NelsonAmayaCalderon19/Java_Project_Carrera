package services;

import entities.Carrera;

public class Prueba {
	
	public Prueba(){
		
	}
	public static void main(String[] args) {

		Carrera carrera = new Carrera();
		CarreraDao cDao = new CarreraDao();
		
		carrera.setCodigo(117);
		carrera.setNombre("Ingeniería Civil");
		carrera.setSemestre(10);
		carrera.setCredito(160);
		
		System.out.println(cDao.listar().size());
		
		cDao.insertar(carrera);
		
		Carrera c2 = cDao.buscar("118");
		if(c2!=null){
			System.out.println(c2.getNombre());
			c2.setNombre("Ing MINAS");
			cDao.actualizar(c2);
			c2 = cDao.buscar("118");
			System.out.println(c2.getNombre());
			//cDao.eliminar(c2);
		}


	}

}
