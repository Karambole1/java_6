import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception{
        super_Evaporator s_Evaporator = new super_Evaporator(1);
        Evaporator common_Evaporator = new Evaporator();

        s_Evaporator.Evaporator_INFO(1);
        common_Evaporator.Evaporator_INFO();

        Evaporator_splash new_evaporator = new Evaporator_splash();
        new_evaporator.Splash();

        new_evaporator.angel();

//        super_Evaporator copy1 = (super_Evaporator) s_Evaporator.clone();
//        copy1.factory_number_list[1] = 45;
//        for (int i = 0; i < copy1.factory_number_list.length; i++){
//            System.out.print(copy1.factory_number_list[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < s_Evaporator.factory_number_list.length; i++){
//            System.out.print(s_Evaporator.factory_number_list[i] + " ");
//        }


        super_Evaporator copy2 = (super_Evaporator) s_Evaporator.clone();
        copy2.factory_number_list[1] = 45;
        for (int i = 0; i < copy2.factory_number_list.length; i++){
            System.out.print(copy2.factory_number_list[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < s_Evaporator.factory_number_list.length; i++){
            System.out.print(s_Evaporator.factory_number_list[i] + " ");
        }
        System.out.println("\n");

        age_of_evaporator<Integer> age = new age_of_evaporator<Integer>(10);
        age.print_age();
        age_of_evaporator<String> age1 = new age_of_evaporator<String>("ten");
        age1.print_age();
    }
}