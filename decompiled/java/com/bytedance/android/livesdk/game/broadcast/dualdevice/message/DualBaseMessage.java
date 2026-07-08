package com.bytedance.android.livesdk.game.broadcast.dualdevice.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes13.dex */
public abstract class DualBaseMessage {

    @C09CT("is_need_ack")
    public boolean isNeedAck;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id = -1;

    @C09CT("resume_timestamp_millsec")
    public long resumeTimestampMillsec = -1;

    public abstract int LIZ();
}
