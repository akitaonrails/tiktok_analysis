package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidVideoListPageInfo implements Serializable {

    @C09CT("curr_page")
    public final int curPage;

    @C09CT("has_before")
    public final boolean hasBefore;

    @C09CT("has_next")
    public final boolean hasNext;

    public PaidVideoListPageInfo() {
        this(false, false, 0);
    }

    public PaidVideoListPageInfo(boolean z, boolean z2, int i) {
        this.hasBefore = z;
        this.hasNext = z2;
        this.curPage = i;
    }
}
