package solid;

import solid.dip.DisplayReport;
import solid.dip.PrintReport;
import solid.dip.Report;
import solid.dip.ReportManager;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        ReportManager reportManager = new ReportManager(new DisplayReport());
        report.calculate();
        reportManager.output(report.getItems());
    }
}
