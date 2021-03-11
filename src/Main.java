public class Main {
    public static void main(String[] args) {
        int credit = 1_000_000;
        double month;

        CreditPaymentService service = new CreditPaymentService();

        double monthlyFor12MonthPeriod = service.calculate(credit, 12);
        System.out.println("Кредит " + credit + " руб" + " на 12 месяцев, ежемесячный платеж: " +
                String.format ("%.0f", monthlyFor12MonthPeriod) + " руб");

        double monthlyFor24MonthPeriod = service.calculate(credit, 24);
        System.out.println(String.format ("Кредит " + credit + " руб" + " на 24 месяцев, ежемесячный платеж: " +
                "%.0f", monthlyFor24MonthPeriod) + " руб");

        double monthlyFor36MonthPeriod = service.calculate(credit, 36);
        System.out.println(String.format ("Кредит " + credit + " руб" + " на 36 месяцев, ежемесячный платеж: " +
                "%.0f", monthlyFor36MonthPeriod) + " руб");
    }
}
