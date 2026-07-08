package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class DMBotAccountInfo implements Serializable {

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("unique_name")
    public final String uniqueName;

    public DMBotAccountInfo() {
        this(null, null, null);
    }

    public DMBotAccountInfo(String str, String str2, String str3) {
        this.nickname = str;
        this.uniqueName = str2;
        this.avatarUrl = str3;
    }
}
