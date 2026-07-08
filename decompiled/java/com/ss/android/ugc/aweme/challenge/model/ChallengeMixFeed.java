package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes30.dex */
public final class ChallengeMixFeed {

    @C09CT("dynamic_patch")
    public DynamicPatch dynamicPatch;

    @C09CT("dynamic_type")
    public int dynamicType;

    @C09CT("type")
    public int feedType;
    public LogPbBean mLogPbBean;

    public final boolean isLynxCard() {
        return this.feedType == 999;
    }

    public final boolean isVsLiveCard() {
        return this.feedType == 998;
    }

    public final DynamicPatch getDynamicPatch() {
        return this.dynamicPatch;
    }

    public final int getDynamicType() {
        return this.dynamicType;
    }

    public final int getFeedType() {
        return this.feedType;
    }

    public final LogPbBean getMLogPbBean() {
        return this.mLogPbBean;
    }

    public final void setDynamicPatch(DynamicPatch dynamicPatch) {
        this.dynamicPatch = dynamicPatch;
    }

    public final void setDynamicType(int i) {
        this.dynamicType = i;
    }

    public final void setFeedType(int i) {
        this.feedType = i;
    }

    public final void setMLogPbBean(LogPbBean logPbBean) {
        this.mLogPbBean = logPbBean;
    }
}
