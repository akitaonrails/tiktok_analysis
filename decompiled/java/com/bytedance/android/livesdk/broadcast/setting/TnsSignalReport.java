package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class TnsSignalReport {
    public static final TypeAdapter ADAPTER;

    @C09CT("enable")
    public int enable;

    @C09CT("force_enable")
    public int forceEnable;

    @C09CT("report_interval")
    public long reportInterval;

    @C09CT("report_new_interval")
    public long reportNewInterval;

    static {
        NormalGson.singleton();
        ADAPTER = new TnsSignalReport_OptTypeAdapter();
    }

    public TnsSignalReport() {
        this(0, 0, 60L, 300L);
    }

    public final int getEnable() {
        return this.enable;
    }

    public final int getForceEnable() {
        return this.forceEnable;
    }

    public final long getReportInterval() {
        return this.reportInterval;
    }

    public final long getReportNewInterval() {
        return this.reportNewInterval;
    }

    public final void setEnable(int i) {
        this.enable = i;
    }

    public final void setForceEnable(int i) {
        this.forceEnable = i;
    }

    public final void setReportInterval(long j) {
        this.reportInterval = j;
    }

    public final void setReportNewInterval(long j) {
        this.reportNewInterval = j;
    }

    public TnsSignalReport(int i, int i2, long j, long j2) {
        this.forceEnable = i;
        this.enable = i2;
        this.reportInterval = j;
        this.reportNewInterval = j2;
    }
}
