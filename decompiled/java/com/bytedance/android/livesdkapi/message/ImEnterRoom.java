package com.bytedance.android.livesdkapi.message;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public class ImEnterRoom {

    @C09CT("account_type")
    public long accountType;

    @C09CT("cursor")
    public String cursor;

    @C09CT("enter_uniq_id")
    public long enterUniqueId;

    @C09CT("filter_welcome_msg")
    public String filterWelcomeMsg = "";

    @C09CT("identity")
    public String identity;

    @C09CT("is_anchor_continue_keep_msg")
    public boolean isAnchorContinueKeepMsg;

    @C09CT("live_id")
    public long liveId;

    @C09CT("live_region")
    public String liveRegion;

    @C09CT("room_id")
    public long roomId;

    @C09CT("room_tag")
    public String roomTag;
}
