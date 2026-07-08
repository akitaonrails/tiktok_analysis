package com.ss.android.ugc.aweme.commercialize.log.repo.adsession;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes36.dex */
public final class SessionPlayInfo {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int id;

    @C09CT("time_stamp")
    public final long timeStamp;

    public SessionPlayInfo(int i, long j) {
        this.id = i;
        this.timeStamp = j;
    }
}
