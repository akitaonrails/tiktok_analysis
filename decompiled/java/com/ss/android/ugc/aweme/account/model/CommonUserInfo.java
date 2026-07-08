package com.ss.android.ugc.aweme.account.model;

import X.C0XTZ;

/* JADX INFO: loaded from: classes14.dex */
public final class CommonUserInfo {
    public static final C0XTZ Companion = new C0XTZ();
    public final Integer avatarExpires;
    public final String avatarUri;
    public final String avatarUrl;
    public String screenName;
    public final String secUid;
    public final String userName;

    public static final CommonUserInfo defaultCommonUserInfo() {
        Companion.getClass();
        return C0XTZ.LIZ();
    }

    public final boolean isCommonInfoAvailable() {
        return this.userName.length() > 0 && this.avatarUrl.length() > 0;
    }

    public final void setScreenName(String str) {
        this.screenName = str;
    }

    public CommonUserInfo(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.userName = str;
        this.avatarUrl = str2;
        this.secUid = str3;
        this.screenName = str4;
        this.avatarUri = str5;
        this.avatarExpires = num;
    }
}
