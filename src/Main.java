public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Сара", 30, 112),
                new Person("Джон", 12,113),
                new Person("Иван",25,114),
                new Person("Том",35,115),
        };
        Customer[] customers = {
                new Customer("Сара", 30, 112, 1114),
                new Customer("Иван",25,114,1115),
                new Customer("Том",35,115,1116),

        };
        Gamer[] gamers = {
                 new Gamer("Сара", 30, 112, "pc"),
                new Gamer("Иван",25,114,"pc"),
                new Gamer("Том",35,115,"pc"),
        };
        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);
    }
}