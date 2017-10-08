package com.example.chinhpc.triphunter;

/**
 * Created by ChinhPC on 10/1/2017.
 */

public class ListDiaDanh {
    String tenDiaDanh;
    String gioiThieu;
    String flagName;
    public ListDiaDanh(String flagName,String tenDiaDanh,String gioiThieu) {
        this.tenDiaDanh = tenDiaDanh;
        this.gioiThieu = gioiThieu;
        this.flagName= flagName;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public String getTenDiaDanh() {
        return tenDiaDanh;
    }

    public void setTenDiaDanh(String tenDiaDanh) {
        this.tenDiaDanh = tenDiaDanh;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    @Override
    public String toString() {
        return "ListDiaDanh{" +
                ", tenDiaDanh='" + tenDiaDanh + '\'' +
                ", gioiThieu='" + gioiThieu + '\'' +
                '}';
    }
}
