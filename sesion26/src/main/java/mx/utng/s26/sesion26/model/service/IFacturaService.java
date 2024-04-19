package mx.utng.s26.sesion26.model.service;

import mx.utng.s26.sesion26.model.entity.Factura;
import java.util.List;

public interface IFacturaService {
    List<Factura> list();
    Factura getByID(Long id);
    void save(Factura factura);
    void delete(Long id);
}
