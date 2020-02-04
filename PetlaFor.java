package zadanie;

public class PetlaFor {
    public static void main(String[] args){
        String[] days = {"Poniedziałek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela"};

        int index = 0;
        for(;;){
            if (index < days.length) {
                System.out.println(days[index]);
                index++;
            } else{
                break;
            }
        }
    }
}
/*
String v = "a";
switch (v) {
    case "a":
    case "b":
    case "c":
        break;
}
 */