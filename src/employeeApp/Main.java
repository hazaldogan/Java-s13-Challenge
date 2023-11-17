package employeeApp;

import employeeApp.models.Company;
import employeeApp.models.Employee;
import employeeApp.models.Healthplan;
import employeeApp.models.Plan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {
        Healthplan plan1 = new Healthplan(1,Plan.ADVANCE.getName(), Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2,"A Sigorta",Plan.BASIC);
        System.out.println(plan1);
        String[] healtplans = new String[3];
        healtplans[0] = plan1.getName();
        healtplans[1] = plan2.getName();
        Employee employee = new Employee(1,"Hazal Taştan", "hazl.dogann@gmail.com",
                "1234",healtplans);
        System.out.println(employee);
        employee.addHealthplan(0,Plan.MEDIUM.getName());
        System.out.println(Arrays.toString(employee.getHealthPlans()));
        System.out.println("***************************");
        Company company = new Company(1,"Workintech", 1000000000,
                new String[]{"Hazal Taştan", "Buğra Taştan",null});
        company.addEmployee(0,"Asdasds");
        company.addEmployee(2,"Ahmet Umut Taştan");
        System.out.println(Arrays.toString(company.getDeveloperNames()));
        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale
     * gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args) {
        workWithData();
    }
}
