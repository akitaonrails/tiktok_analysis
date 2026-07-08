package com.ss.lyrax.net;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxNetworkStats {
    public int bandwidthStatus;
    public int bwe;
    public LyraxNetworkQuality downlinkQuality;
    public int estimateBandwidth;
    public double lossRate;
    public int qdelayJitter;
    public int rxCellularKbitrate;
    public int txCellularKbitrate;
    public LyraxNetworkQuality uplinkQuality;

    public LyraxNetworkStats() {
        LyraxNetworkQuality lyraxNetworkQuality = LyraxNetworkQuality.UNKNOWN;
        this.uplinkQuality = lyraxNetworkQuality;
        this.downlinkQuality = lyraxNetworkQuality;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxNetworkStats{lossRate='");
        sbLIZ.append(this.lossRate);
        sbLIZ.append('\'');
        sbLIZ.append(", qdelayJitter='");
        sbLIZ.append(this.qdelayJitter);
        sbLIZ.append('\'');
        sbLIZ.append(", bwe='");
        sbLIZ.append(this.bwe);
        sbLIZ.append('\'');
        sbLIZ.append(", bandwidthStatus='");
        sbLIZ.append(this.bandwidthStatus);
        sbLIZ.append('\'');
        sbLIZ.append(", estimateBandwidth='");
        sbLIZ.append(this.estimateBandwidth);
        sbLIZ.append('\'');
        sbLIZ.append(", uplinkQuality='");
        sbLIZ.append(this.uplinkQuality.value());
        sbLIZ.append('\'');
        sbLIZ.append(", downlinkQuality='");
        sbLIZ.append(this.downlinkQuality.value());
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxNetworkStats(double d, int i, int i2, int i3, int i4, LyraxNetworkQuality lyraxNetworkQuality, LyraxNetworkQuality lyraxNetworkQuality2, int i5, int i6) {
        this.lossRate = d;
        this.qdelayJitter = i;
        this.bwe = i2;
        this.bandwidthStatus = i3;
        this.estimateBandwidth = i4;
        this.uplinkQuality = lyraxNetworkQuality;
        this.downlinkQuality = lyraxNetworkQuality2;
        this.txCellularKbitrate = i5;
        this.rxCellularKbitrate = i6;
    }
}
