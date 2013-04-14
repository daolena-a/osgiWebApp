package org.scalable;


import org.osgi.app.OtherService;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created with IntelliJ IDEA.
 * User: adrass
 * Date: 12/04/13
 * Time: 21:38
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class Architecture {

public Architecture(){
    OtherService service = new OtherService();
    service.sayHello();
}

        private static final long serialVersionUID = 1L;

        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {

            this.name = name;
        }

}
