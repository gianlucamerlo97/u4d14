package gianlucamerlo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="partecipazione")

public class Partecipazione {

    private long id;
    private Persona persona;
    private Evento evento;

}
