package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class LinkMicMixStreamLayoutParam {

    @C09CT("br")
    public int bitRate;

    @C09CT("h")
    public int height;

    @C09CT("w")
    public int width;

    public LinkMicMixStreamLayoutParam() {
        this(-1, -1, -1);
    }

    public LinkMicMixStreamLayoutParam(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.bitRate = i3;
    }
}
