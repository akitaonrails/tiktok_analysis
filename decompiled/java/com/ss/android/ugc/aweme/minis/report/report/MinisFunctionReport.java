package com.ss.android.ugc.aweme.minis.report.report;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisFunctionReport implements Serializable {
    public static final int $stable = 0;

    @C09CT("feedback")
    public final String feedback;

    @C09CT("issue_starling_key")
    public final String issueStarling;

    public MinisFunctionReport() {
        this("", null);
    }

    public MinisFunctionReport(String str, String str2) {
        this.issueStarling = str;
        this.feedback = str2;
    }
}
