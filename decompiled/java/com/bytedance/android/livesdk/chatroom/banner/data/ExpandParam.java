package com.bytedance.android.livesdk.chatroom.banner.data;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class ExpandParam {

    @C09CT("ExpandRound")
    public final int expandRound;

    @C09CT("ExpandPercent")
    public final int progressPercent;

    public ExpandParam() {
        this(1, 10);
    }

    public ExpandParam(int i, int i2) {
        this.expandRound = i;
        this.progressPercent = i2;
    }
}
