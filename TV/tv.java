package TV;

public class tv {
    String Brand;
    int ScreenSize;
    int VolumeLevel;
    boolean isOn;

    public tv(String Brand, int ScreenSize, int VolumeLevel, boolean isOn){
        this.Brand = Brand;
        this.ScreenSize = ScreenSize;
        this.VolumeLevel = VolumeLevel;
        this.isOn = isOn;
    }

    public void turnOn(){
        isOn = true;
        System.out.println("Tv is ON.");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("TV is off.");
    }

    public void increaseVolume(){
        VolumeLevel = VolumeLevel + 1;
        if (isOn = true) {
            System.out.println("Volume increased by 1\n " + VolumeLevel );
        }
        else if (isOn = false){
            System.out.println("TV is Off.");
        }
    }

    public void decreaseVolume(){
        VolumeLevel = VolumeLevel - 1;
        if (isOn = true) {
            System.out.println("Volume decreased by 1\n " + VolumeLevel);
        }
        else if (isOn = false) {
            System.out.println("TV is Off.");
        }
    } 
}
