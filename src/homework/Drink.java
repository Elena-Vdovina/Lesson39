package homework;

public class Drink extends Food {
// Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
//   поле "газированный" (да/нет)
//   поле "алкогольный" (да/нет)
//   метод "открыть", который:
//     для газированного напитка печатает "пшш",
//     для негазированного - "скр",
//     а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.

  enum Gas {
    YES,
    NO
  }

  enum Alcohol {
    YES,
    NO
  }

  private Gas gas;
  private Alcohol alcohol;

  public Drink(String name, double calories, Gas gas, Alcohol alcohol) {
    super(name, calories);
    this.gas = gas;
    this.alcohol = alcohol;
  }

}
