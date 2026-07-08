package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import com.google.gson.k;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes19.dex */
public final class PageInfo {

    @C09CT("data")
    public final k data;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String pageId;

    @C09CT("response_type")
    public final Integer responseType;

    public PageInfo() {
        this(null, 0, null, null);
    }

    public final DeprecatedPageInfo toDeprecatedPageInfo() {
        return new DeprecatedPageInfo(this.pageId, this.responseType, this.logPb);
    }

    public PageInfo(String str, Integer num, LogPbBean logPbBean, k kVar) {
        this.pageId = str;
        this.responseType = num;
        this.logPb = logPbBean;
        this.data = kVar;
    }
}
