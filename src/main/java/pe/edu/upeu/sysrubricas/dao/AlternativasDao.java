package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Alternativas;


public interface AlternativasDao {
	int create(Alternativas a);
	int update(Alternativas a);
	int delete(int id);
	Map<String,Object> read(int id);//un map es un arrai que trajaba con una llave(string) y un objeto
	Map<String,Object>readAll();
	String prueba(String texto);
}
