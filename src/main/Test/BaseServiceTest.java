import htmap.pjmanage.dao.BaseDao;
import htmap.pjmanage.service.IBaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BaseServiceTest {
    
    @Autowired
    IBaseService service;

    @Autowired
    BaseDao dao;
    
    @Test
    public void query(){
        dao.selectById(1);
    }
}
