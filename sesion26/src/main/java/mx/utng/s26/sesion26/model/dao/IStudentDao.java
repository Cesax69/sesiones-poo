package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import mx.utng.s26.sesion26.model.entity.Factura;

public interface IStudentDao {
  List<Factura> list();
  void save(Factura student);
  Factura getById(Long id);
  void delete(Long id);
  
} 