package gianlucamerlo.DAO;

import gianlucamerlo.entities.Evento;
import gianlucamerlo.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventiDAO {

    private final EntityManager entityManager;

    public EventiDAO(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    public void save(Evento newevento){
        EntityTransaction transaction=  entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newevento);
        transaction.commit();
        System.out.println("Evento aggiunto con successo!");

    }
    public Evento getById(long id){
        Evento found= entityManager.find(Evento.class,id);
        if (found == null)throw new NotFoundException(id);
        return found;
    }

}
