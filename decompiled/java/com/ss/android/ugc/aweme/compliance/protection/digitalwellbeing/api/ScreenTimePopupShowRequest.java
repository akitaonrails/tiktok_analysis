package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class ScreenTimePopupShowRequest {

    @C09CT("date")
    public final int date;

    @C09CT("screen_time_limit_type")
    public final int screenTimeLimitType;

    public ScreenTimePopupShowRequest(int i, int i2) {
        this.date = i;
        this.screenTimeLimitType = i2;
    }
}
