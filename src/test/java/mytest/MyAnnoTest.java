package mytest;

import com.lc.anno.TargetObjInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContentAnno.xml")
public class MyAnnoTest {

    @Autowired
    private TargetObjInterface targetOb;

    @Test
    public void test3() {
        targetOb.save();
    }
}
