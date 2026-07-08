package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class AVSearchChallengeList {

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("keyword_disabled")
    public boolean isDisabled;

    @C09CT("is_match")
    public boolean isMatch;

    @C09CT("challenge_list")
    public List<AVSearchChallenge> items;
    public String keyword;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("words_query_record")
    public RecommendWordMob recommendWordMob;

    public long getCursor() {
        return this.cursor;
    }

    public List<AVSearchChallenge> getItems() {
        return this.items;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public boolean isDisabled() {
        return this.isDisabled;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isMatch() {
        return this.isMatch;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setDisabled(boolean z) {
        this.isDisabled = z;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setItems(List<AVSearchChallenge> list) {
        this.items = list;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setMatch(boolean z) {
        this.isMatch = z;
    }
}
