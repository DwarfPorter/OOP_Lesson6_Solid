package solid;

import solid.srp.models.InputManager;
import solid.srp.models.Order;
import solid.srp.models.SaveManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
//        Order order = new Order("", "", 0, 0);
        InputManager inputManager = new InputManager();
        Order order = inputManager.inputFromConsole();
        SaveManager saveManager = new SaveManager();
        saveManager.saveToJson(order);
    }
}
