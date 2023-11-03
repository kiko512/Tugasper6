package Handphone;

public class Main {
    public static void main(String[] args) {
        HP myPhone = new HP("Poco", "M4 PRO");

        System.out.println("Brand & Model: " + myPhone.getBrandModel());

        myPhone.turnOn();
        myPhone.increaseVolume();
        myPhone.increaseVolume();

        int currentVolume = myPhone.getVolumeLevel();
        System.out.println("Volume saat ini: " + currentVolume);

        myPhone.turnOff();
    }
}