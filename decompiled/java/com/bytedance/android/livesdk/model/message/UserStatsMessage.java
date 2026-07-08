package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class UserStatsMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public long mActionType;

    @C09CT("content")
    public String mContent;

    @C09CT("user_id")
    public long mUserId;

    public UserStatsMessage() {
        this.type = C001A.USER_STATS;
    }
}
