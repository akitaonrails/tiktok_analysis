package com.ss.android.ugc.aweme.websocket.api.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes14.dex */
public final class Base {

    @C09CT("net_error")
    public Integer netError;

    @C09CT("origin_url")
    public String originUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public String status;

    public Base() {
        this(null, null, null);
    }

    public Base(Integer num, String str, String str2) {
        this.netError = num;
        this.originUrl = str;
        this.status = str2;
    }
}
