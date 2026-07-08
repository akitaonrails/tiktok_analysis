package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public class PromoteInfo {

    @C09CT("PromoteOther")
    public int promoteOther;

    @C09CT("promote_other_message")
    public PromoteOtherMessage promoteOtherMessage;

    public PromoteInfo() {
    }

    public PromoteInfo(int i, PromoteOtherMessage promoteOtherMessage) {
        this.promoteOther = i;
        this.promoteOtherMessage = promoteOtherMessage;
    }
}
