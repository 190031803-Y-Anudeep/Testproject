package skill8;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class testedclient {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sf = cfg.buildSessionFactory();  
    Session session = sf.openSession();  
    
    Ricebag rb=new Ricebag();
    rb.setId(1);
    rb.setType_of_rice("polished");
    rb.setCost(50);
    rb.setWeight(25);
    Transaction t = session.beginTransaction();  
    session.save(rb);
    t.commit();
    System.out.println("object saved");
    session.close();
    sf.close();
    
  }

}