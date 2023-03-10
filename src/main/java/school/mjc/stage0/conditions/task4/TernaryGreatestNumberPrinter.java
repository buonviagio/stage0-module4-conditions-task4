package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if(first == second){
            System.out.println(first);
            System.out.println(second);
        }else {
            System.out.println(first > second ? first : second);
        }
    }
}
