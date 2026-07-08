package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class BrandedContentAccount {

    @C09CT("nickname")
    public String nickname;

    @C09CT("uid")
    public String userId;

    public BrandedContentAccount() {
        this(null, null);
    }

    public BrandedContentAccount(String str, String str2) {
        this.userId = str;
        this.nickname = str2;
    }
}
