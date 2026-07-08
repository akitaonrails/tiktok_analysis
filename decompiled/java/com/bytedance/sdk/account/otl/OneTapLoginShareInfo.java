package com.bytedance.sdk.account.otl;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class OneTapLoginShareInfo {

    @C09CT("avatar_url")
    public String avatarUrl;

    @C09CT("device_secret")
    public String deviceSecret;

    @C09CT("id_token")
    public String idToken;

    @C09CT("id_token_id")
    public String idTokenId;

    @C09CT("is_selected")
    public boolean isSelected;

    @C09CT("last_updated")
    public long lastUpdated;

    @C09CT("user_id")
    public final String userId;

    @C09CT("username")
    public String username;

    public OneTapLoginShareInfo(String str, String str2, String str3, String str4, String str5, boolean z, long j, String str6) {
        this.userId = str;
        this.idToken = str2;
        this.deviceSecret = str3;
        this.username = str4;
        this.avatarUrl = str5;
        this.isSelected = z;
        this.lastUpdated = j;
        this.idTokenId = str6;
    }
}
