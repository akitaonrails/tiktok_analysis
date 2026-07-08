package com.ss.bytertc.audio.device.hwearback;

/* JADX INFO: loaded from: classes35.dex */
public interface IHardWareEarback {
    int close();

    int getLatency();

    int init();

    boolean isSupport();

    void onEvent(int i, int i2);

    int open();

    int release();

    int setEffect(int i);

    int setEqualizer(int i);

    int setVolume(int i);
}
