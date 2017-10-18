import com.jx.bean.Post;
import com.jx.bean.User;
import com.jx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by CHEN JX on 2017/10/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:/config/spring-*.xml"})
public class UserDAOTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryIdTest(){

        User user = userService.queryById(1);
        List<Post> posts = user.getPosts();
        for(Post p: posts){
            System.out.println("title"+":"+p.getTitile());
    }
        }


}
