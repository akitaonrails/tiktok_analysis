package com.ss.android.ugc.aweme.service.perfetservice;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class CaptionDisplaySwitchRecord implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("timestamp")
    public final long timestamp;

    public CaptionDisplaySwitchRecord(long j, String str) {
        this.timestamp = j;
        this.status = str;
    }
}
