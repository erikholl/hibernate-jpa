package be.intecbrussel.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Color {
    @Id
    private int colorId;
    private String name;

    private int red;                    // number between 0 and 255
    private int green;                  //      ,,      ,,
    private int blue;                   //      ,,      ,,

    private int hue;                    // number between 0 and 360
    private float saturation;           // number between 0 and 100
    private float brightness;           // number between 0 and 100

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getHue() {
        return hue;
    }

    public void setHue(int hue) {
        this.hue = hue;
    }

    public float getSaturation() {
        return saturation;
    }

    public void setSaturation(float saturation) {
        this.saturation = saturation;
    }

    public float getBrightness() {
        return brightness;
    }

    public void setBrightness(float brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorId=" + colorId +
                ", name='" + name + '\'' +
                ", red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", hue=" + hue +
                ", saturation=" + saturation +
                ", brightness=" + brightness +
                '}';
    }
}
