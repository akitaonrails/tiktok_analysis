package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes27.dex */
public final class SMBIntentLeads {

    @C09CT("contact_flag")
    public SMBDMContactFlag contactFlag;

    @C09CT("create_time")
    public long createTime;

    @C09CT("user_info")
    public User userInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("user_id")
    public String userId = "";

    @C09CT("country_code")
    public String countryCode = "";

    @C09CT("phone_number")
    public String phoneNumber = "";

    @C09CT("email")
    public String email = "";
}
