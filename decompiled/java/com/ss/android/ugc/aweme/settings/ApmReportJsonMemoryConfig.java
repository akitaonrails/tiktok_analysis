package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ApmReportJsonMemoryConfig {
    public static final int $stable = 8;

    @C09CT("enable")
    public boolean enable;

    @C09CT("record_data_stream_init_size")
    public int recordDataStreamInitSize;

    @C09CT("report_data_stream_init_size")
    public int reportDataStreamInitSize;

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getRecordDataStreamInitSize() {
        return this.recordDataStreamInitSize;
    }

    public final int getReportDataStreamInitSize() {
        return this.reportDataStreamInitSize;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setRecordDataStreamInitSize(int i) {
        this.recordDataStreamInitSize = i;
    }

    public final void setReportDataStreamInitSize(int i) {
        this.reportDataStreamInitSize = i;
    }
}
