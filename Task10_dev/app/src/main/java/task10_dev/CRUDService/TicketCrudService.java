package task10_dev.CRUDService;


import org.hibernate.Session;
import org.hibernate.Transaction;
import task10_dev.Entity.Client;
import task10_dev.Entity.Planet;
import task10_dev.Entity.Ticket;
import task10_dev.hibernate.HibernateUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TicketCrudService {

    HibernateUtil util = HibernateUtil.getINSTANCE();
    Session session = util.getSessionFactory().openSession();

    public void createNewTicket(String fromPlanetId, String toPlanetId, Long clientId) {
        Transaction transaction = session.beginTransaction();
            Ticket newTicket = new Ticket();
                newTicket.setCreatedAt(DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss").format(LocalDateTime.now()));
                newTicket.setClient(new ClientCrudService().getClientById(clientId));
                newTicket.setFromPlanet(new PlanetCrudService().getPlanetById(fromPlanetId));
                newTicket.setToPlanet(new PlanetCrudService().getPlanetById(toPlanetId));
            session.persist(newTicket);
        transaction.commit();
        session.close();
    }

}
