package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class LiveUser {
    public static final int $stable = 0;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    public LiveUser() {
        this(0L);
    }

    public LiveUser(long j) {
        this.id = j;
    }
}
