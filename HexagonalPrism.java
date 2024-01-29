import java.text.DecimalFormat;

/**
 * Program that stores label, edge and height.
 *
 * Project 4.  
 * Avery Fox – COMP 1210 - Module 4
 * 9-13-22
 */ 

public class HexagonalPrism
{
// instance varibles

   private String label = " ";
   private double edge = 0.0;
   private double height = 0.0;
   private double calcSurfaceArea = 0.0;
   private double calcLateralSurfaceArea = 0.0;
   private double calcBaseArea = 0.0;
   private double calcVolume = 0.0;      
   
   
   
   

// constructers

   /**
    * Initilizes varibles.
    * @param labelIn sets string input to variable.
    * @param edgeIn sets double input to variable.
    * @param heightIn sets double input to variable.
    */ 

   public HexagonalPrism(String labelIn, double edgeIn, double heightIn)
   {
   
      
      label = labelIn;
      edge = edgeIn;
      height = heightIn;
      
      
      
   }
   
   // methods
   
    /**
    * Gets label.
    * @return label
    */
       
   public String getLabel() 
   { 
      return label;
   }
   
    /**
    * Prints out correct format.
    * @return isSetLabel
    * @param labelIn sets label.
    */ 
    
   public boolean setLabel(String labelIn)
   {
      if (label != null)
      {
         label = labelIn;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
    * Gets edge.
    * @return edge.
    */
       
   public double getEdge() 
   { 
      return edge;
   }
   
    /**
    * Prints out correct format.
    * @return isSetEdge
    * @param edgeIn sets edge.
    */ 
    
   public boolean setEdge(double edgeIn)
   {
      edge = edgeIn;
      return true;
   }
   
   /**
    * Gets height.
    * @return height.
    */
       
   public double getHeight() 
   { 
      return height;
   }
   
    /**
    * Prints out correct format.
    * @return isSetHeight
    * @param heightIn sets height.
    */ 
    
   public boolean setHeight(double heightIn)
   {
      height = heightIn;
      return true;
   }
   
   // calculation methods
   
   /**
    * Calculates user inputs for surface area.
    * @return isSurfaceArea
    */ 
    
   
   public double surfaceArea()
   { 
      calcSurfaceArea = (6 * edge * height 
         + 3 * Math.sqrt(3) * Math.pow(edge, 2));
      return calcSurfaceArea;
   }
   
   /**
    * Calculates user inputs for lateral surface area.
    * @return isLateralSurfaceArea
    */ 
   
   public double lateralSurfaceArea()
   {
      calcLateralSurfaceArea = (6 * edge * height);
      return calcLateralSurfaceArea;
   }
   
   /**
    * Calculates user inputs for lateral surface area.
    * @return isBaseArea
    */ 
   
   public double baseArea()
   {
      calcBaseArea = (3 * Math.sqrt(3) * Math.pow(edge, 2) / 2);
      return calcBaseArea;
   }
   
   /**
    * Calculates user inputs for lateral surface area.
    * @return isVolume
    */ 
   
   public double volume()
   {
      calcVolume =  (3 * Math.sqrt(3) / 2 * Math.pow(edge, 2) * height);
      return calcVolume;
   }
   
   // toString method
   
   /**
    * Calculates user inputs for lateral surface area.
    * @return isToString
    */ 
   
   public String toString()
   {
   
      calcSurfaceArea = surfaceArea();
      calcLateralSurfaceArea = lateralSurfaceArea();
      calcBaseArea = baseArea();
      calcVolume = volume();
      
    
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      System.out.println();
   
      System.out.println("HexagonalPrism " + label 
         + " has 8 faces, 18 edges, and 12 vertices.");
     
     
      String output = "\tedge = " + df.format(edge) + " units \n"
         + "\theight: " + df.format(height) + " units \n"
         + "\tlateral surface area: " 
            + df.format(calcLateralSurfaceArea) + " square units \n"
         + "\tbase area: " 
            + df.format(calcBaseArea) + " square units \n"      
         + "\tsurface area: " 
            + df.format(calcSurfaceArea) + " square units \n"
         + "\tvolume: " 
            + df.format(calcVolume) + " cubic units \n";  
           
      return output; 
   }
}