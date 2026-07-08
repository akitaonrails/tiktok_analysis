package com.ss.android.ugc.aweme.tako.otherpage.share.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class ShareMessage {

    @C09CT("answer_index")
    public final int answerIndex;

    @C09CT("msg_id")
    public final String msgId;

    public ShareMessage() {
        this("", 0);
    }

    public ShareMessage(String str, int i) {
        this.msgId = str;
        this.answerIndex = i;
    }
}
