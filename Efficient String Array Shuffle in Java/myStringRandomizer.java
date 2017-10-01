import java.util.Random;

public class myStringRandomizer{
  
// main class
  
  public static void main(String[] args) {
    
    // declaring array
    
    int variableArrayLength = 5;
    String[] array = new String[variableArrayLength];
    
    // populating array from elsewhere
    
    populateStringArray(array);
    
    // shuffling array
    
    shuffleArray(array);
    
    // printing array
    
    for (int i=0; i<array.length; i++)
    {
      System.out.println(array[i]);
    }
  }
  
  public static void populateStringArray(String[] array)
  {
    array[0] = "Cheese";
    array[1] = "Pepperoni";
    array[2] = "Black Olives";
    array[3] = "Almond";
    array[4] = "SaadatIsADick";
    
  }
  
  // array shuffler
  
  private static void shuffleArray(String[] array)
  {
     Random rgen = new Random();

    for (int i = 0; i < array.length; i++) {
        int randPos = rgen.nextInt(array.length);
        String tmp = array[i];
        array[i] = array[randPos];
        array[randPos] = tmp;
    }
  }
}
