package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Persona;

public interface PersonaService {

	int update(Persona p);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
