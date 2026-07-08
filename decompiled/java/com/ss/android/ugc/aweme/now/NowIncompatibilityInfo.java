package com.ss.android.ugc.aweme.now;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class NowIncompatibilityInfo implements Serializable {

    @C09CT("explain")
    public String explain;

    @C09CT("reason")
    public int reason;

    @C09CT("resolution_button")
    public NowButtonInfo resolutionButtonInfo;

    public NowIncompatibilityInfo() {
        this(0, "", null);
    }

    public NowIncompatibilityInfo(int i, String str, NowButtonInfo nowButtonInfo) {
        this.reason = i;
        this.explain = str;
        this.resolutionButtonInfo = nowButtonInfo;
    }
}
