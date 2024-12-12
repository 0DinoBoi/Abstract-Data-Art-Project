import org.code.theater.*;
import org.code.media.*;

public class DataScene extends Scene {

 private Exercising[] exercise; // 1D array of Person objects

  /** Constructor */
  public DataScene() {
    exercise = createExercise();
  }

  /** Returns a 1D array of Exercising objects using the txt files in this project */
  public Exercising[] createExercise(){
    String[] nameArray = FileReader.toStringArray("Name.txt");
    String[] benefitsArray = FileReader.toStringArray("Benefits.txt");
    String[] targetMuscleArray = FileReader.toStringArray("TargetMuscle.txt");
    
    Exercising[] exerciseArray = new Exercising[nameArray.length];
    for (int i = 0; i < exerciseArray.length; i++) {
      exerciseArray[i] = new Exercising(nameArray[i], benefitsArray[i], targetMuscleArray[i]); 
    }

    return exerciseArray;
  }


   public int randomExercise(){
   int randomIndex = (int) (Math.random() * exercise.length); //Randomizes the index according the the length of exercise
   return randomIndex;
   }
  /**
   * The code for drawScene, this is what is being put onto the screen
   */
  public void drawScene() {
    int randomExercise = randomExercise();
    System.out.println("Random Exercise: \n" + randomExercise);
    
 for (int i = 5; i >= 0; i--) {  
   playSound("Booom.wav");
    clear("white"); // Clear the screen with a white background
   setTextHeight(14); // Sets the text size to 14
   setTextStyle(Font.SANS, FontStyle.BOLD); //The text has the font Sans and is bolded.
   drawText("      Random Exercise     ", 90, 50);
    drawText("Name: "+ exercise[randomExercise].getName(), 30, 100);
    drawText("Benefits: "+ exercise[randomExercise].getBenefits(), 30, 150);
    drawText("Target Muscle/s: "+ exercise[randomExercise].gettargetMuscle(), 30, 200);

    setTextColor(Color.PURPLE); // Set text color to purple
    drawText(String.valueOf(i), 200, 390); // Draw the count down number
    pause(1); // Pause the scene
  }
 }
}