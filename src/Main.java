public class Main {

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
  public static void main(String[] args) {
    Food pizza = new Food("FIRE!!!!!");
    pizza.setName("Fire!! with a red hot chili peppers");
    System.out.println(pizza.getName());
    System.out.println(pizza.useFood());
  }
}