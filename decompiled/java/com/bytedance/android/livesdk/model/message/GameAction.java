package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class GameAction {

    @C09CT("action_schema")
    public String actionSchema = "";

    @C09CT("action_type")
    public int actionType;

    @C09CT("follow_user_id")
    public long followUserId;

    @C09CT("follow_user_info")
    public User followUserInfo;

    @C09CT("jump_page")
    public int jumpPage;
}
