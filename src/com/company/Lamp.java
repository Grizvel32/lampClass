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
    private int id;
    private int powerLamp;
    private int colourTemperature;
    private String base;
    private String brandName;
    private Type type;
    private Color color;

    //endregion

    //region Constructor

    public Lamp() {
        powerLamp = 12;
        colourTemperature = 4000;
        base = "E27";
        brandName = "ecola";
        type = Type.led;
        color = Color.white;
    }


    public Lamp(int id, int power, int colourTemperature, String base, String brandName, Type type, Color color) {
        this.id = id;
        this.powerLamp = power;
        this.colourTemperature = colourTemperature;
        this.base = base;
        this.brandName = brandName;
        this.type = type;
        this.color = color;
    }

    public Lamp(int id, Lamp lamp) {
        this.id = id;
        this.powerLamp = powerLamp;
        this.colourTemperature = colourTemperature;
        this.base = base;
        this.brandName = brandName;
        this.type = type;
        this.color = color;
    }
    //endregion

    //region Setters

    public void setPowerLamp(int powerLamp) throws Exception {

        if (powerLamp <= 0 || powerLamp > 100) {
            throw new Exception("power must be grate than 0 and less 100");
        }
        this.powerLamp = powerLamp;

    }

    public void setColourTemperature(int colourTemperature) throws Exception {
        if (colourTemperature <= 0 || colourTemperature > 6500 ) {
            throw new Exception("power must be grate than 0 or grater 6500");
        }
        this.colourTemperature = colourTemperature;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //endregion

    //region Getters

    public int getPowerLamp(){
        return powerLamp;
    }

    public int getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public String getBase() {
        return base;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getColourTemperature() {
        return colourTemperature;
    }
    //endregion

    public String getInString() {
        String output = "";

        output += "ИД: " + id + "\n";
        output += "мощность лампы " + powerLamp + "(Вт)\n";
        output += "цветовая температура " + colourTemperature + "(К)\n";
        output += "цоколь " + base + "\n";
        output += "марка " + brandName + "\n";
        output += "тип лампы " + type.getValue() + "\n";
        output += "цвет " + color.getValue() + "\n";

        return output;
    }

}
