package com.ss.android.ugc.aweme.aigroupshot;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AiGroupShotFakeMsgData {

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("left_url")
    public final String leftUrl;

    @C09CT("mid_url")
    public final String midUrl;

    @C09CT("right_url")
    public final String rightUrl;

    public AiGroupShotFakeMsgData() {
        this("", "", "", "");
    }

    public AiGroupShotFakeMsgData(String str, String str2, String str3, String str4) {
        this.leftUrl = str;
        this.midUrl = str2;
        this.rightUrl = str3;
        this.effectId = str4;
    }
}
