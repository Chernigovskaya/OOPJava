package calculator.Service;

import calculator.Model.EquasionModel;


public class ServiceImpl implements Service{


    @Override
    public EquasionModel sum(EquasionModel a, EquasionModel b) {
        int result = a.getNumber() + b.getNumber();
        return new EquasionModel(result);
    }

    @Override
    public EquasionModel difference(EquasionModel a, EquasionModel b) {
        int result = a.getNumber() - b.getNumber();
        return new EquasionModel(result);
    }

    @Override
    public EquasionModel multiplication(EquasionModel a, EquasionModel b) {
        int result = a.getNumber() * b.getNumber();
        return new EquasionModel(result);
    }

    @Override
    public EquasionModel division(EquasionModel a, EquasionModel b) {
        int result = a.getNumber() / b.getNumber();
        return new EquasionModel(result);
    }
}
