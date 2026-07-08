package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes30.dex */
public final class ListOrderComponentFilter {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public ListOrderComponentFilter() {
        this(0);
    }

    public ListOrderComponentFilter(int i) {
        this.status = i;
    }
}
