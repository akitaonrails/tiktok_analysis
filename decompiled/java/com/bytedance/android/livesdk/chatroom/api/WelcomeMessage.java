package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class WelcomeMessage {

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("create_time_sec")
    public long createTimeSec;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("content")
    public String content = "";
}
