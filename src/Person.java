public class Person {
    private String firstName;
    private String lastName;
    private int amountOfTickets;

    public Person(String firstName, String lastName, int amountOfTickets){
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfTickets = amountOfTickets;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAmountOfTickets() {
        return amountOfTickets;
    }

    public void setAmountOfTickets(int amountOfTickets) {
        this.amountOfTickets = amountOfTickets;
    }

    public boolean spendTicket(){
        if (amountOfTickets <= 0) return false;

        amountOfTickets -= 1;
        return true;
    }

    public String ToString(){
        return "Имя: " + firstName + " Фамилия: " + lastName + " билеты: " + amountOfTickets;
    }
}
