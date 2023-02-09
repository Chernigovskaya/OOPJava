package calculator.Controller;

import calculator.Model.EquasionModel;

import calculator.Service.Service;
import calculator.Service.ServiceImpl;
import calculator.View.CalcView;

import java.util.List;

public class Controller {
    private Service service = new ServiceImpl();

    public EquasionModel sumNumbers(int a, int b) {
        EquasionModel equasionModelA = new EquasionModel(a);
        EquasionModel equasionModelB = new EquasionModel(b);
        return service.sum(equasionModelA, equasionModelB);
    }
    public EquasionModel differenceNumbers(int a, int b) {
        EquasionModel equasionModelA = new EquasionModel(a);
        EquasionModel equasionModelB = new EquasionModel(b);
        return service.difference(equasionModelA, equasionModelB);

    }
    public EquasionModel multiplicationNumbers(int a, int b) {
        EquasionModel equasionModelA = new EquasionModel(a);
        EquasionModel equasionModelB = new EquasionModel(b);
        return service.multiplication(equasionModelA, equasionModelB);

    }
    public EquasionModel divisionNumbers(int a, int b) {
        EquasionModel equasionModelA = new EquasionModel(a);
        EquasionModel equasionModelB = new EquasionModel(b);
        return service.division(equasionModelA, equasionModelB);

    }


}
