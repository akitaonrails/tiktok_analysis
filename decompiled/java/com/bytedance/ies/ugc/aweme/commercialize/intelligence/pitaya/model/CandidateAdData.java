package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class CandidateAdData implements Serializable {

    @C09CT("feed_action_data")
    public FeedActionData feedActionData;

    @C09CT("feed_status")
    public Integer feedStatus;

    @C09CT("feed_data")
    public final RankData rankData;

    @C09CT("source")
    public int source;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.rankData.getAid());
        sbLIZ.append('-');
        sbLIZ.append(this.source);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final FeedActionData getFeedActionData() {
        return this.feedActionData;
    }

    public final Integer getFeedStatus() {
        return this.feedStatus;
    }

    public final RankData getRankData() {
        return this.rankData;
    }

    public final int getSource() {
        return this.source;
    }

    public final void setFeedActionData(FeedActionData feedActionData) {
        this.feedActionData = feedActionData;
    }

    public final void setFeedStatus(Integer num) {
        this.feedStatus = num;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public CandidateAdData(Integer num, int i, FeedActionData feedActionData, RankData rankData) {
        this.feedStatus = num;
        this.source = i;
        this.feedActionData = feedActionData;
        this.rankData = rankData;
    }
}
