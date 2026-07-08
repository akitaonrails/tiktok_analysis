package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class SettingMessage implements Serializable {

    @C09CT("message")
    public final String content;

    @C09CT("expire_seconds")
    public final long expireSeconds;

    @C09CT("type")
    public final int type;

    public SettingMessage() {
        this(0, null, 0L);
    }

    public SettingMessage(int i, String str, long j) {
        this.type = i;
        this.content = str;
        this.expireSeconds = j;
    }
}
