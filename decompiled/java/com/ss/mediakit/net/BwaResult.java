package com.ss.mediakit.net;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class BwaResult {
    public long basicInfoReceivedTimeMs;
    public String cid = "";
    public String protocol = "";
    public int redundancyRateKbps;
    public int sourceBandwidthKbps;
    public int targetMediaBitrateKbps;

    public interface BwaResultCallback {
        void onBwaResultChanged(BwaResult bwaResult);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"cid\":\"");
        sbLIZ.append(this.cid);
        sbLIZ.append('\"');
        sbLIZ.append(",\"protocol\":\"");
        sbLIZ.append(this.protocol);
        sbLIZ.append('\"');
        sbLIZ.append(",\"basicInfoReceivedTimeMs\":");
        sbLIZ.append(this.basicInfoReceivedTimeMs);
        sbLIZ.append(",\"sourceBandwidthKbps\":");
        sbLIZ.append(this.sourceBandwidthKbps);
        sbLIZ.append(",\"redundancyRateKbps\":");
        sbLIZ.append(this.redundancyRateKbps);
        sbLIZ.append(",\"targetMediaBitrateKbps\":");
        sbLIZ.append(this.targetMediaBitrateKbps);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
