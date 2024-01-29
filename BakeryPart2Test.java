import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BakeryPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() throws Exception {
      BakedItemList.resetListCount();
   }


   /** A test that always fails. **/
   
   @Test 
   public void firstMain() throws Exception {
      BakeryPart2 app = new BakeryPart2();
      String[] args = {null};
      BakeryPart2.main(args);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
   
   /** A test that always fails. **/
   
   @Test 
   public void secondMain() throws Exception {
      BakeryPart2 app = new BakeryPart2();
      String[] args = {"baked_item_data.cvs"};
      BakeryPart2.main(args);
      Assert.assertEquals(1, BakedItemList.getListCount());
   }
   
   /** A test that always fails. **/
   
   @Test 
   public void thirdMain() throws Exception {
      BakeryPart2 app = new BakeryPart2();
      String[] args = {""};
      BakeryPart2.main(args);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
   
   /** A test that always fails. **/
   
   @Test 
   public void forthMain() throws Exception {
      BakeryPart2 app = new BakeryPart2();
      String[] args = {null};
      BakeryPart2.main(args);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
}
