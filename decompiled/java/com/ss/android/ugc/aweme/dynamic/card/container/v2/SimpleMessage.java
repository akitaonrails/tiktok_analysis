package com.ss.android.ugc.aweme.dynamic.card.container.v2;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class SimpleMessage {

    @C09CT("content")
    public final String content;

    @C09CT("replyType")
    public final int replyType;

    public SimpleMessage() {
        this(0, null);
    }

    public SimpleMessage(int i, String str) {
        this.replyType = i;
        this.content = str;
    }
}
