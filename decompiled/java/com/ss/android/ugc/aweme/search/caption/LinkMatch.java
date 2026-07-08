package com.ss.android.ugc.aweme.search.caption;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkMatch implements Serializable {

    @C09CT("caption_anchor")
    public CaptionAnchor captionAnchor;

    @C09CT("caption_info")
    public CaptionInfo captionInfo;

    @C09CT("match_info")
    public List<MatchInfo> matchInfoList;

    @C09CT("query_limit")
    public int queryLimit;

    @C09CT("total_limit")
    public int totalLimit;

    public final CaptionAnchor getCaptionAnchor() {
        return this.captionAnchor;
    }

    public final CaptionInfo getCaptionInfo() {
        return this.captionInfo;
    }

    public final List<MatchInfo> getMatchInfoList() {
        return this.matchInfoList;
    }

    public final int getQueryLimit() {
        return this.queryLimit;
    }

    public final int getTotalLimit() {
        return this.totalLimit;
    }

    public final void setCaptionAnchor(CaptionAnchor captionAnchor) {
        this.captionAnchor = captionAnchor;
    }

    public final void setCaptionInfo(CaptionInfo captionInfo) {
        this.captionInfo = captionInfo;
    }

    public final void setMatchInfoList(List<MatchInfo> list) {
        this.matchInfoList = list;
    }

    public final void setQueryLimit(int i) {
        this.queryLimit = i;
    }

    public final void setTotalLimit(int i) {
        this.totalLimit = i;
    }
}
