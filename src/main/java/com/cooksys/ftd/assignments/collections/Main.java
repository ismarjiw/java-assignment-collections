package com.cooksys.ftd.assignments.collections;

import com.cooksys.ftd.assignments.collections.model.Employee;
import com.cooksys.ftd.assignments.collections.model.Manager;
import com.cooksys.ftd.assignments.collections.model.OrgChart;
import com.cooksys.ftd.assignments.collections.model.Worker;

import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {

        Manager m1 = new Manager("Tom");
        Manager m4 = new Manager("Brad", m1);
        Manager m3 = new Manager("Wilson", m4);
        Manager m2 = new Manager("Ismarji", m3);

        Worker w1 = new Worker("Will", m2);

        OrgChart orgChart = new OrgChart();
        orgChart.addEmployee(w1);
        orgChart.addEmployee(m1);
        orgChart.addEmployee(m2);
        orgChart.addEmployee(m3);
        orgChart.addEmployee(m4);

        System.out.println(m2.getChainOfCommand());
    }

}
