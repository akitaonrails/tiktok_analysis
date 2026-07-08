package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class UserBlockSource {

    @C09CT("blocking_by_type")
    public int blockingByType;

    @C09CT("user_id")
    public String userId;

    public UserBlockSource() {
        this(-1, null);
    }

    public UserBlockSource(int i, String str) {
        this.blockingByType = i;
        this.userId = str;
    }
}
