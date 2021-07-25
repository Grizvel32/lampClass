package com.company;

public class Lamp {
    // region Enum Color
    public enum Type{
        led("светодиодная"),
        glow("накаливания"),
        halogen("галогеновая");

        private final String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    public enum Color {
        red("красный"),
        yellow("желтый"),
        white("белый");
        private final String value;

        Color(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    //endregion

    //region Variables
    private int power;
    private int colourTemperature;
    private String base;
    private String brandName;
    private Type type;
    private Color color;

    //endregion

    //region Constructor

    public Lamp() {
        power = 12;
        colourTemperature = 4000;
        base = "E27";
        brandName = "ecola";
        type = Type.led;
        color = Color.white;
    }


    public Lamp(int power, int colourTemperature, String base, String brandName, Type type, Color color) {
        this.power = power;
        this.colourTemperature = colourTemperature;
        this.base = base;
        this.brandName = brandName;
        this.type = type;
        this.color = color;
    }

    public Lamp(Lamp lamp) {
        this.power = power;
        this.colourTemperature = colourTemperature;
        this.base = base;
        this.brandName = brandName;
        this.type = type;
        this.color = color;
    }
    //endregion

    //region Setters

    public void setPower(int power) throws Exception {

        if (power <= 0) {
            throw new Exception("power must be           grate than 0");
        }
        this.power = power;

    }
    //endregion

    //region Getters

    public int getPower(){
        return power;
    }
    //endregion

    public String getInString() {
        String output = "";

        output += "мощность лампы " + power + "(Вт)\n";
        output += "цветовая температура " + colourTemperature + "(К)\n";
        output += "цоколь " + base + "\n";
        output += "марка " + brandName + "\n";
        output += "тип лампы " + type.getValue() + "\n";
        output += "цвет " + color.getValue() + "\n";

        return output;
    }

}
