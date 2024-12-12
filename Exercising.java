public class Exercising{

  private String name;     // Name of exercise
  private String benefits;  // Benefits of the exercise
  private String targetMuscle; //The muscle that is being worked 
  
  /** Constructor */
  public Exercising(String name, String benefits, String targetMuscle) {
    this.name = name;
    this.benefits = benefits;
    this.targetMuscle = targetMuscle;
  }

  /** Accessor Method for name */
  public String getName() {
    return name;
  }
  
  /** Accessor Method for benefits */
  public String getBenefits() {
    return benefits;
  }
/** Accessor Method for targetMuscle */
  public String gettargetMuscle(){
    return targetMuscle;
  }
  
  /** toString Method override */
  public String toString() {
    return name + "\nBenefits: " + benefits + "/nTarget Muscle: " + targetMuscle;
  }
  
}