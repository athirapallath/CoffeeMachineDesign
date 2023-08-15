public abstract class Coffee {
  protected StringBuilder description =new StringBuilder("Simple Coffee");
  public StringBuilder getDescription(){
    return description;
  }
  public abstract double cost();
}

class BasicCoffee extends Coffee {
  @Override
  public double cost() {
    return 20;
  }
}

abstract class CoffeDecorator extends Coffee{
  Coffee coffee;
  public CoffeDecorator(Coffee coffee){
    this.coffee=coffee;
  }

  public double cost(){
    return coffee.cost();
  }

}

class AddMilk extends CoffeDecorator {
 public AddMilk(Coffee coffee) {
    super(coffee);
   description = coffee.getDescription().append(" + Milk");
  }

  @Override
  public double cost() {
    return super.cost()+10;
  }
}

class AddSugar extends CoffeDecorator{

  public AddSugar(Coffee coffee) {
    super(coffee);
    description =coffee.getDescription().append(" + Sugar");
  }

  @Override
  public double cost() {
    return super.cost()+10;
  }
}