package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.s26.sesion26.model.entity.Factura;

/**
 * Clase repositorio o dao. Guardar datos
 * anotaciones @repositorio
 */
@Repository
public class FacturaDaoImpl implements IFacturaDao{

//Entity Manager y contexto de persistencia
//Guarda internamente todas las entidades y
//utiliza como una cache datos de DB
@Autowired
private EntityManager em;


    @Override
    public List<Factura> list() {
        
        return em.createQuery("from Factura").getResultList();
    }
    @Override
    public void save(Factura student) {
        if(student.getId()!= null && student.getId()>0){
            //Actualiza estudiantes
            em.merge(student);
        }else{
            em.persist(student);
        }
        
    }
    @Override
    public Factura getById(Long id) {
        return em.find(Factura.class, id);
    }
    @Override
    public void delete(Long id) {
        Factura student = getById(id);
        em.remove(student);
    }
    
}
