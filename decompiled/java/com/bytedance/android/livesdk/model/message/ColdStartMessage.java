package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class ColdStartMessage extends AbstractC1136060ffY {

    @C09CT("msg_type")
    public int msgType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("total_count")
    public long totalCount;

    @C09CT("viewer_count")
    public long viewerCount;

    public ColdStartMessage() {
        this.type = C001A.COLD_START_MESSAGE;
    }
}
