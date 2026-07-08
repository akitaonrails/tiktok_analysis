package com.ss.ttlivestreamer.core.abnormal_detect;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.video.TTLHAbnormalDetectConfigParser;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHAbnormalDetectConfigJava implements Cloneable {
    public TTLHAbnormalBlackDetectConfigJava blackDetectConfig;
    public boolean downStreamEnable;
    public boolean enable;
    public boolean enableDetailedReport;
    public boolean enableReportTextureDetail;
    public TTLHAbnormalGreenDetectConfigJava greenDetectConfig;
    public boolean isRemote;
    public int minStatsIntervalMs;
    public int minStatsIntervalMsLt;
    public String nodeName;
    public String remoteUserId;
    public int streamIndex;
    public boolean upStreamEnable;

    public TTLHAbnormalBlackDetectConfigJava getBlackDetectConfig() {
        TTLHAbnormalBlackDetectConfigJava tTLHAbnormalBlackDetectConfigJava = this.blackDetectConfig;
        return tTLHAbnormalBlackDetectConfigJava == null ? new TTLHAbnormalBlackDetectConfigJava() : tTLHAbnormalBlackDetectConfigJava;
    }

    public TTLHAbnormalGreenDetectConfigJava getGreenDetectConfig() {
        TTLHAbnormalGreenDetectConfigJava tTLHAbnormalGreenDetectConfigJava = this.greenDetectConfig;
        return tTLHAbnormalGreenDetectConfigJava == null ? new TTLHAbnormalGreenDetectConfigJava() : tTLHAbnormalGreenDetectConfigJava;
    }

    public TTLHAbnormalDetectConfigJava() {
        this.upStreamEnable = true;
        this.downStreamEnable = true;
        this.enableReportTextureDetail = true;
        this.nodeName = "";
        this.remoteUserId = "";
        this.minStatsIntervalMs = 5000;
        this.minStatsIntervalMsLt = 15000;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TTLHAbnormalDetectConfigJava m354clone() {
        try {
            TTLHAbnormalDetectConfigJava tTLHAbnormalDetectConfigJava = (TTLHAbnormalDetectConfigJava) super.clone();
            tTLHAbnormalDetectConfigJava.enable = this.enable;
            tTLHAbnormalDetectConfigJava.enableDetailedReport = this.enableDetailedReport;
            tTLHAbnormalDetectConfigJava.blackDetectConfig = this.blackDetectConfig.m353clone();
            tTLHAbnormalDetectConfigJava.greenDetectConfig = this.greenDetectConfig.m355clone();
            tTLHAbnormalDetectConfigJava.nodeName = this.nodeName;
            tTLHAbnormalDetectConfigJava.streamIndex = this.streamIndex;
            tTLHAbnormalDetectConfigJava.remoteUserId = this.remoteUserId;
            tTLHAbnormalDetectConfigJava.isRemote = this.isRemote;
            tTLHAbnormalDetectConfigJava.minStatsIntervalMs = this.minStatsIntervalMs;
            tTLHAbnormalDetectConfigJava.minStatsIntervalMsLt = this.minStatsIntervalMsLt;
            return tTLHAbnormalDetectConfigJava;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public String getNodeName() {
        return this.nodeName;
    }

    public String getRemoteUserId() {
        return this.remoteUserId;
    }

    public int getStreamIndex() {
        return this.streamIndex;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isRemote() {
        return this.isRemote;
    }

    public TTLHAbnormalDetectConfigJava(TTLHAbnormalDetectConfigParser tTLHAbnormalDetectConfigParser) {
        this.upStreamEnable = true;
        this.downStreamEnable = true;
        this.enableReportTextureDetail = true;
        this.nodeName = "";
        this.remoteUserId = "";
        this.minStatsIntervalMs = 5000;
        this.minStatsIntervalMsLt = 15000;
        this.enable = tTLHAbnormalDetectConfigParser.enable;
        this.enableDetailedReport = tTLHAbnormalDetectConfigParser.enableDetailedReport;
        this.blackDetectConfig = new TTLHAbnormalBlackDetectConfigJava(tTLHAbnormalDetectConfigParser.blackDetectConfigParser);
        this.greenDetectConfig = new TTLHAbnormalGreenDetectConfigJava(tTLHAbnormalDetectConfigParser.greenDetectConfigParser);
        this.minStatsIntervalMs = tTLHAbnormalDetectConfigParser.minStatsIntervalMs;
        this.minStatsIntervalMsLt = tTLHAbnormalDetectConfigParser.minStatsIntervalMsLt;
        this.upStreamEnable = tTLHAbnormalDetectConfigParser.upStreamEnable;
        this.downStreamEnable = tTLHAbnormalDetectConfigParser.downStreamEnable;
        this.enableReportTextureDetail = tTLHAbnormalDetectConfigParser.enableReportTextureDetail;
    }
}
