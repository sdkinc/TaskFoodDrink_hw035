public class Drink extends Food {

  /*
  Создать класс Food (еда). В классе должны быть:

      поле "название"
      конструктор, геттер, сеттер
      метод "употребить еду" с каким-нибудь выводом

  Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:

      поле "газированный" (да/нет)
      метод "открыть", который:
          для газированного напитка печатает "пшш",
          для негазированного - "скр"

   */
  private final boolean carbonated;

  public Drink(String name, boolean carbonated) {
    super(name);
    this.carbonated = carbonated;
  }

  private boolean isCarbonated() {
    return carbonated;
  }

  public String openDrink() {
    String message = "Drink with name '" + getName() + "' make so when opened: ";
    if (isCarbonated()) {
      return message + "pssst";
    }
    return message + "сhpok";
  }

}
