package com.ss.android.ugc.aweme.amazon.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class AmazonTokenInfo {

    @C09CT("access_token")
    public final String accessToken;

    @C09CT("expires_in")
    public final Long expiresInTimeStamp;

    @C09CT("issue_at")
    public final Long issueAtTimeStamp;

    @C09CT("pkce")
    public final String pkce;

    @C09CT("refresh_token")
    public final String refreshToken;

    public AmazonTokenInfo(String str, String str2, String str3, Long l, Long l2) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.pkce = str3;
        this.issueAtTimeStamp = l;
        this.expiresInTimeStamp = l2;
    }
}
