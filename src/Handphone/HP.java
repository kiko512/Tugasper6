package Handphone;

class HP {
    private String brand;
    private String model;
    private Power power;
    private Volume volume;

    public HP(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.power = new Power();
        this.volume = new Volume();
    }

    public void turnOn() {
        power.turnOn();
    }

    public void turnOff() {
        power.turnOff();
    }

    public void increaseVolume() {
        volume.increase();
    }

    public void decreaseVolume() {
        volume.decrease();
    }

    public int getVolumeLevel() {
        return volume.getLevel();
    }

    public String getBrandModel() {
        return brand + " " + model;
    }

}
