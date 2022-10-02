import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calTest {

        static int pel;
        static int meni;

        @Before
        public  void newTest(){
            pel=2;
            meni=3;
        }

        @Test
        public void plusTest(){
            int res = 5;
            Assert.assertEquals(res, cal.plus(pel,meni));
        }

        @Test
        public void minTest(){
            int res = -1;
            Assert.assertEquals(res, cal.min(pel,meni));
        }

        @Test
        public void umnTest(){
            int res = 6;
            Assert.assertEquals(res, cal.umn(pel,meni));
        }

        @Test
        public void delTest(){
            int res = 1;
            Assert.assertEquals(res, cal.del(pel,meni));
        }

        @Test
        public void stepTest(){
            int res = 4;
            Assert.assertEquals(res, cal.step(pel,meni));
        }


}
