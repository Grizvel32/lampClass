package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int powerLamp, colourTemperature, base, brandName,type;

        int action = -1;
        boolean isRun = true;

        while (isRun) {

            System.out.println("Меню:");
            System.out.println("1. Создать стандартную лампочку ");
            System.out.println("2. Создать лампочку с заданными параметрами");

            System.out.println("0. Выход");

            System.out.print("Введите номер пункта меню: ");
            action = input.nextInt();

            switch (action) {
                case 1: {
                    Lamp lamp1 = new Lamp();
                    System.out.println(lamp1.getInString());
                }
                break;
                case 2: {
                    Lamp lamp2 = new Lamp(8,4000,"E27","philips",Lamp.Type.halogen,Lamp.Color.yellow);
                    System.out.println(lamp2.getInString());
                }

                case 0: {
                    isRun = false;
                }
                break;

                default: {
                    System.out.println("Ошибка. Такой команды не существует");
                }
                break;
            }
            }
        }
    }
