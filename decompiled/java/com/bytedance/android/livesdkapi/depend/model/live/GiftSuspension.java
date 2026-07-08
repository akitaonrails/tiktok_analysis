package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GiftSuspension {

    @C09CT("end_time")
    public long endTime;

    @C09CT("end_time_v2")
    public long endTimeV2;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("toast")
    public String toast = "";
}
