package com.ss.android.ugc.aweme.commercialize.log.repo.adsession;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes36.dex */
public final class SessionOpenPageInfo {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int id;

    @C09CT("source")
    public final String source;

    @C09CT("time_stamp")
    public final long timeStamp;

    public SessionOpenPageInfo(String str, int i, long j) {
        this.source = str;
        this.id = i;
        this.timeStamp = j;
    }
}
