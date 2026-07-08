package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SMBKYBInfo {

    @C09CT("create_time")
    public long createTime;

    @C09CT("enabled")
    public boolean enabled;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("update_time")
    public long updateTime;

    @C09CT("user_id")
    public String userId = "";

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("identification")
    public String identification = "";
}
