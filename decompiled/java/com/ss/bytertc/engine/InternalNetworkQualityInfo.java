package com.ss.bytertc.engine;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class InternalNetworkQualityInfo {
    public double fractionLost;
    public int rtt;
    public int rxNetQuality;
    public int totalBandwidth;
    public int txNetQuality;
    public String uid;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(",fractionLost=");
        sbLIZ.append(this.fractionLost);
        sbLIZ.append(",rtt=");
        sbLIZ.append(this.rtt);
        sbLIZ.append(",totalBandwidth=");
        sbLIZ.append(this.totalBandwidth);
        sbLIZ.append(",txNetQuality=");
        sbLIZ.append(this.txNetQuality);
        sbLIZ.append(",rxNetQuality=");
        sbLIZ.append(this.rxNetQuality);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InternalNetworkQualityInfo(double d, int i, int i2, int i3, int i4) {
        this.uid = "";
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.txNetQuality = i3;
        this.rxNetQuality = i4;
    }

    public InternalNetworkQualityInfo(String str, double d, int i, int i2, int i3, int i4) {
        this.uid = str;
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.txNetQuality = i3;
        this.rxNetQuality = i4;
    }

    public static InternalNetworkQualityInfo create(String str, double d, int i, int i2, int i3, int i4) {
        return new InternalNetworkQualityInfo(str, d, i, i2, i3, i4);
    }
}
