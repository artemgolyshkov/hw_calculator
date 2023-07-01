package skypro.homeworks.calculator.service;

public interface CalculatorService {

    Number plus(Integer a, Integer b);

    Number minus(Integer a, Integer b);

    Number multiply(Integer a, Integer b);

    Number divide(Integer a, Integer b);

    String checkInputsForNull(Integer a, Integer b);

}
