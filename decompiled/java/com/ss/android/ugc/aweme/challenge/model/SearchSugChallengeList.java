package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class SearchSugChallengeList extends BaseResponse {

    @C09CT("is_match")
    public boolean isMatch;

    @C09CT("sug_list")
    public List<AVChallenge> items = new ArrayList();
    public String keyword = "";

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("words_query_record")
    public final RecommendWordMob recommendWordMob;

    public final List<AVChallenge> getItems() {
        return this.items;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final RecommendWordMob getRecommendWordMob() {
        return this.recommendWordMob;
    }

    public final boolean isMatch() {
        return this.isMatch;
    }

    public final void setItems(List<AVChallenge> list) {
        this.items = list;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMatch(boolean z) {
        this.isMatch = z;
    }
}
