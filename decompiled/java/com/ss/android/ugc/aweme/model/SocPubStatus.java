package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes25.dex */
public final class SocPubStatus {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("user_id")
    public final String uid;

    public SocPubStatus(Integer num, String str) {
        this.status = num;
        this.uid = str;
    }
}
