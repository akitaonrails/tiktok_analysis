package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CaptionInsetInfo implements Serializable {

    @C09CT("bottom")
    public final int bottom;

    @C09CT("leading")
    public final int leading;

    @C09CT("top")
    public final int top;

    @C09CT("trailing")
    public final int trailing;

    public CaptionInsetInfo(int i, int i2, int i3, int i4) {
        this.top = i;
        this.trailing = i2;
        this.bottom = i3;
        this.leading = i4;
    }
}
