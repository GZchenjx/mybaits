import com.jx.bean.Order;
import com.jx.bean.Person;
import com.jx.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by CHEN JX on 2017/10/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:/config/spring-*.xml"})
public class PersonDAOTest {

    @Autowired
    private PersonService personService;

    @Test
    public void queryByIdTest(){

        Person person = personService.querById(1);
        for(Order order: person.getOrderList()){
            System.out.println(order.getNumber());
        }
    }
}
