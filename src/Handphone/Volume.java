package Handphone;

class Volume {
    private int level;

    public Volume() {
        this.level = 30;
    }

    public void increase() {
        if (level < 100) {
            level += 10;
            System.out.println("Volume dinaikkan menjadi " + level);
        } else {
            System.out.println("Volume sudah maksimum");
        }
    }

    public void decrease() {
        if (level > 0) {
            level -= 10;
            System.out.println("Volume diturunkan menjadi " + level);
        } else {
            System.out.println("Volume sudah minimum");
        }
    }

    public int getLevel() {
        return level;
    }
}