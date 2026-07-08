package com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateSearchResultResponse {

    @C09CT("has_more")
    public final Integer _hasMore;

    @C09CT("asset_list")
    public final List<Asset> assetList;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("status_code")
    public final Integer statusCode;

    public TemplateSearchResultResponse() {
        this(-1, null, 0L, 0, null);
    }

    public TemplateSearchResultResponse(Integer num, LogPbBean logPbBean, Long l, Integer num2, List<Asset> list) {
        this.statusCode = num;
        this.logPb = logPbBean;
        this.cursor = l;
        this._hasMore = num2;
        this.assetList = list;
    }
}
