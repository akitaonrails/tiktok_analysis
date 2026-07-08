package com.ss.android.ugc.aweme.editeffect.search.middleware.trending;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class EditEffectSearchTrendingListResponse {

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("trending_list")
    public final List<EditEffectSearchTrendingItem> trendingList;

    public EditEffectSearchTrendingListResponse() {
        this(null, null, null);
    }

    public EditEffectSearchTrendingListResponse(Integer num, List<EditEffectSearchTrendingItem> list, LogPbBean logPbBean) {
        this.statusCode = num;
        this.trendingList = list;
        this.logPb = logPbBean;
    }
}
