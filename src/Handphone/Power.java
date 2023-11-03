package Handphone;

class Power {
    private boolean isOn;

    public Power() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Menyalakan HP");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Mematikan HP");
    }

    public boolean isOn() {
        return isOn;
    }
}