package com.ss.lyrax.video;

import X.C09CT;
import X.C2188811AlT;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class TTLHVideoContentReportConfig {

    @C09CT("enable_report")
    public boolean enable;

    @C09CT("facecount_stats_interval_ms")
    public int faceCountStatsIntervalMs;

    @C09CT("facecount_stats_threshold")
    public double faceCountStatsThreshold;

    @C09CT("report_interval_ms")
    public int reportIntervalMs;

    @C09CT("vad_stats_interval_ms")
    public int vadStatsIntervalMs;

    @C09CT("vad_stats_threshold")
    public double vadStatsThreshold;

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enable), Integer.valueOf(this.reportIntervalMs), Integer.valueOf(this.faceCountStatsIntervalMs), Double.valueOf(this.faceCountStatsThreshold), Integer.valueOf(this.vadStatsIntervalMs), Double.valueOf(this.vadStatsThreshold));
    }

    public boolean isFaceCountEnable() {
        return this.enable && this.faceCountStatsIntervalMs > 0;
    }

    public boolean isVadEnable() {
        return this.enable && this.vadStatsIntervalMs > 0;
    }

    public TTLHVideoContentReportConfig() {
        this.reportIntervalMs = 15000;
        this.faceCountStatsIntervalMs = 15000;
        this.vadStatsIntervalMs = 15000;
        this.faceCountStatsThreshold = 0.3d;
        this.vadStatsThreshold = 0.1d;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHVideoContentReportConfig{enable_report=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", report_interval_ms=");
        sbLIZ.append(this.reportIntervalMs);
        sbLIZ.append(", facecount_stats_interval_ms=");
        sbLIZ.append(this.faceCountStatsIntervalMs);
        sbLIZ.append(", vad_stats_interval_ms=");
        sbLIZ.append(this.vadStatsIntervalMs);
        sbLIZ.append(", facecount_stats_threshold=");
        sbLIZ.append(this.faceCountStatsThreshold);
        sbLIZ.append(", vad_stats_threshold=");
        sbLIZ.append(this.vadStatsThreshold);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TTLHVideoContentReportConfig tTLHVideoContentReportConfig = (TTLHVideoContentReportConfig) obj;
        if (this.enable == tTLHVideoContentReportConfig.enable && this.reportIntervalMs == tTLHVideoContentReportConfig.reportIntervalMs && this.faceCountStatsIntervalMs == tTLHVideoContentReportConfig.faceCountStatsIntervalMs && this.faceCountStatsThreshold == tTLHVideoContentReportConfig.faceCountStatsThreshold && this.vadStatsThreshold == tTLHVideoContentReportConfig.vadStatsThreshold && this.vadStatsIntervalMs == tTLHVideoContentReportConfig.vadStatsIntervalMs) {
            return true;
        }
        return false;
    }

    public TTLHVideoContentReportConfig(boolean z, int i, int i2, int i3, double d, double d2) {
        this.enable = z;
        this.reportIntervalMs = i;
        this.faceCountStatsIntervalMs = i2;
        this.vadStatsIntervalMs = i3;
        this.faceCountStatsThreshold = d;
        this.vadStatsThreshold = d2;
    }
}
