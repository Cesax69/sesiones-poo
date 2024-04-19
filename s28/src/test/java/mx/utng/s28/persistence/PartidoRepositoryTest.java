package mx.utng.s28.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;
import mx.utng.s28.model.Partido;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PartidoRepositoryTest {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private PartidoRepository partidoRepository;

        @BeforeAll
    void cleanDatabase (){
        partidoRepository.deleteAll();
    }


    @Test
    @DisplayName("Guardar un partido")
    void canSave() {
        // Instancio un partido
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        equipo1.setNombre("Chivas");
        equipo2.setNombre("America");

        equipoRepository.save(equipo1);
        equipoRepository.save(equipo2); 

        Partido partido = new Partido();
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        partido.setMarcadorEquipo1(0);
        partido.setMarcadorEquipo2(0);
        
        partidoRepository.save(partido);

        assertNotNull(partido.getId());
        assertNotEquals(0, partido.getId());
    }
    @Test
    @DisplayName("Buscar por nombre")
    void canFindByName(){
        //Instancio un equipo
        String name = "Chivas";
}