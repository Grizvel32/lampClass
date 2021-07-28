package com.company;

public class Main {

    public static void main(String[] args) {
        LampsManager lampsManager = new LampsManager();
        int action = -1;
        boolean isRun = true;

        while (isRun) {
            lampsManager.printLamps();

            ConsoleHelper.PrintMessage("Меню:");
            ConsoleHelper.PrintMessage("1. Добавить лампу в конец списка");
            ConsoleHelper.PrintMessage("2. Удалить лампу по ИД");
            ConsoleHelper.PrintMessage("3. Изменить мощность лампы по ИД");
            ConsoleHelper.PrintMessage("4. Изменить цветовую температуру лампы по ИД");
            ConsoleHelper.PrintMessage("5. Изменить цоколь лампы по ИД");
            ConsoleHelper.PrintMessage("6. Изменить тип лампы по ИД");
            ConsoleHelper.PrintMessage("7. Изменить цвет лампы по ИД");

            ConsoleHelper.PrintMessage("0. Выход");

            action = ConsoleHelper.InputInt("Введите номер пункта меню: ", 0, 5);


            switch (action) {
                case 1: {

                    int powerLamp = ConsoleHelper.InputInt("Введите мощность лампы  (Вт): ");
                    int colourTemperature = ConsoleHelper.InputInt("Введите цветовую температуру (К): ");
                    String base = ConsoleHelper.InputString("Введите цоколь лампы:  ");
                    String brandName = ConsoleHelper.InputString("Введите марку лампы:  ");
                    int typeIndex = ConsoleHelper.InputInt("Введите тип лампы (0-светодиодная, 1- накаливания, 2-галогеновая)", 0, 2);
                    Lamp.Type type = Lamp.Type.values()[typeIndex];

                    int colorIndex = ConsoleHelper.InputInt("Введите индекс цвета (0-красный,1 - желтый, 2- белый): ", 0, 2);
                    Lamp.Color color = Lamp.Color.values()[colorIndex];

                    lampsManager.addLamp(powerLamp, colourTemperature, base, brandName, type, color);
                }
                break;
                case 2: {
                    try {
                        int id = ConsoleHelper.InputInt("Введите ИД лампы для удаления: ");
                        lampsManager.deleteLamp(id);
                    } catch (Exception e) {
                        ConsoleHelper.PrintMessage(e.getMessage());
                    }
                }
                break;
                case 3: {
                    try {
                        int id = ConsoleHelper.InputInt("Введите ИД  для изменения мощности лампы: ");
                        int powerLamp = ConsoleHelper.InputInt("Введите мощность лампы (Вт): ");
                        lampsManager.getByIdLamp(id).setPowerLamp(powerLamp);
                    } catch (Exception e) {
                        ConsoleHelper.PrintMessage(e.getMessage());
                    }
                }
                break;
                case 4: {
                    try {
                        int id = ConsoleHelper.InputInt("Введите ИД  для изменения цветовой температуры лампы (К): ");
                        int colourTemperature = ConsoleHelper.InputInt("Введите цветовую температуру лампы: ");
                        lampsManager.getByIdLamp(id).setColourTemperature(colourTemperature);
                    } catch (Exception e) {
                        ConsoleHelper.PrintMessage(e.getMessage());
                    }
                }
                break;

                case 5: {
                    try {
                        int id = ConsoleHelper.InputInt("Введите ИД  для изменения цоколя лампы: ");
                        String base = ConsoleHelper.InputString("Введите цоколь лампы: ");
                        lampsManager.getByIdLamp(id).setBase(base);
                    } catch (Exception e) {
                        ConsoleHelper.PrintMessage(e.getMessage());
                    }
                    break;

                }
                case 6:
                    try {
                        int id = ConsoleHelper.InputInt("Введите ИД  для изменения типа лампы: ");
                        int typeIndex = ConsoleHelper.InputInt("Введите индекс типа лампы (1-светодиодная, 2- накаливания, 3-галогеновая)", 1, 3);
                        Lamp.Type type = Lamp.Type.values()[typeIndex];

                        lampsManager.getByIdLamp(id).setType(type);
                    } catch (Exception e) {
                        ConsoleHelper.PrintMessage(e.getMessage());
                    }
                    break;

                case 7:
                    try {
                        int id = ConsoleHelper.InputInt("Введите ИД  для изменения цвета лампы: ");
                        int colorIndex = ConsoleHelper.InputInt("Введите индекс цвета (1-красный,2 - желтый, 3- белый): ", 1, 3);
                        Lamp.Color color = Lamp.Color.values()[colorIndex];
                    } catch (Exception e) {
                        ConsoleHelper.PrintMessage(e.getMessage());
                    }
                    break;
            }
        }
    }
}





