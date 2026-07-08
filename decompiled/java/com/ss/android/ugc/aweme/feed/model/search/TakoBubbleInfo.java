package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TakoBubbleInfo implements Serializable {

    @C09CT("tako_bubble_enable")
    public Boolean takoBubbleEnable;

    public TakoBubbleInfo() {
        this(Boolean.FALSE);
    }

    public TakoBubbleInfo(Boolean bool) {
        this.takoBubbleEnable = bool;
    }
}
