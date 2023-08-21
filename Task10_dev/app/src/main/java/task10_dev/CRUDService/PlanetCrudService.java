package task10_dev.CRUDService;

import org.hibernate.Session;
import org.hibernate.Transaction;
import task10_dev.Entity.Client;
import task10_dev.Entity.Planet;
import task10_dev.hibernate.HibernateUtil;

public class PlanetCrudService {
    HibernateUtil util = HibernateUtil.getINSTANCE();
    Session session = util.getSessionFactory().openSession();

    public void createNewPlanet(String id, String name) {

        Transaction transaction = session.beginTransaction();
            Planet newPlanet = new Planet();
            newPlanet.setId(id);
            newPlanet.setName(name);
            session.persist(newPlanet);
        transaction.commit();

        session.close();
    }

    public Planet getPlanetById(String id) {
        Planet planet = session.get(Planet.class, id);
        session.close();
        return planet;
    }

    public Planet updatePlanetById(String id, String name) {

        Transaction transaction = session.beginTransaction();
            Planet planet = session.get(Planet.class, id);
            planet.setName(name);
            session.persist(planet);
        transaction.commit();

        session.close();

        return planet;
    }

    public void deletePlanetById(String id) {
        Transaction transaction = session.beginTransaction();
            Planet planet = session.get(Planet.class, id);
            session.remove(planet);

        transaction.commit();

        session.close();
    }
}
