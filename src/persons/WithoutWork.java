package persons;

import actions.Transfer;

public class WithoutWork extends Person implements Transfer {

    public WithoutWork(String name, int age) {
        super(name, age);
    }

    @Override
    public void transfer(){
        System.out.println(this.name + " неожиданно переместился ");
    }

}
