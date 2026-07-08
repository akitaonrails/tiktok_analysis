package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class DeprecatedPageInfo implements Serializable {

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String pageId;

    @C09CT("response_type")
    public final Integer responseType;

    public DeprecatedPageInfo() {
        this(null, 0, null);
    }

    public final PageInfo toPageInfo() {
        return new PageInfo(this.pageId, this.responseType, this.logPb, null);
    }

    public DeprecatedPageInfo(String str, Integer num, LogPbBean logPbBean) {
        this.pageId = str;
        this.responseType = num;
        this.logPb = logPbBean;
    }
}
