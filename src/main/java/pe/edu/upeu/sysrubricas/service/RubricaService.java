//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Rubricas;

public interface RubricaService {
	int create (Rubricas r);
	int update (Rubricas r);
	int delete(int id);
	Map<String,Object> read(int id);//un map es un arrai que trajaba con una llave(string) y un objeto
	Map<String,Object>readAll();	
}
