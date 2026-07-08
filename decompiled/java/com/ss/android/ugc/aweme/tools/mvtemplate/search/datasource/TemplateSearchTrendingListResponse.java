package com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.TemplateSearchTrendingItem;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class TemplateSearchTrendingListResponse {

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("trending_list")
    public final List<TemplateSearchTrendingItem> trendingList;

    public TemplateSearchTrendingListResponse() {
        this(null, null, null);
    }

    public TemplateSearchTrendingListResponse(Integer num, List<TemplateSearchTrendingItem> list, LogPbBean logPbBean) {
        this.statusCode = num;
        this.trendingList = list;
        this.logPb = logPbBean;
    }
}
