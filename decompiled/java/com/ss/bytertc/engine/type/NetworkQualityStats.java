package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalNetworkQualityInfo;

/* JADX INFO: loaded from: classes21.dex */
public class NetworkQualityStats {
    public double fractionLost;
    public int rtt;
    public int rxQuality;
    public int totalBandwidth;
    public int txQuality;
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
        sbLIZ.append(",txQuality=");
        sbLIZ.append(this.txQuality);
        sbLIZ.append(",rxQuality=");
        sbLIZ.append(this.rxQuality);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NetworkQualityStats(InternalNetworkQualityInfo internalNetworkQualityInfo) {
        this.uid = internalNetworkQualityInfo.uid;
        this.fractionLost = internalNetworkQualityInfo.fractionLost;
        this.rtt = internalNetworkQualityInfo.rtt;
        this.totalBandwidth = internalNetworkQualityInfo.totalBandwidth;
        this.txQuality = internalNetworkQualityInfo.txNetQuality;
        this.rxQuality = internalNetworkQualityInfo.rxNetQuality;
    }

    public NetworkQualityStats(String str, double d, int i, int i2, int i3, int i4) {
        this.uid = str;
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.txQuality = i3;
        this.rxQuality = i4;
    }
}
