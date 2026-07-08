package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SimpleUserInfo {

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("nickname")
    public final String nickName;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("uid")
    public final String uid;

    @C09CT("user_name")
    public final String userName;

    public SimpleUserInfo(String str, String str2, String str3, String str4, String str5) {
        this.uid = str;
        this.secUid = str2;
        this.nickName = str3;
        this.coverUrl = str4;
        this.userName = str5;
    }
}
