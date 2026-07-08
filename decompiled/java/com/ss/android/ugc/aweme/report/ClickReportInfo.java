package com.ss.android.ugc.aweme.report;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ClickReportInfo implements Serializable {

    @C09CT("click_action")
    public final String clickAction;

    @C09CT("click_type")
    public final String clickType;

    @C09CT("time")
    public final String time;

    public ClickReportInfo() {
        this(null, null, null);
    }

    public final ClickReportInfo copy(String str, String str2, String str3) {
        return new ClickReportInfo(str, str2, str3);
    }

    public ClickReportInfo(String str, String str2, String str3) {
        this.time = str;
        this.clickType = str2;
        this.clickAction = str3;
    }
}
