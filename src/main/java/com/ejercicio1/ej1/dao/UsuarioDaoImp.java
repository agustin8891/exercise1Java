package com.ejercicio1.ej1.dao;

import com.ejercicio1.ej1.models.Usuario;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        List<Usuario> resultado = entityManager.createQuery(query).getResultList();
        return resultado;
    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        if (usuario != null) {
            entityManager.remove(usuario);
        }
    }

    // Implementa el resto de los métodos de la interfaz aquí, si es necesario
}
