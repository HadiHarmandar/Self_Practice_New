package day04_practices;

public class SalaryCalculator2 {

    public static void main(String[] args) {

        double hourlyRate = 50,
                weeklyHours = 45;
        int stateTaxRate = 6,
                federalTaxRate = 26;

        double grossPay;
        if (weeklyHours > 40) {
            grossPay = ((hourlyRate * 40) + (weeklyHours - 40) * (hourlyRate + hourlyRate / 2)) * 52;
        } else {
            grossPay = hourlyRate * weeklyHours * 52;
        }

        double stateTax = grossPay * (stateTaxRate / 100.),
                federalTax = grossPay * (federalTaxRate / 100.),
                totalTax = stateTax + federalTax,
                netIncome = grossPay - (totalTax);

        System.out.println("Gross pay is: $" + grossPay + "\n" +
                "Federal tax is: $" + federalTax + "\n" +
                "State tax is: $" + stateTax + "\n" +
                "Total tax is: $" + totalTax + "\n" +
                "Net income is: $" + netIncome);

    }
}

/**
 * Create a class named SalaryCalculator, and declare the following variables:
 * hourlyRate
 * weeklyHours
 * stateTaxRate
 * federalTaxRate
 * <p>
 * Use the given info above to calculate the followings:
 * salaryBeforeTax
 * stateTax
 * federalTax
 * totalTax
 * salaryAfterTax
 * <p>
 * Display each of the above in the following format:
 * Ex:
 * hourlyRate = $50
 * weeklyHours = 45
 * stateTax = 6  (given as percentage)
 * federalTax = 26 (given as percentage)
 * <p>
 * output:
 * Gross pay is: $117000
 * Federal tax is: $30420
 * State tax is: $7020
 * Total tax is: $37440
 * Net income is: $79560
 */