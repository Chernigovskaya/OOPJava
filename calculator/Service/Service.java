package calculator.Service;

import calculator.Model.EquasionModel;

public interface Service {
    public EquasionModel sum(EquasionModel a, EquasionModel b);
    public EquasionModel difference(EquasionModel a, EquasionModel b);
    public EquasionModel multiplication(EquasionModel a, EquasionModel b);
    public EquasionModel division(EquasionModel a, EquasionModel b);


}
