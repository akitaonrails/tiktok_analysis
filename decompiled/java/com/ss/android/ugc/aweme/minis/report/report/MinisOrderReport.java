package com.ss.android.ugc.aweme.minis.report.report;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisOrderReport implements Serializable {
    public static final int $stable = 0;

    @C09CT("feedback")
    public final String feedback;

    public MinisOrderReport() {
        this("");
    }

    public MinisOrderReport(String str) {
        this.feedback = str;
    }
}
