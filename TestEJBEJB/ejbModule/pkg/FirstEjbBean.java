package pkg;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(FirstEjb.class)
public class FirstEjbBean implements FirstEjb {

	//@Override
	public void ejbMethod() {
		System.out.println("My First EJB project");
	}
}