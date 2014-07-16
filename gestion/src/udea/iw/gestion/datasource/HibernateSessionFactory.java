package udea.iw.gestion.datasource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import udea.iw.gestion.util.exception.GestionException;

public class HibernateSessionFactory {

	private static HibernateSessionFactory instancia;
	private static SessionFactory sessionFactory = null;
	private static Configuration configuration = new Configuration();

	private HibernateSessionFactory() {
		// TODO Auto-generated constructor stub
	}

	public static HibernateSessionFactory getInstance() {

		if (instancia == null) {
			instancia = new HibernateSessionFactory();
		}

		return instancia;

	}

	public Session getSession() throws GestionException {
		try {
			if (sessionFactory == null) {
				configuration.configure("udea/iw/gestion/conf/hibernate.cfg.xml");
				sessionFactory = configuration.buildSessionFactory();
			}
			return sessionFactory.openSession();
		} catch (HibernateException hibE) {
			throw new GestionException(hibE);
		}

	}

}