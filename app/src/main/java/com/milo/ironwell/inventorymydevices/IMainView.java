package com.milo.ironwell.inventorymydevices;

/**
 * Created by jianglei on 16/8/17.
 */
public interface IMainView {

    void showLastMessage(String message);
    void initClockButton();
    void showClockResult(String result);

    void setMapPosition(double latitude, double longitude);
}
