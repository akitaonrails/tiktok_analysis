package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class EntityIntro {

    @C09CT("content")
    public final String content;

    @C09CT("msg_unique_key")
    public final String msgUniqueKey;

    public EntityIntro() {
        this(null, null);
    }

    public EntityIntro(String str, String str2) {
        this.content = str;
        this.msgUniqueKey = str2;
    }
}
