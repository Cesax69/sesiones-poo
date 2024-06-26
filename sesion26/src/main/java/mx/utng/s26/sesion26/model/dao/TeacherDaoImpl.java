package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.s26.sesion26.model.entity.Teacher;

/**
 * Clase repositorio o dao. Guardar datos
 * anotaciones @repositorio
 */
@Repository
public class TeacherDaoImpl implements ITeacherDao{

//Entity Manager y contexto de persistencia
//Guarda internamente todas las entidades y
//utiliza como una cache datos de DB
@Autowired
private EntityManager em;


    @Override
    public List<Teacher> list() {
        
        return em.createQuery("from Student").getResultList();
    }
    @Override
    public void save(Teacher teacher) {
        if(teacher.getId()!= null && teacher.getId()>0){
            //Actualiza estudiantes
            em.merge(teacher);
        }else{
            em.persist(teacher);
        }
        
    }
    @Override
    public Teacher getById(Long id) {
        return em.find(Teacher.class, id);
    }
    @Override
    public void delete(Long id) {
        Teacher student = getById(id);
        em.remove(student);
    }
    
}
