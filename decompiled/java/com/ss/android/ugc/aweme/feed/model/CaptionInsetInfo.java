package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CaptionInsetInfo implements Serializable {

    @C09CT("bottom")
    public int bottom;

    @C09CT("leading")
    public int leading;

    @C09CT("top")
    public int top;

    @C09CT("trailing")
    public int trailing;

    public CaptionInsetInfo() {
    }

    public CaptionInsetInfo(int i, int i2, int i3, int i4) {
        this.top = i;
        this.trailing = i2;
        this.bottom = i3;
        this.leading = i4;
    }
}
