package JavaProject2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MarksTester {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(85.0, 80.5, 95.0);
        System.out.println("Student A average marks: " + studentA.getPercentage());
        StudentB studentB= new StudentB(87.0,94.5,67.5);
        System.out.println("Student B average marks: "+ studentB.getPercentage());
    }
}
