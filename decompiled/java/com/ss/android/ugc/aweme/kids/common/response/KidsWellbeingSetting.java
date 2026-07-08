package com.ss.android.ugc.aweme.kids.common.response;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class KidsWellbeingSetting {

    @C09CT("session_duration_type")
    public final Integer screenDurationType;

    @C09CT("session_duration_reminder")
    public final Integer screenTimeBreaks;

    public KidsWellbeingSetting() {
        this(0, 0);
    }

    public KidsWellbeingSetting(Integer num, Integer num2) {
        this.screenTimeBreaks = num;
        this.screenDurationType = num2;
    }
}
