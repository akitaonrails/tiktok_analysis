package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class PassThroughMessage implements Serializable {

    @C09CT("message")
    public final String content;
    public transient long rid;

    @C09CT("type")
    public final int type;

    public PassThroughMessage() {
        this(0, null, 0L);
    }

    public final void setRid(long j) {
        this.rid = j;
    }

    public PassThroughMessage(int i, String str, long j) {
        this.type = i;
        this.content = str;
        this.rid = j;
    }
}
