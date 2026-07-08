package com.bytedance.touchpoint.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class Status {

    @C09CT("refresh_timestamp")
    public final Long refreshTimeStamp;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    public Status() {
        this("", 0L);
    }

    public Status(String str, Long l) {
        this.status = str;
        this.refreshTimeStamp = l;
    }
}
