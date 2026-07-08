package com.ss.android.ugc.aweme.task;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class JavaObjectMonitorConfig {

    @C09CT("client_sample_rate")
    public int client_sample_rate;

    @C09CT("collect_per_thousand_alloc")
    public int collect_per_thousand_alloc;

    @C09CT("dump_per_thousand_collect")
    public int dump_per_thousand_collect;

    @C09CT("enable")
    public boolean enable;

    @C09CT("report_interval")
    public int report_interval;

    @C09CT("threshold_alloc_frequency")
    public int threshold_alloc_frequency;

    @C09CT("threshold_alloc_size")
    public long threshold_alloc_size;

    public JavaObjectMonitorConfig() {
        this(false, 0, 0, 0, 0L, 0, 0);
    }

    public final void setClient_sample_rate(int i) {
        this.client_sample_rate = i;
    }

    public final void setCollect_per_thousand_alloc(int i) {
        this.collect_per_thousand_alloc = i;
    }

    public final void setDump_per_thousand_collect(int i) {
        this.dump_per_thousand_collect = i;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setReport_interval(int i) {
        this.report_interval = i;
    }

    public final void setThreshold_alloc_frequency(int i) {
        this.threshold_alloc_frequency = i;
    }

    public final void setThreshold_alloc_size(long j) {
        this.threshold_alloc_size = j;
    }

    public JavaObjectMonitorConfig(boolean z, int i, int i2, int i3, long j, int i4, int i5) {
        this.enable = z;
        this.collect_per_thousand_alloc = i;
        this.dump_per_thousand_collect = i2;
        this.threshold_alloc_frequency = i3;
        this.threshold_alloc_size = j;
        this.report_interval = i4;
        this.client_sample_rate = i5;
    }
}
