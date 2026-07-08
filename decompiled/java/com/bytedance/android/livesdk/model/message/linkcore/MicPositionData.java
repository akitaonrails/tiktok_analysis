package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class MicPositionData {

    @C09CT("link")
    public LinkPosition linkPosition;

    @C09CT("type")
    public int type;

    public MicPositionData() {
        this(0, null);
    }

    public MicPositionData(int i, LinkPosition linkPosition) {
        this.type = i;
        this.linkPosition = linkPosition;
    }
}
