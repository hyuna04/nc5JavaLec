package chap10_abstraction.product;

import chap10_abstraction.product.Tv_.Tv;

public class LgTv_ extends Tv {
    public void powerOn() {
        System.out.println("LGTV 켬");
    }

    public void powerOff() {
        System.out.println("LG 끔");
    }

    public void operate(int channel) {
        System.out.println("LGTV" + channel + "로 이동");
        super.lastChannel = channel;
    }
}
