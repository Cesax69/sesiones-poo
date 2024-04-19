package mx.utng.s26.sesion26.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Teacher {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 90)
    private String name;

    @Min(0)
    @Max(50)
    private int years0fService;

    @Temporal(TemporalType.TIMESTAMP)
    private Date recorAt;

    @PrePersist
    public void prePersist(){
        recorAt = new Date(); 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears0fService() {
        return years0fService;
    }

    public void setYears0fService(int years0fService) {
        this.years0fService = years0fService;
    }

    public Date getRecorAt() {
        return recorAt;
    }

    public void setRecorAt(Date recorAt) {
        this.recorAt = recorAt;
    }
    
    
}
