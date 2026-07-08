package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorLayoutPriority implements Serializable {

    @C09CT("prefix")
    public final Integer prefix;

    @C09CT("suffix")
    public final Integer suffix;

    public AnchorLayoutPriority() {
        this(null, null);
    }

    public AnchorLayoutPriority(Integer num, Integer num2) {
        this.prefix = num;
        this.suffix = num2;
    }
}
