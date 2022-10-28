import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demenagement {
  private int number;
  private Map<Integer, Box> boxes = new HashMap<>();

  public Demenagement(int number) {
    this.number = number;
  }

  public void addBox() {
    System.out.println("enter box's key: ");
    Scanner scanner = new Scanner(System.in);
    int boxNumber = scanner.nextInt();
    // let's assume each box has a unique number, and we'll use that number as the key for our hashmap
    boxes.put(boxNumber, new Box(boxNumber));
  }




  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Map<Integer, Box> getBoxes() {
    return boxes;
  }

  public void setBoxes(Map<Integer, Box> boxes) {
    this.boxes = boxes;
  }

  @Override
  public String toString() {
    return "Demenagement{" +
      "number=" + number +
      ", boxes=" + boxes +
      '}';
  }
}
