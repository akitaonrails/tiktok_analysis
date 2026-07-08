package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class PostRollAdData implements Serializable {

    @C09CT("feed_status")
    public final Integer feedStatus;

    @C09CT("feed_data")
    public final RankData rankData;

    public final Integer getFeedStatus() {
        return this.feedStatus;
    }

    public final RankData getRankData() {
        return this.rankData;
    }

    public PostRollAdData(Integer num, RankData rankData) {
        this.feedStatus = num;
        this.rankData = rankData;
    }
}
