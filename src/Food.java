public class Food {

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
    String result = "to your basket will add a one of " + getName();
    return result;
  }
}
