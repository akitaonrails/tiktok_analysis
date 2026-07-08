package com.ss.android.ugc.aweme.im.streak.impl.api;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class StreakPushUserInfo {

    @C09CT("avatar_small")
    public final StreakPushAvatar smallAvatar;

    @C09CT("user_id")
    public final String userId;

    public StreakPushUserInfo() {
        this(null, null);
    }

    public StreakPushUserInfo(String str, StreakPushAvatar streakPushAvatar) {
        this.userId = str;
        this.smallAvatar = streakPushAvatar;
    }
}
