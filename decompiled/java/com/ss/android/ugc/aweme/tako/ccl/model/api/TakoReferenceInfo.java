package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoReferenceInfo {

    @C09CT("content")
    public final String content;

    @C09CT("msg_id")
    public final String msgId;

    public TakoReferenceInfo() {
        this(null, null);
    }

    public TakoReferenceInfo(String str, String str2) {
        this.msgId = str;
        this.content = str2;
    }
}
