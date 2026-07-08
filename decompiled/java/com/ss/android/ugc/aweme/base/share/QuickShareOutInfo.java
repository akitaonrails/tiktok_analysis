package com.ss.android.ugc.aweme.base.share;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class QuickShareOutInfo implements Serializable {

    @C09CT("reach_threshold")
    public Boolean reachThreshold;

    @C09CT("rec_extra")
    public String recExtra;

    @C09CT("yield_to_share_in")
    public Boolean yieldToShareIn;

    public QuickShareOutInfo() {
    }

    public QuickShareOutInfo(Boolean bool, Boolean bool2, String str) {
        this.reachThreshold = bool;
        this.yieldToShareIn = bool2;
        this.recExtra = str;
    }
}
