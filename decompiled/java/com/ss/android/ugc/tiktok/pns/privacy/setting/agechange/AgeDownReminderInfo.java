package com.ss.android.ugc.tiktok.pns.privacy.setting.agechange;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeDownReminderInfo {

    @C09CT("upper_age")
    public final int upperAge;

    @C09CT("url")
    public final String url;

    public AgeDownReminderInfo() {
        this("", 0);
    }

    public AgeDownReminderInfo(String str, int i) {
        this.url = str;
        this.upperAge = i;
    }
}
