import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    List<Demenagement> moves = new ArrayList<>();

    moves.add(new Demenagement(1));
    moves.add(new Demenagement(2));
    moves.add(new Demenagement(3));
    moves.add(new Demenagement(4));

    operations(moves);
  }

  private static void operations(List<Demenagement> moves) {
    Scanner scanner = new Scanner(System.in);
    int choice;

    System.out.println("main menu:");
    System.out.println("1- list all demenagement");
    System.out.println("2- add a box to demenagement");
    System.out.println("3- put something in a box");
    choice = scanner.nextInt();
    switch (choice) {
      case 1:
        moves.forEach(System.out::println);
        operations(moves);
        break;
      case 2:
        System.out.println("demenagement number: ");
        int moveNumber = scanner.nextInt();

        Demenagement move = moves.stream().filter(m -> m.getNumber() == moveNumber).findAny().orElse(null);
        assert move != null;
        // boxes.put(move.addBox()) //in order to not have deplicated box numbers across Demenagements.
        move.addBox();
        System.out.println("box added");
        moves.forEach(System.out::println);
        operations(moves);
        break;
      case 3:
        System.out.println("what do you want to add? \n 1- an object \n 2- a box");
        choice = scanner.nextInt();
        switch (choice){
          case 1:
            // TODO know which box to add the object to using demenagement and box ids
            break;
          case 2:
            // TODO know which box to add the box to using demenagement id
            break;
        }
      default:
        main(null);
    }
  }
}
