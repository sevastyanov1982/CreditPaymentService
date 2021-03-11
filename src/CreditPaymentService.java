
public class CreditPaymentService {
    public double calculate(int credit, double month) {
        double percent = 9.99;
        double percentMonth = percent/12/100; ///процент за месяц

        double Coefficient = percentMonth*Math.pow(1+percentMonth,month)/(Math.pow(1+percentMonth,month)-1);
        double periodPay = Coefficient*credit;
        return periodPay;
    }
}
