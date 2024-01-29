import java.util.Arrays; 
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.NoSuchElementException;
import java.io.IOException;


   /**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Project 9.  
  * @author Avery Fox
  * @version 11-1-22
  */ 
  
public class BakedItemList {

   private String listName;
   private BakedItem[] itemList = new BakedItem[100];
   private int itemCount;
   private String[] excludedRecords = new String[30];
   private int excludedCount;
   private static int listCount = 0;
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList.
    *
    */
    
   public BakedItemList() {
      listName = "";
      itemCount = 0;
      excludedCount = 0;
      BakedItemList.listCount++;
   }
    
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public String getListName() {
      return listName;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList.
    * @param listNameIn - sets list.
    *
    */
    
   public void setListName(String listNameIn) {
      this.listName = listNameIn;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public BakedItem[] getItemList() {
      return itemList;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param itemListIn - sets list.
    *
    */
    
   public void setItemList(BakedItem[] itemListIn) {
      this.itemList = itemListIn;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public int getItemCount() {
      return itemCount;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param itemCountIn - sets list.
    *
    */
    
   public void setItemCount(int itemCountIn) {
      this.itemCount = itemCountIn;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param excludedRecordsIn - sets list.
    *
    */
    
   public void setExcludedRecords(String[] excludedRecordsIn) {
      this.excludedRecords = excludedRecordsIn;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public int getExcludedCount() {
      return excludedCount;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param excludedCountIn - sets list.
    *
    */
    
   public void setExcludedCount(int excludedCountIn) {
      this.excludedCount = excludedCountIn;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public static int getListCount() {
      return listCount;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList.
    *
    */
    
   public static void resetListCount() {
      BakedItemList.listCount = 0;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param fileName - sets list.
    * @throws FileNotFoundException throws exception.
    *
    */
    
   public void readItemFile(String fileName) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      listName = scanFile.nextLine();
      String[] items;
      char type;
      String stringType;
      while (scanFile.hasNext()) {
         String input = scanFile.nextLine();
         items = input.split(",");
         stringType = items[0];
         type = stringType.toUpperCase().charAt(0);
         
         String nameIn;
         String flavorIn;
         int quantityIn;
         double crustCostIn;
         int layersIn;
         int tiersIn;
         String[] ingredients = new String[50];
         int j;
         String[] ingredientsTrim;
         
         switch (type) {
            case 'C':
            
               try {
                  nameIn = items[1];
                  flavorIn = items[2];
                  quantityIn = Integer.parseInt(items[3]);
                  j = 0;
               
                  for (int i = 0; i < items.length - 4; i++) {
                     ingredients[i] = items[i + 4];
                     j++;
                  }
               
                  ingredientsTrim = Arrays.copyOf(ingredients, j);
                  Cookie c = new Cookie(nameIn, flavorIn, 
                     quantityIn, ingredientsTrim);
                  itemList[itemCount] = c;
                  itemCount++;
               
               } catch (NumberFormatException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               } catch (NoSuchElementException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               } catch (ArrayIndexOutOfBoundsException e) {
                  NoSuchElementException r = new NoSuchElementException();
                  String result = "*** " + r + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
                  
               }
            
               break;
               
            case 'P':
            
               try {
                  nameIn = items[1];
                  flavorIn = items[2];
                  quantityIn = Integer.parseInt(items[3]);
                  crustCostIn = Double.parseDouble(items[4]);
                  j = 0;
               
                  for (int i = 0; i < items.length - 5; i++) {
                     ingredients[i] = items[i + 5];
                     j++;
                  }
               
                  ingredientsTrim = Arrays.copyOf(ingredients, j);
                  Pie p = new Pie(nameIn, flavorIn, quantityIn, 
                     crustCostIn, ingredientsTrim);
                  itemList[itemCount] = p;
                  itemCount++;
               
               } catch (NumberFormatException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               } catch (NoSuchElementException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               } catch (ArrayIndexOutOfBoundsException e) {
                  NoSuchElementException r = new NoSuchElementException();
                  String result = "*** " + r + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
                  
               }
            
               break;
               
            case 'K':
            
               try {
                  nameIn = items[1];
                  flavorIn = items[2];
                  quantityIn = Integer.parseInt(items[3]);
                  layersIn = Integer.parseInt(items[4]);
                  j = 0;
               
                  for (int i = 0; i < items.length - 5; i++) {
                     ingredients[i] = items[i + 5];
                     j++;
                  }
               
                  ingredientsTrim = Arrays.copyOf(ingredients, j);
                  Cake k = new Cake(nameIn, flavorIn, quantityIn, 
                     layersIn, ingredientsTrim);
                  itemList[itemCount] = k;
                  itemCount++;
               
               } catch (NumberFormatException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               } catch (NoSuchElementException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               } catch (ArrayIndexOutOfBoundsException e) {
                  NoSuchElementException r = new NoSuchElementException();
                  String result = "*** " + r + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
                  
               }
            
               break;
               
                              
            case 'W': 
            
               try {
                  nameIn = items[1];
                  flavorIn = items[2];
                  quantityIn = Integer.parseInt(items[3]);
                  layersIn = Integer.parseInt(items[4]);
                  tiersIn = Integer.parseInt(items[5]);
                  j = 0;
               
                  for (int i = 0; i < items.length - 6; i++) {
                     ingredients[i] = items[i + 6];
                     j++;
                  }
               
                  ingredientsTrim = Arrays.copyOf(ingredients, j);
                  WeddingCake w = new WeddingCake(nameIn, flavorIn, 
                     quantityIn, layersIn, tiersIn, ingredientsTrim);
                  itemList[itemCount] = w;
                  itemCount++;
               
               
               } catch (NumberFormatException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               } catch (NoSuchElementException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               } catch (ArrayIndexOutOfBoundsException e) {
                  NoSuchElementException r = new NoSuchElementException();
                  String result = "*** " + r + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
                  
               }
            
               break;
               
            default:
               InvalidCategoryException e = new
                  InvalidCategoryException(String.valueOf(type));
               String result = "*** " + e + " in:\n" + input;
               excludedRecords[excludedCount] = result;
               excludedCount++;
               break;
         }
             
      }
   }
         
         /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public String generateReport() {
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         result += itemList[i].toString() + "\n\n";
      }
      return result;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public String generateReportByClass() {
      BakedItem[] itemListCopy = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemListCopy);
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Class)\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         result += itemListCopy[i].toString() + "\n\n";
      }
      return result;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public String generateReportByPrice() {
      BakedItem[] itemListCopy = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemListCopy, new PriceComparator());
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Price)\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         result += itemListCopy[i].toString() + "\n\n";
      }
      return result;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public String generateReportByFlavor() {
      BakedItem[] itemListCopy = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemListCopy, new FlavorComparator());
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Flavor)\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         result += itemListCopy[i].toString() + "\n\n";
      }
      return result;
   }
    
    /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
    
   public String generateExcludedRecordsReport() {
      String result = "---------------------------------------\n"
         + "Excluded Records Report\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < excludedCount; i++) {
         result += "*** invlaid category *** for line: \n" 
            + excludedRecords[i] + "\n";
      }
      return result;
   }
    
    
    
}