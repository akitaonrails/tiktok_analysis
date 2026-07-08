package com.ss.lyrax.video;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHAbnormalDetectConfigParser {

    @C09CT("black_detect")
    public TTLHBlackDetectConfigParser blackDetectConfigParser;

    @C09CT("downstream_enable")
    public boolean downStreamEnable;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_detailed_report")
    public boolean enableDetailedReport;

    @C09CT("enable_report_texture_detail")
    public boolean enableReportTextureDetail;

    @C09CT("green_detect")
    public TTLHGreenDetectConfigParser greenDetectConfigParser;

    @C09CT("min_stats_interval_ms")
    public int minStatsIntervalMs;

    @C09CT("min_stats_interval_ms_lt")
    public int minStatsIntervalMsLt;

    @C09CT("upstream_enable")
    public boolean upStreamEnable;

    public TTLHAbnormalDetectConfigParser() {
        this.minStatsIntervalMs = 5000;
        this.minStatsIntervalMsLt = 15000;
        this.upStreamEnable = true;
        this.downStreamEnable = true;
        this.enableReportTextureDetail = true;
        this.blackDetectConfigParser = new TTLHBlackDetectConfigParser();
        this.greenDetectConfigParser = new TTLHGreenDetectConfigParser();
    }

    public TTLHAbnormalDetectConfigParser(boolean z, boolean z2, TTLHBlackDetectConfigParser tTLHBlackDetectConfigParser, TTLHGreenDetectConfigParser tTLHGreenDetectConfigParser, int i, int i2, boolean z3, boolean z4, boolean z5) {
        this.minStatsIntervalMs = 5000;
        this.minStatsIntervalMsLt = 15000;
        this.upStreamEnable = true;
        this.downStreamEnable = true;
        this.enableReportTextureDetail = true;
        this.blackDetectConfigParser = new TTLHBlackDetectConfigParser();
        new TTLHGreenDetectConfigParser();
        this.enable = z;
        this.enableDetailedReport = z2;
        this.blackDetectConfigParser = tTLHBlackDetectConfigParser;
        this.greenDetectConfigParser = tTLHGreenDetectConfigParser;
        this.minStatsIntervalMs = i;
        this.minStatsIntervalMsLt = i2;
        this.upStreamEnable = z3;
        this.downStreamEnable = z4;
        this.enableReportTextureDetail = z5;
    }
}
