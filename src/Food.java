public class Food {

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
  private String name;

  public Food(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String useFood() {
    return "are use an one piece of a '" + getName() + "'";
  }
}
