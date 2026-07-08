package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class AdWebHistorySessionInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Integer id;

    @C09CT("time_stamp")
    public final Long timeStamp;

    public AdWebHistorySessionInfo(Integer num, Long l) {
        this.id = num;
        this.timeStamp = l;
    }
}
