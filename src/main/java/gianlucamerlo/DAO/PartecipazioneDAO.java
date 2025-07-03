package gianlucamerlo.DAO;

import gianlucamerlo.entities.Location;
import gianlucamerlo.entities.Partecipazione;
import gianlucamerlo.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PartecipazioneDAO {
    private final EntityManager entityManager;



    public PartecipazioneDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Partecipazione newpartecipazione){
        EntityTransaction transaction=  entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newpartecipazione);
        transaction.commit();
        System.out.println("Partecipazione aggiunta con successo!");

    }
    public Partecipazione getById(long id){
        Partecipazione found= entityManager.find(Partecipazione.class,id);
        if (found == null)throw new NotFoundException(id);
        return found;
    }
}
