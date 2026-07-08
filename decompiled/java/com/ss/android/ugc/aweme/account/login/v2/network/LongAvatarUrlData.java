package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class LongAvatarUrlData implements Serializable {
    public static final int $stable = 0;

    @C09CT("avatar_uri")
    public final String avatarUri;

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("expires")
    public final Integer expires;

    public LongAvatarUrlData(String str, String str2, Integer num) {
        this.avatarUrl = str;
        this.avatarUri = str2;
        this.expires = num;
    }
}
