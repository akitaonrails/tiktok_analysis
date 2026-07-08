package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public class AdAck {

    @C09CT("message")
    public String message;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public int getStatus() {
        return this.status;
    }
}
