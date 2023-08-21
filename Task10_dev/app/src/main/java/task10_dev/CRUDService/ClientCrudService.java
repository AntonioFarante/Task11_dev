package task10_dev.CRUDService;

import org.hibernate.Session;
import org.hibernate.Transaction;
import task10_dev.Entity.Client;
import task10_dev.hibernate.HibernateUtil;


public class ClientCrudService {
    HibernateUtil util = HibernateUtil.getINSTANCE();
    Session session = util.getSessionFactory().openSession();

    public void createNewClient(String name) {

        Transaction transaction = session.beginTransaction();
            Client newClient = new Client();
            newClient.setName(name);
            session.persist(newClient);
        transaction.commit();

        session.close();
    }

    public Client getClientById(Long id) {
        Client client = session.get(Client.class, id);
        session.close();
        return client;
    }

    public Client updateClientById(Long id, String name) {

        Transaction transaction = session.beginTransaction();
            Client client = session.get(Client.class, id);
            client.setName(name);
            session.persist(client);
        transaction.commit();

        session.close();

        return client;
    }

    public void deleteClientById(Long id) {
        Transaction transaction = session.beginTransaction();
            Client client = session.get(Client.class, id);
            session.remove(client);

        transaction.commit();

        session.close();
    }
}
