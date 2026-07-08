package com.ss.android.ugc.playerkit.radar;

import X.InterfaceC266480AcQ;

/* JADX INFO: loaded from: classes24.dex */
public interface IRadarTransmitter {
    boolean aLogWriteFuncAddrEnabled();

    boolean analyzerEnabled();

    boolean enabled();

    long getALogSimpleWriteFuncAddr();

    int kernelLogLever();

    int kernelLogLeverPrecise();

    int logNotifyLevel();

    int networkQualityType();

    boolean remoteTransmitEnabled();

    boolean sdkTransmitEnabled();

    void startVideo(String str);

    void tag(String str);

    InterfaceC266480AcQ tracer();

    void transmitE(String str, String str2, Exception exc);

    void transmitI(String str, String str2);

    void transmitW(String str, String str2);

    boolean ttSDKALogOptEnabled();
}
