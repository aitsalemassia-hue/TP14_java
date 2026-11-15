package ma.projet.dao;

import java.util.List;

import ma.projet.entities.Identifiable;

public interface IDao<T extends Identifiable> {
	boolean create(T o);
	boolean update(T o);
	boolean delete(T o);
	T getById(int id);
	List<T> getAll();
	
	
	

}
