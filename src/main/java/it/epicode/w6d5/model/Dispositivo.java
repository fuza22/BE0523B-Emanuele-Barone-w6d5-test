package it.epicode.w6d5.model;

import it.epicode.w6d5.enums.Disponibilita;
import it.epicode.w6d5.enums.Tipologia;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Dispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.STRING)
    private Disponibilita disponibilita;

    @Enumerated(EnumType.STRING)
    private Tipologia tipologia;

    @ManyToOne
    @JoinColumn(name = "dipendente_fk")
    private Dipendente dipendente;

}
