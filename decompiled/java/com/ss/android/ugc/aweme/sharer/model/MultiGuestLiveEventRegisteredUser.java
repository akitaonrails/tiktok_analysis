package com.ss.android.ugc.aweme.sharer.model;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class MultiGuestLiveEventRegisteredUser {

    @C09CT("avatarUrl")
    public final String avatarUrl;

    @C09CT("isAlreadyRead")
    public final boolean isAlreadyRead;

    @C09CT("nickName")
    public final String nickName;

    @C09CT("registerTime")
    public final Long registerTime;

    @C09CT("relationShip")
    public final Integer relationShip;

    @C09CT("uid")
    public final Long uid;

    @C09CT("userName")
    public final String userName;

    public MultiGuestLiveEventRegisteredUser() {
        this(0L, "", "", 0, 0L, false, "");
    }

    public MultiGuestLiveEventRegisteredUser(Long l, String str, String str2, Integer num, Long l2, boolean z, String str3) {
        this.uid = l;
        this.nickName = str;
        this.avatarUrl = str2;
        this.relationShip = num;
        this.registerTime = l2;
        this.isAlreadyRead = z;
        this.userName = str3;
    }
}
