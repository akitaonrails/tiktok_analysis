package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubQueueUser {

    @C09CT("follow_status")
    public int followStatus;

    @C09CT("message")
    public SubQueueJoinMessage message;

    @C09CT("user_info")
    public User userInfo;

    @C09CT("user_id")
    public String userId = "";

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();
}
