package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LinkPosition {

    @C09CT("position")
    public int position;

    @C09CT("opt")
    public int positionType;

    public LinkPosition() {
        this(0, 0);
    }

    public LinkPosition(int i, int i2) {
        this.position = i;
        this.positionType = i2;
    }
}
