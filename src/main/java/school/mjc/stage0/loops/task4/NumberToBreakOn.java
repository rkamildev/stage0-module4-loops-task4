package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith <= numberToGoUntil) {
            for (int i = 1; i <= numberToGoUntil; i++) {
                if (i == toBreakWith){
                    System.out.println(i);
                    break;
                }
                System.out.println(i);
            }
        }
        else {
            System.out.println("iterating till the end");
            int i = 1;
            while (i <= numberToGoUntil){
                System.out.println(i++);
            }
        }
    }
}
