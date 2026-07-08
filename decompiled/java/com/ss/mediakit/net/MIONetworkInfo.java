package com.ss.mediakit.net;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class MIONetworkInfo {
    public long createTimeMs;
    public boolean slowStart;
    public long sourceTimeMs;
    public String networkType = "";
    public String protocol = "";
    public String domain = "";
    public String serverIp = "";
    public String connectionId = "";
    public int sourceVersion = -1;
    public int index = -1;
    public int bandwidthKbps = -1;
    public int maxBandwidthKbps = -1;
    public int mediaBitrateKbps = -1;
    public int rttMs = -1;
    public int minRttMs = -1;
    public int jitterMs = -1;
    public int lossRatePercent = -1;
    public int sendRateKbps = -1;
    public int receiveRateKbps = -1;
    public int inputRateKbps = -1;
    public int congestionWindowByte = -1;
    public int inFlightByte = -1;
    public int transBufferByte = -1;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"create_time_ms\":");
        sbLIZ.append(this.createTimeMs);
        sbLIZ.append(",\"network_type\":\"");
        sbLIZ.append(this.networkType);
        sbLIZ.append('\"');
        sbLIZ.append(",\"protocol\":\"");
        sbLIZ.append(this.protocol);
        sbLIZ.append('\"');
        sbLIZ.append(",\"domain\":\"");
        sbLIZ.append(this.domain);
        sbLIZ.append('\"');
        sbLIZ.append(",\"server_ip\":\"");
        sbLIZ.append(this.serverIp);
        sbLIZ.append('\"');
        sbLIZ.append(",\"connection_id\":\"");
        sbLIZ.append(this.connectionId);
        sbLIZ.append('\"');
        sbLIZ.append(",\"source_version\":");
        sbLIZ.append(this.sourceVersion);
        sbLIZ.append(",\"source_time_ms\":");
        sbLIZ.append(this.sourceTimeMs);
        sbLIZ.append(",\"slow_start\":");
        sbLIZ.append(this.slowStart ? 1 : 0);
        sbLIZ.append(",\"index\":");
        sbLIZ.append(this.index);
        sbLIZ.append(",\"bandwidth_kbps\":");
        sbLIZ.append(this.bandwidthKbps);
        sbLIZ.append(",\"max_bandwidth_kbps\":");
        sbLIZ.append(this.maxBandwidthKbps);
        sbLIZ.append(",\"media_bitrate_kbps\":");
        sbLIZ.append(this.mediaBitrateKbps);
        sbLIZ.append(",\"rtt_ms\":");
        sbLIZ.append(this.rttMs);
        sbLIZ.append(",\"min_rtt_ms\":");
        sbLIZ.append(this.minRttMs);
        sbLIZ.append(",\"jitter_ms\":");
        sbLIZ.append(this.jitterMs);
        sbLIZ.append(",\"loss_rate_percent\":");
        sbLIZ.append(this.lossRatePercent);
        sbLIZ.append(",\"send_rate_kbps\":");
        sbLIZ.append(this.sendRateKbps);
        sbLIZ.append(",\"receive_rate_kbps\":");
        sbLIZ.append(this.receiveRateKbps);
        sbLIZ.append(",\"input_rate_kbps\":");
        sbLIZ.append(this.inputRateKbps);
        sbLIZ.append(",\"congestion_window_byte\":");
        sbLIZ.append(this.congestionWindowByte);
        sbLIZ.append(",\"in_flight_byte\":");
        sbLIZ.append(this.inFlightByte);
        sbLIZ.append(",\"trans_buffer_byte\":");
        sbLIZ.append(this.transBufferByte);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
