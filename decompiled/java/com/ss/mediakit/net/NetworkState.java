package com.ss.mediakit.net;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class NetworkState {
    public int bandwidthKbps;
    public int jitterMs;
    public int lossRatePercent;
    public int networkQuality;
    public int rttMs;
    public int scenario;
    public long updateTs;

    /* JADX INFO: loaded from: classes24.dex */
    public interface NetworkStateCallback {
        void onNetworkStateChanged(NetworkState networkState);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"scenario\":");
        sbLIZ.append(this.scenario);
        sbLIZ.append(",\"update_time_ms\":");
        sbLIZ.append(this.updateTs);
        sbLIZ.append(",\"network_quality\":");
        sbLIZ.append(this.networkQuality);
        sbLIZ.append(",\"bandwidth_kbps\":");
        sbLIZ.append(this.bandwidthKbps);
        sbLIZ.append(",\"rtt_ms\":");
        sbLIZ.append(this.rttMs);
        sbLIZ.append(",\"loss_rate_percent\":");
        sbLIZ.append(this.lossRatePercent);
        sbLIZ.append(",\"jitter_ms\":");
        sbLIZ.append(this.jitterMs);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
