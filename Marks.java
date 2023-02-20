package JavaProject2;

public abstract class Marks {
    //Task2
    double math;
    double history;
    double biology;


   public abstract double getPercentage();
    Marks (double math,double history,double biology){
        this.math=math;
        this.history=history;
        this.biology=biology;
    }
 }
   class StudentA extends Marks {
       StudentA(double math, double history, double biology) {
           super(math, history, biology);
       }

       @Override
        public double getPercentage() {
           return (math+history+biology)/3;

       }
   }
class StudentB extends Marks {
    StudentB(double math, double  history, double biology) {
        super(math, history, biology);
    }

    @Override
    public double getPercentage() {
        return (math+history+biology)/4;
    }
}
