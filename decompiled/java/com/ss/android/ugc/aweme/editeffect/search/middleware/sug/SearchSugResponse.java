package com.ss.android.ugc.aweme.editeffect.search.middleware.sug;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SearchSugResponse {
    public transient String LIZ;
    public transient String LIZIZ;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("original_query")
    public final String originQuery;

    @C09CT("rid")
    public final String requestId;

    @C09CT("request_order")
    public final Long requestOrder;

    @C09CT("result_status")
    public final Integer resultStatus;

    @C09CT("status_code")
    public final Integer statusStatus;

    @C09CT("config")
    public final SugConfig sugConfig;

    @C09CT("sug_list")
    public List<SearchSugEntity> sugList;

    @C09CT("sug_virtual_enable")
    public final String sugVirtualEnable;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSugResponse)) {
            return false;
        }
        SearchSugResponse searchSugResponse = (SearchSugResponse) obj;
        return Intrinsics.LJFF(this.LIZ, searchSugResponse.LIZ) && Intrinsics.LJFF(this.LIZIZ, searchSugResponse.LIZIZ) && Intrinsics.LJFF(this.sugList, searchSugResponse.sugList) && Intrinsics.LJFF(this.requestId, searchSugResponse.requestId) && Intrinsics.LJFF(this.logPb, searchSugResponse.logPb) && Intrinsics.LJFF(this.requestOrder, searchSugResponse.requestOrder) && Intrinsics.LJFF(this.sugVirtualEnable, searchSugResponse.sugVirtualEnable) && Intrinsics.LJFF(this.sugConfig, searchSugResponse.sugConfig) && Intrinsics.LJFF(this.originQuery, searchSugResponse.originQuery) && Intrinsics.LJFF(this.resultStatus, searchSugResponse.resultStatus) && Intrinsics.LJFF(this.statusStatus, searchSugResponse.statusStatus);
    }

    public SearchSugResponse(String str, String str2, List<SearchSugEntity> list, String str3, LogPbBean logPbBean, Long l, String str4, SugConfig sugConfig, String str5, Integer num, Integer num2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.sugList = list;
        this.requestId = str3;
        this.logPb = logPbBean;
        this.requestOrder = l;
        this.sugVirtualEnable = str4;
        this.sugConfig = sugConfig;
        this.originQuery = str5;
        this.resultStatus = num;
        this.statusStatus = num2;
    }
}
