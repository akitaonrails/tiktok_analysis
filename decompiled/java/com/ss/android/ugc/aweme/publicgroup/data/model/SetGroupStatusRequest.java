package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.EnumC1206110hUX;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes19.dex */
public final class SetGroupStatusRequest {

    @C09CT("conversation_short_id")
    public final Long convShortId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer groupShowStatus;

    public SetGroupStatusRequest() {
        this(0L, Integer.valueOf(EnumC1206110hUX.UNKNOWN.getValue()));
    }

    public SetGroupStatusRequest(Long l, Integer num) {
        this.convShortId = l;
        this.groupShowStatus = num;
    }
}
