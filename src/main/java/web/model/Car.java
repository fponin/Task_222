package web.model;

public class Car {
    private String modelCar;
    private String colorCar;
    private int year;

    public Car(String modelCar, String colorCar, int year) {
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.year = year;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                ", year=" + year +
                '}';
    }
}
