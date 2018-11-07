import org.junit.Assert;
import org.junit.Test;

public class JunitDemo {
   //独立运行，不再需要main函数
    @Test
    public void a(){
        System.out.println("太君走这边");
         int s=1;
         // 断言 将预期结果与实际结果进行对比
       Assert.assertEquals(1,s);
    }
    @Test
    public void b(){
        System.out.println("枪毙阿光");

    }
}
