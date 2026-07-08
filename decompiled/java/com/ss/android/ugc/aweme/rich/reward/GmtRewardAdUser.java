package com.ss.android.ugc.aweme.rich.reward;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class GmtRewardAdUser implements Serializable {

    @C09CT("nickname")
    public final String nickname;

    public GmtRewardAdUser() {
        this(null);
    }

    public GmtRewardAdUser(String str) {
        this.nickname = str;
    }
}
