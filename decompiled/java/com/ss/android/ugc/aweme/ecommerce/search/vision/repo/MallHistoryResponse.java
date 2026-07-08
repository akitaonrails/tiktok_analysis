package com.ss.android.ugc.aweme.ecommerce.search.vision.repo;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MallHistoryResponse {

    @C09CT("groups")
    public final List<DailyHistoryModel> groups;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("total_count")
    public final Integer totalCount;

    public MallHistoryResponse(List<DailyHistoryModel> list, Boolean bool, Integer num) {
        this.groups = list;
        this.hasMore = bool;
        this.totalCount = num;
    }
}
