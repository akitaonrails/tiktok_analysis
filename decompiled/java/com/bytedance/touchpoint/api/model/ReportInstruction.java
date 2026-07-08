package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class ReportInstruction {

    @C09CT("report_batch")
    public Integer reportBatch;

    public ReportInstruction() {
        this(20);
    }

    public ReportInstruction(Integer num) {
        this.reportBatch = num;
    }
}
