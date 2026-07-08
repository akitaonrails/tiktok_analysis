package com.ss.android.ugc.aweme.specialplus;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class SpecialPlusTimePeriod {
    public static final int $stable = 8;

    @C09CT("start_time")
    public String start = "";

    @C09CT("end_time")
    public String end = "";

    public final String getEnd() {
        return this.end;
    }

    public final String getStart() {
        return this.start;
    }

    public final void setEnd(String str) {
        this.end = str;
    }

    public final void setStart(String str) {
        this.start = str;
    }
}
