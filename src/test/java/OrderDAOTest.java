import com.jx.bean.Order;
import com.jx.service.OrderService;
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
public class OrderDAOTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void queryByOrderIdTest(){

        Order order = orderService.queryByOrderId(1);
        System.out.println(order.getPerson().getPersonName());
    }
}
