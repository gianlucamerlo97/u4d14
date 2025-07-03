package gianlucamerlo.DAO;

import gianlucamerlo.entities.Evento;
import gianlucamerlo.entities.Location;
import gianlucamerlo.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class LocationDAO {
    private final EntityManager entityManager;

    public LocationDAO(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    public void save(Location newlocation){
        EntityTransaction transaction=  entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newlocation);
        transaction.commit();
        System.out.println("Location aggiunta con successo!");

    }
    public Location getById(long id){
        Location found= entityManager.find(Location.class,id);
        if (found == null)throw new NotFoundException(id);
        return found;
    }

}
