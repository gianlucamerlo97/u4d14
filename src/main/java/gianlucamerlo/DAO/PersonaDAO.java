package gianlucamerlo.DAO;

import gianlucamerlo.entities.Partecipazione;
import gianlucamerlo.entities.Persona;
import gianlucamerlo.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PersonaDAO {
    private final EntityManager entityManager;





    public PersonaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Persona newpersona){
        EntityTransaction transaction=  entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newpersona);
        transaction.commit();
        System.out.println("Persona aggiunta con successo!");

    }
    public Persona getById(long id){
        Persona found= entityManager.find(Persona.class,id);
        if (found == null)throw new NotFoundException(id);
        return found;
    }
}
