import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> clients = (LinkedList<Person>) generateClients();

        Person currentClient;

        while (!clients.isEmpty()){
            currentClient = clients.poll();
            currentClient.spendTicket();

            System.out.println(currentClient.getFirstName() + " " + currentClient.getLastName() +
                                " прокатился на аттракционе. Билетов осталось: " + currentClient.getAmountOfTickets());

            if(currentClient.getAmountOfTickets() > 0){
                clients.offer(currentClient);
            }
        }
    }

    private static List<Person> generateClients(){
        List<Person> clients = new LinkedList<Person>();

        clients.add(new Person("Алексей", "Николаевич", 5));
        clients.add(new Person("Кирилл", "Кузин", 3));
        clients.add(new Person("Фёдор","Поляков", 1));
        clients.add(new Person("Сергей","Орлов", 7));
        clients.add(new Person("Алёна","Калинина", 4));
        clients.add(new Person("Екатерина", "Круглова", 2));
        clients.add(new Person("Анастасия", "Полякова", 6));
        clients.add(new Person("Татьяна", "Сафонова", 10));
        clients.add(new Person("Софья", "Русанова", 8));

        return clients;
    }
}
