package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class BaseRankModel implements Serializable {
    public final transient String LL;
    public final transient int LLILLJJLI;

    @C09CT("feed_action_data")
    public FeedActionData feedActionData;

    @C09CT("feed_data")
    public final RankData rankData;

    public final FeedActionData getFeedActionData() {
        return this.feedActionData;
    }

    public final int getFeedStatus() {
        return this.LLILLJJLI;
    }

    public final String getId() {
        return this.LL;
    }

    public final RankData getRankData() {
        return this.rankData;
    }

    public String toString() {
        return this.LL;
    }

    public final void setFeedActionData(FeedActionData feedActionData) {
        this.feedActionData = feedActionData;
    }

    public BaseRankModel(String str, int i, FeedActionData feedActionData, RankData rankData) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.feedActionData = feedActionData;
        this.rankData = rankData;
    }
}
