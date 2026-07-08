package com.ss.bytertc.engine;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class InternalRTCStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int rtt;
    public int rxAudioKBitRate;
    public int rxBytes;
    public int rxCellularKBitrate;
    public int rxJitter;
    public int rxKBitRate;
    public double rxLostrate;
    public int rxScreenKBitRate;
    public int rxVideoKBitRate;
    public int totalDuration;
    public int txAudioKBitRate;
    public int txBytes;
    public int txCellularKBitrate;
    public int txJitter;
    public int txKBitRate;
    public double txLostrate;
    public int txScreenKBitRate;
    public int txVideoKBitRate;
    public int users;

    public void reset() {
        this.totalDuration = 0;
        this.txBytes = 0;
        this.rxBytes = 0;
        this.txKBitRate = 0;
        this.rxKBitRate = 0;
        this.txAudioKBitRate = 0;
        this.rxAudioKBitRate = 0;
        this.txVideoKBitRate = 0;
        this.rxVideoKBitRate = 0;
        this.txScreenKBitRate = 0;
        this.rxScreenKBitRate = 0;
        this.users = 0;
        this.cpuTotalUsage = 0.0d;
        this.cpuAppUsage = 0.0d;
        this.rxLostrate = 0.0d;
        this.txLostrate = 0.0d;
        this.rtt = 0;
        this.txJitter = 0;
        this.rxJitter = 0;
        this.txCellularKBitrate = 0;
        this.rxCellularKBitrate = 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RtcStats{totalDuration=");
        sbLIZ.append(this.totalDuration);
        sbLIZ.append(", txBytes=");
        sbLIZ.append(this.txBytes);
        sbLIZ.append(", rxBytes=");
        sbLIZ.append(this.rxBytes);
        sbLIZ.append(", txKBitRate=");
        sbLIZ.append(this.txKBitRate);
        sbLIZ.append(", rxKBitRate=");
        sbLIZ.append(this.rxKBitRate);
        sbLIZ.append(", txAudioKBitRate=");
        sbLIZ.append(this.txAudioKBitRate);
        sbLIZ.append(", rxAudioKBitRate=");
        sbLIZ.append(this.rxAudioKBitRate);
        sbLIZ.append(", txVideoKBitRate=");
        sbLIZ.append(this.txVideoKBitRate);
        sbLIZ.append(", rxVideoKBitRate=");
        sbLIZ.append(this.rxVideoKBitRate);
        sbLIZ.append(", txScreenKBitRate=");
        sbLIZ.append(this.txScreenKBitRate);
        sbLIZ.append(", rxScreenKBitRate=");
        sbLIZ.append(this.rxScreenKBitRate);
        sbLIZ.append(", users=");
        sbLIZ.append(this.users);
        sbLIZ.append(", cpuTotalUsage=");
        sbLIZ.append(this.cpuTotalUsage);
        sbLIZ.append(", cpuAppUsage=");
        sbLIZ.append(this.cpuAppUsage);
        sbLIZ.append(", txLostrate=");
        sbLIZ.append(this.txLostrate);
        sbLIZ.append(", rxLostrate=");
        sbLIZ.append(this.rxLostrate);
        sbLIZ.append(", rtt=");
        sbLIZ.append(this.rtt);
        sbLIZ.append(", txJitter=");
        sbLIZ.append(this.txJitter);
        sbLIZ.append(", rxJitter=");
        sbLIZ.append(this.rxJitter);
        sbLIZ.append(", txCellularKBitrate=");
        sbLIZ.append(this.txCellularKBitrate);
        sbLIZ.append(", rxCellularKBitrate=");
        sbLIZ.append(this.rxCellularKBitrate);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InternalRTCStats() {
    }

    public InternalRTCStats(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, double d, double d2, double d3, double d4, int i13, int i14, int i15, int i16, int i17) {
        this.totalDuration = i;
        this.txBytes = i2;
        this.rxBytes = i3;
        this.txKBitRate = i4;
        this.rxKBitRate = i5;
        this.txAudioKBitRate = i6;
        this.rxAudioKBitRate = i7;
        this.txVideoKBitRate = i8;
        this.rxVideoKBitRate = i9;
        this.txScreenKBitRate = i10;
        this.rxScreenKBitRate = i11;
        this.users = i12;
        this.cpuTotalUsage = d;
        this.cpuAppUsage = d2;
        this.rxLostrate = d4;
        this.txLostrate = d3;
        this.rtt = i13;
        this.txJitter = i14;
        this.rxJitter = i15;
        this.txCellularKBitrate = i16;
        this.rxCellularKBitrate = i17;
    }

    public static InternalRTCStats create(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, double d, double d2, double d3, double d4, int i13, int i14, int i15, int i16, int i17) {
        return new InternalRTCStats(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, d, d2, d3, d4, i13, i14, i15, i16, i17);
    }
}
