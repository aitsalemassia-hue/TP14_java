package ma.projet.dao;

import ma.projet.entities.Identifiable;
import java.util.ArrayList;
import java.util.List;

public class ListeDao<T extends Identifiable> implements IDao<T> {
    private List<T> stokage = new ArrayList<T>();

    @Override
    public boolean create(T o) {
        if (o != null && getById(o.getId()) == null) {
            return stokage.add(o);
        }
        return false;
    }

    @Override
    public boolean update(T o) {
        if (o != null) {
            for (int i = 0; i < stokage.size(); i++) {
                if (stokage.get(i).getId() == o.getId()) {
                    stokage.set(i, o);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(T o) {
        if (o != null) {
            return stokage.remove(o);
        }
        return false;
    }

    @Override
    public T getById(int id) {
        for (int i = 0; i < stokage.size(); i++) {
            T item = stokage.get(i);
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return stokage;
    }
}