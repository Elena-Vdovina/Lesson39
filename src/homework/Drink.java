package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

  public void setGas(Gas gas) {
    this.gas = gas;
  }

  public void setAlcohol(Alcohol alcohol) {
    this.alcohol = alcohol;
  }

  public Gas getGas() {
    return gas;
  }

  public Alcohol getAlcohol() {
    return alcohol;
  }

  public void openDrink(String name, Gas gas, Alcohol alcohol) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    if (gas == Gas.YES) {
      line = "пшш";
    } else {
      line = "скр";
    }
    if (alcohol == Alcohol.YES) {
      System.out.println("Сколько Вам лет?");
      int age = Integer.parseInt(br.readLine());
      if (age > 18) {
        line += " бульк бульк";
      }
    } else {
      line += " бульк бульк";
    }
    System.out.println(line);
  }
}
