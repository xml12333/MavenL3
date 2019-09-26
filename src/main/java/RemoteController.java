public class RemoteController implements Device,Volume {
    private TvDevice tvDevice;
    public TvDevice getTvDevice() {
        return tvDevice;
    }

    public void setTvDevice(TvDevice tvDevice) {
        this.tvDevice = tvDevice;
    }

    public void connectDevice(TvDevice tvDevice)
    {

    }
    public void disconnectDevice()
    {

    }
    public void switchTheChennel (int x)
    {

    }
    private boolean checkIfDeviceConnected()
    {
        return true;
    }
    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void setChannel(int channel) {

    }

    @Override
    public void currentChannel() {

    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public void mute() {

    }

    public static void main(String[] args) {
        RemoteController obj = new RemoteController();
        System.out.println(obj.checkIfDeviceConnected());
    }
}
