package AccountTest;

import com.itheima.domain.Account;
import com.itheima.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class accountTest {


    @Autowired
    private AccountMapper accountMapper;

    //后台测试
    @Test
    public void test1(){

        List<Account> accountList = accountMapper.findAll();

        for (Account account : accountList) {
            System.out.println(account);
        }


    }
}
