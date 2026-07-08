package com.ss.android.ugc.aweme.account.login.model;

import X.C0XUS;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes14.dex */
public final class TPUserInfo {
    public static final int $stable = 0;
    public static final C0XUS Companion = new C0XUS();
    public final String avatarUrl;
    public final String userName;

    public static final TPUserInfo from(User user) {
        Companion.getClass();
        return C0XUS.LIZ(user);
    }

    public TPUserInfo(String str, String str2) {
        this.userName = str;
        this.avatarUrl = str2;
    }
}
