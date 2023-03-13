package homework;

public class Food {
// Создать класс Food (еда). В классе должны быть:
//   поле "название"
//   поле "калорийность"
//   конструктор, геттеры, сеттеры
//   метод "употребить еду" с каким-нибудь выводом

  private String name;
  final private double calories;

  public Food(String name, double calories) {
    this.name = name;
    this.calories = calories;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public double getCalories() {
    return calories;
  }
}
