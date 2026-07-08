package com.bytedance.android.livesdk.usermanage.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public class AdminResponse {

    @C09CT("is_anchor_assign")
    public boolean mIsAnchorAssign;

    @C09CT("user_info")
    public User mUser;

    @C09CT("user_tag")
    public String userTag;

    @C09CT("recent_watch_status")
    public int watchStatus;
}
