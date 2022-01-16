package restaurant;

import java.util.Date;

public class MenuItem {
    public static void main(String[] args) {

        Menu breakfast = new Menu();
        breakfast.setFoodName("PanCakes");
        breakfast.setPrice(3.24);
        breakfast.setDescription("flat jacks that will make your lips smack.");
        breakfast.setType("entre");


        System.out.println("food: "  + breakfast.getFoodName());
    }


}
