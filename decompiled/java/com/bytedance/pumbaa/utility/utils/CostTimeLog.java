package com.bytedance.pumbaa.utility.utils;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes14.dex */
public final class CostTimeLog {
    public long cost;
    public long end;
    public String label;
    public String message;
    public Long start;

    public final void setCost(long j) {
        this.cost = j;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStart(Long l) {
        this.start = l;
    }

    public CostTimeLog(String str, Long l, long j, String str2) {
        this.label = str;
        this.start = l;
        this.end = j;
        this.message = str2;
        if (l != null) {
            this.cost = (this.end - l.longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
    }
}
