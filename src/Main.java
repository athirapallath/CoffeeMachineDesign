public class Main {
    public static void main(String[] args) {


        Coffee baseCoffee = new BasicCoffee();
        AddMilk milkCoffee = new AddMilk(baseCoffee);
        AddSugar sugarCoffee = new AddSugar(milkCoffee);

        System.out.println(sugarCoffee.getDescription()+ ", Cost of coffee: "+ sugarCoffee.cost());

    }
}