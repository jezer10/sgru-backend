package pe.edu.upeu.systemasgru.dao;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.systemasgru.entity.Tipo_Doc;
public interface Tipo_DocDao {
	int create(Tipo_Doc t);
	int update(Tipo_Doc t);
	int delete(int id);
	Tipo_Doc read(int id);
	List<Map<String,Object>>readAll();
}