package com.ss.android.ugc.aweme.report;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class ShowReportInfo implements Serializable {

    @C09CT("time")
    public final String time;

    public ShowReportInfo() {
        this(null);
    }

    public ShowReportInfo(String str) {
        this.time = str;
    }
}
