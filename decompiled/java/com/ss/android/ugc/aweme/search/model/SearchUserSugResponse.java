package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchUserSugResponse {

    @C09CT("has_more")
    public Integer hasMore;

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("rid")
    public String requestId;

    @C09CT("sug_list")
    public List<? extends SearchSugEntity> sugList;

    public final boolean LIZ() {
        Integer num = this.hasMore;
        return num != null && num.intValue() == 1;
    }
}
