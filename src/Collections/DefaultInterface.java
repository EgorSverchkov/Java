package Collections;

public interface DefaultInterface {

    final Integer employees = 129;
    final Double money = 30000.0;

    default Double allMoney(Integer employees,Double money){
        return employees * money;
    }



}
