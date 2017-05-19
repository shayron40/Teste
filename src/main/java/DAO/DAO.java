package DAO;

import java.util.List;


public interface DAO<T> {
    
    public boolean salvar(T t);
    public List<T> listar();
    public boolean excluir(T t);
    public boolean editar(T t);
}
