package gianlucamerlo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Set;
@Entity
@Table(name="partita_di_calcio")
public class PartitaDiCalcio extends Evento{

    private Set<Persona> atleti;

}
