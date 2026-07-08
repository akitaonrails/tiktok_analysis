package com.ss.lyrax.room;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxRoomStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int duration;
    public int rtt;
    public int rxAudioKbitrate;
    public long rxBytes;
    public int rxCellularKbitrate;
    public int rxJitter;
    public int rxKbitrate;
    public float rxLostrate;
    public int rxScreenKbitrate;
    public int rxVideoKbitrate;
    public int txAudioKbitrate;
    public long txBytes;
    public int txCellularKbitrate;
    public int txJitter;
    public int txKbitrate;
    public float txLostrate;
    public int txScreenKbitrate;
    public int txVideoKbitrate;
    public int userCount;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxRoomStats{txLostrate=");
        sbLIZ.append(this.txLostrate);
        sbLIZ.append(", rxLostrate=");
        sbLIZ.append(this.rxLostrate);
        sbLIZ.append(", rtt=");
        sbLIZ.append(this.rtt);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", txBytes=");
        sbLIZ.append(this.txBytes);
        sbLIZ.append(", rxBytes=");
        sbLIZ.append(this.rxBytes);
        sbLIZ.append(", txKbitrate=");
        sbLIZ.append(this.txKbitrate);
        sbLIZ.append(", rxKbitrate=");
        sbLIZ.append(this.rxKbitrate);
        sbLIZ.append(", rxAudioKbitrate=");
        sbLIZ.append(this.rxAudioKbitrate);
        sbLIZ.append(", txAudioKbitrate=");
        sbLIZ.append(this.txAudioKbitrate);
        sbLIZ.append(", rxVideoKbitrate=");
        sbLIZ.append(this.rxVideoKbitrate);
        sbLIZ.append(", txVideoKbitrate=");
        sbLIZ.append(this.txVideoKbitrate);
        sbLIZ.append(", rxScreenKbitrate=");
        sbLIZ.append(this.rxScreenKbitrate);
        sbLIZ.append(", txScreenKbitrate=");
        sbLIZ.append(this.txScreenKbitrate);
        sbLIZ.append(", userCount=");
        sbLIZ.append(this.userCount);
        sbLIZ.append(", cpuAppUsage=");
        sbLIZ.append(this.cpuAppUsage);
        sbLIZ.append(", cpuTotalUsage=");
        sbLIZ.append(this.cpuTotalUsage);
        sbLIZ.append(", txJitter=");
        sbLIZ.append(this.txJitter);
        sbLIZ.append(", rxJitter=");
        sbLIZ.append(this.rxJitter);
        sbLIZ.append(", txCellularKbitrate=");
        sbLIZ.append(this.txCellularKbitrate);
        sbLIZ.append(", rxCellularKbitrate=");
        sbLIZ.append(this.rxCellularKbitrate);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxRoomStats() {
    }

    public LyraxRoomStats(float f, float f2, int i, int i2, long j, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, double d, double d2, int i12, int i13, int i14, int i15) {
        this.txLostrate = f;
        this.rxLostrate = f2;
        this.rtt = i;
        this.duration = i2;
        this.txBytes = j;
        this.rxBytes = j2;
        this.txKbitrate = i3;
        this.rxKbitrate = i4;
        this.rxAudioKbitrate = i5;
        this.txAudioKbitrate = i6;
        this.rxVideoKbitrate = i7;
        this.txVideoKbitrate = i8;
        this.rxScreenKbitrate = i9;
        this.txScreenKbitrate = i10;
        this.userCount = i11;
        this.cpuAppUsage = d;
        this.cpuTotalUsage = d2;
        this.txJitter = i12;
        this.rxJitter = i13;
        this.txCellularKbitrate = i14;
        this.rxCellularKbitrate = i15;
    }

    public static LyraxRoomStats create(float f, float f2, int i, int i2, long j, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, double d, double d2, int i12, int i13, int i14, int i15) {
        return new LyraxRoomStats(f, f2, i, i2, j, j2, i3, i4, i5, i6, i7, i8, i9, i10, i11, d, d2, i12, i13, i14, i15);
    }
}
