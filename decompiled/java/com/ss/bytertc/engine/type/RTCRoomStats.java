package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalRTCStats;

/* JADX INFO: loaded from: classes21.dex */
public class RTCRoomStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int rtt;
    public int rxAudioKBitRate;
    public long rxBytes;
    public int rxCellularKBitrate;
    public int rxJitter;
    public int rxKBitRate;
    public double rxLostrate;
    public int rxScreenKBitRate;
    public int rxVideoKBitRate;
    public int totalDuration;
    public int txAudioKBitRate;
    public long txBytes;
    public int txCellularKBitrate;
    public int txJitter;
    public int txKBitRate;
    public double txLostrate;
    public int txScreenKBitRate;
    public int txVideoKBitRate;
    public int users;

    public void reset() {
        this.totalDuration = 0;
        this.txBytes = 0L;
        this.rxBytes = 0L;
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
        this.txJitter = 0;
        this.rxJitter = 0;
        this.txLostrate = 0.0d;
        this.rxLostrate = 0.0d;
        this.rtt = 0;
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
        sbLIZ.append(", txCellularKBitRate=");
        sbLIZ.append(this.txCellularKBitrate);
        sbLIZ.append(", rxCellularKBitRate=");
        sbLIZ.append(this.rxCellularKBitrate);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RTCRoomStats() {
    }

    public RTCRoomStats(InternalRTCStats internalRTCStats) {
        this.totalDuration = internalRTCStats.totalDuration;
        this.txBytes = internalRTCStats.txBytes;
        this.rxBytes = internalRTCStats.rxBytes;
        this.txKBitRate = internalRTCStats.txKBitRate;
        this.rxKBitRate = internalRTCStats.rxKBitRate;
        this.txAudioKBitRate = internalRTCStats.txAudioKBitRate;
        this.rxAudioKBitRate = internalRTCStats.rxAudioKBitRate;
        this.txVideoKBitRate = internalRTCStats.txVideoKBitRate;
        this.rxVideoKBitRate = internalRTCStats.rxVideoKBitRate;
        this.txScreenKBitRate = internalRTCStats.txScreenKBitRate;
        this.rxScreenKBitRate = internalRTCStats.rxScreenKBitRate;
        this.users = internalRTCStats.users;
        this.cpuTotalUsage = internalRTCStats.cpuTotalUsage;
        this.cpuAppUsage = internalRTCStats.cpuAppUsage;
        this.txLostrate = internalRTCStats.txLostrate;
        this.rxLostrate = internalRTCStats.rxLostrate;
        this.rtt = internalRTCStats.rtt;
        this.txJitter = internalRTCStats.txJitter;
        this.rxJitter = internalRTCStats.rxJitter;
        this.txCellularKBitrate = internalRTCStats.txCellularKBitrate;
        this.rxCellularKBitrate = internalRTCStats.rxCellularKBitrate;
    }
}
