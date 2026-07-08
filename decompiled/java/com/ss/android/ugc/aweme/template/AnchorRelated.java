package com.ss.android.ugc.aweme.template;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AnchorRelated implements Serializable {

    @C09CT("filter_code")
    public String filterCode;

    @C09CT("filter_reason")
    public String filterReason;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    public AnchorRelated() {
        this(null, null, null);
    }

    public AnchorRelated(Integer num, String str, String str2) {
        this.status = num;
        this.filterCode = str;
        this.filterReason = str2;
    }
}
