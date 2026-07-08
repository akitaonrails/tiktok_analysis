package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes10.dex */
public final class PCDeviceInfo {

    @C09CT("create_time")
    public long createTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("update_time")
    public long updateTime;

    @C09CT("user_agent")
    public String userAgent = "";

    @C09CT("web_id")
    public String webId = "";

    @C09CT("browser_name")
    public String browserName = "";
}
