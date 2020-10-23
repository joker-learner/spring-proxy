package mytest;
/*
利用Spring配置文件构造切面增强
 */

import com.lc.aop.TargetObjInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContent.xml")
public class AppTest {

    @Autowired
    private TargetObjInterface targetObj;

    @Test
    public void test1(){

        targetObj.save();
    }

}
