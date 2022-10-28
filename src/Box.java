import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box {
  private int number;
  private Map<Integer, Box> boxes = new HashMap<>();
  private List<TheObject> objects = new ArrayList<>();

  public Box(int number) {
    this.number = number;
  }

  // an overloaded method to achieve putting "something" in the box!
  public void putSomethingInside(TheObject object) {
    objects.add(object);
    System.out.println("you added " + object.getName() + " to this box");
  }

  public void putSomethingInside(Box box){
    boxes.put(box.number, box);
    System.out.println("you added " + box + " to this box");
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

  public List<TheObject> getObjects() {
    return objects;
  }

  public void setObjects(List<TheObject> objects) {
    this.objects = objects;
  }

  @Override
  public String toString() {
    return "Box{" +
      "number=" + number +
      ", boxes=" + boxes +
      ", objects=" + objects +
      '}';
  }
}
