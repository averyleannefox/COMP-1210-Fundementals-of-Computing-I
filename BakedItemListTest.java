import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BakedItemListTest {


  /** Fixture initialization (common initialization
   *  for all tests). **/
   @Before public void setUp() throws Exception {
      BakedItemList.resetListCount();
   }


  /** A test that always fails. **/
   @Test public void defaultTest() throws Exception {
      BakedItemList b = new BakedItemList();
      Assert.assertEquals("", b.getListName());
   }
  
  /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void getListName() throws Exception {
      BakedItemList b = new BakedItemList();
      Assert.assertEquals("", b.getListName());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void setListName() throws Exception {
      BakedItemList b = new BakedItemList();
      b.setListName("Test");
      Assert.assertEquals("Test", b.getListName());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void getItemList() throws Exception {
      BakedItemList b = new BakedItemList();
      BakedItem[] itemList = {null};
      Assert.assertEquals(itemList[0], b.getItemList()[0]);
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void setItemList() throws Exception {
      BakedItemList b = new BakedItemList();
      String[] ingredientsTrim = {"test"};
      Cookie c = new Cookie("test", "test", 1, ingredientsTrim);
      BakedItem[] itemList = {c};
      b.setItemList(itemList);
      Assert.assertEquals(c, b.getItemList()[0]);
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void getItemCount() throws Exception {
      BakedItemList b = new BakedItemList();
      Assert.assertEquals(0, b.getItemCount());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void setItemCount() throws Exception {
      BakedItemList b = new BakedItemList();
      b.setItemCount(1);
      Assert.assertEquals(1, b.getItemCount());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void getExcludedRecords() throws Exception {
      BakedItemList b = new BakedItemList();
      String[] excludedRecords = {null};
      Assert.assertEquals(excludedRecords[0], b.getExcludedRecords()[0]);
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void setExcludedRecords() throws Exception {
      BakedItemList b = new BakedItemList();
      String[] excludedRecords = {"Test, test, test, 0, test, test, test, test"};
      b.setExcludedRecords(excludedRecords);
      Assert.assertEquals(excludedRecords[0], b.getExcludedRecords()[0]);
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void getExcludedCount() throws Exception {
      BakedItemList b = new BakedItemList();
      Assert.assertEquals(0, b.getExcludedCount());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void setExcludedCount() throws Exception {
      BakedItemList b = new BakedItemList();
      b.setExcludedCount(1);
      Assert.assertEquals(1, b.getExcludedCount());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void getListCount() throws Exception {
      BakedItemList b = new BakedItemList();
      BakedItemList.resetListCount();
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void readItemFile() throws Exception {
      BakedItemList b = new BakedItemList();
      b.readItemFile("baked_item_data.cvs");
      Assert.assertEquals("Auburn's Best Bakery", b.getListName());
      Assert.assertEquals(6, b.getItemCount());
      Assert.assertEquals(2, b.getExcludedCount());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void generateReport() throws Exception {
      BakedItemList b = new BakedItemList();
      b.readItemFile("baked_item_data.cvs");
      String result = "---------------------------------------\n"
             + "Report for Auburn's Best Bakery\n"
             + "---------------------------------------\n"
             + "\n"
             + "Cookie: Chips Delight - Chocolate Chip   "
             + "Quantity: 12   Price: $4.20\n"
             + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
             + " soda, \n"
             + "salt)\n"
             + "\n"
             + "Pie: Weekly Special - Apple   Quantity: 1   "
             + "Price: $12.00\n"
             + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
             + "baking soda, salt)\n"
             + "\n"
             + "Pie: Summer Special - Key Lime   Quantity: 1"
             + "   Price: $14.00\n"
             + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
             + "crackers, \n"
             + "butter, baking soda, salt)\n"
             + "\n"
             + "Cake: Birthday - Chocolate   Quantity: 1   "
             + "Price: $8.00\n"
             + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
             + "butter, baking soda, baking powder, salt)\n"
             + "\n"
             + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
             + "Price: $16.00\n"
             + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
             + "\nbutter, baking soda, baking powder, salt)\n"
             + "\n"
             + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
             + "Quantity: 1   Price: $135.00\n"
             + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
             + "butter, baking soda, baking powder, salt)\n"
             + "\n";
      Assert.assertEquals(result, b.generateReport());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void generateReportByClass() throws Exception {
      BakedItemList b = new BakedItemList();
      b.readItemFile("baked_item_data.cvs");
      String result = "---------------------------------------\n"
             + "Report for Auburn's Best Bakery (by Class)\n"
             + "---------------------------------------\n"
             + "\n"
             + "Cookie: Chips Delight - Chocolate Chip   "
             + "Quantity: 12   Price: $4.20\n"
             + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
             + " soda, \n"
             + "salt)\n"
             + "\n"
             + "Pie: Weekly Special - Apple   Quantity: 1   "
             + "Price: $12.00\n"
             + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
             + "baking soda, salt)\n"
             + "\n"
             + "Pie: Summer Special - Key Lime   Quantity: 1"
             + "   Price: $14.00\n"
             + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
             + "crackers, \n"
             + "butter, baking soda, salt)\n"
             + "\n"
             + "Cake: Birthday - Chocolate   Quantity: 1   "
             + "Price: $8.00\n"
             + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
             + "butter, baking soda, baking powder, salt)\n"
             + "\n"
             + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
             + "Price: $16.00\n"
             + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
             + "\nbutter, baking soda, baking powder, salt)\n"
             + "\n"
             + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
             + "Quantity: 1   Price: $135.00\n"
             + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
             + "butter, baking soda, baking powder, salt)\n"
             + "\n";
      Assert.assertEquals(result, b.generateReport());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void generateReportByPrice() throws Exception {
      BakedItemList b = new BakedItemList();
      b.readItemFile("baked_item_data.cvs");
      String result = "---------------------------------------\n"
             + "Report for Auburn's Best Bakery (by Price)\n"
             + "---------------------------------------\n"
             + "\n"
             + "Cookie: Chips Delight - Chocolate Chip   "
             + "Quantity: 12   Price: $4.20\n"
             + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
             + " soda, \n"
             + "salt)\n"
             + "\n"
             + "Pie: Weekly Special - Apple   Quantity: 1   "
             + "Price: $12.00\n"
             + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
             + "baking soda, salt)\n"
             + "\n"
             + "Pie: Summer Special - Key Lime   Quantity: 1"
             + "   Price: $14.00\n"
             + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
             + "crackers, \n"
             + "butter, baking soda, salt)\n"
             + "\n"
             + "Cake: Birthday - Chocolate   Quantity: 1   "
             + "Price: $8.00\n"
             + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
             + "butter, baking soda, baking powder, salt)\n"
             + "\n"
             + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
             + "Price: $16.00\n"
             + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
             + "\nbutter, baking soda, baking powder, salt)\n"
             + "\n"
             + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
             + "Quantity: 1   Price: $135.00\n"
             + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
             + "butter, baking soda, baking powder, salt)\n"
             + "\n";
      Assert.assertEquals(result, b.generateReport());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void generateReportByFlavor() throws Exception {
      BakedItemList b = new BakedItemList();
      b.readItemFile("baked_item_data.cvs");
      String result = "---------------------------------------\n"
             + "Report for Auburn's Best Bakery (by Flavor)\n"
             + "---------------------------------------\n"
             + "\n"
             + "Cookie: Chips Delight - Chocolate Chip   "
             + "Quantity: 12   Price: $4.20\n"
             + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
             + " soda, \n"
             + "salt)\n"
             + "\n"
             + "Pie: Weekly Special - Apple   Quantity: 1   "
             + "Price: $12.00\n"
             + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
             + "baking soda, salt)\n"
             + "\n"
             + "Pie: Summer Special - Key Lime   Quantity: 1"
             + "   Price: $14.00\n"
             + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
             + "crackers, \n"
             + "butter, baking soda, salt)\n"
             + "\n"
             + "Cake: Birthday - Chocolate   Quantity: 1   "
             + "Price: $8.00\n"
             + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
             + "butter, baking soda, baking powder, salt)\n"
             + "\n"
             + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
             + "Price: $16.00\n"
             + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
             + "\nbutter, baking soda, baking powder, salt)\n"
             + "\n"
             + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
             + "Quantity: 1   Price: $135.00\n"
             + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
             + "butter, baking soda, baking powder, salt)\n"
             + "\n";
      Assert.assertEquals(result, b.generateReport());
   }
   
   /** 
    *test case for BakedItemList. 
    */
    
   @Test 
   public void generateExcludedRecordsReport() throws Exception {
      BakedItemList b = new BakedItemList();
      b.readItemFile("baked_item_data.cvs");
      String result = "---------------------------------------\n"
             + "Excluded Records Report\n"
             + "---------------------------------------\n"
             + "\n"
             + "*** invalid category *** for line:\n"
             + "D,Chips Delight,Chocolate Chip,12,flour,sugar,dark chocolate "
             + "chips,butter,baking soda,salt\n"
             + "*** invalid category *** for line:\n"
             + "R,Weekly Special,Apple,1,0,flour,sugar,apple,cinnamon,butter,"
             + "baking soda,salt\n";
      Assert.assertEquals(result, b.generateExcludedRecordsReport());
   }
   
   
  
}
