package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UserBean {

    @C09CT("room_id")
    public long roomId;

    @C09CT("user_id")
    public long userId;

    public UserBean() {
        this(0L, 0L);
    }

    public UserBean(long j, long j2) {
        this.roomId = j;
        this.userId = j2;
    }
}
