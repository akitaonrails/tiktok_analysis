package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class CorrespondPostRollAdData implements Serializable {

    @C09CT("feed_action_data")
    public FeedActionData feedActionData;

    @C09CT("feed_status")
    public final Integer feedStatus;

    @C09CT("feed_data")
    public final RankData rankData;

    public final FeedActionData getFeedActionData() {
        return this.feedActionData;
    }

    public final Integer getFeedStatus() {
        return this.feedStatus;
    }

    public final RankData getRankData() {
        return this.rankData;
    }

    public final void setFeedActionData(FeedActionData feedActionData) {
        this.feedActionData = feedActionData;
    }

    public CorrespondPostRollAdData(Integer num, FeedActionData feedActionData, RankData rankData) {
        this.feedStatus = num;
        this.feedActionData = feedActionData;
        this.rankData = rankData;
    }
}
