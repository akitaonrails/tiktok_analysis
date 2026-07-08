package com.ss.android.ugc.aweme.tako.ccl.model;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class NovelStatus {

    @C09CT("choice_id")
    public final String choiceId;

    @C09CT("is_peek")
    public final boolean isPeek;

    @C09CT("msg_id")
    public final String msgId;

    public NovelStatus() {
        this(false, "", null);
    }

    public NovelStatus(boolean z, String str, String str2) {
        this.isPeek = z;
        this.msgId = str;
        this.choiceId = str2;
    }
}
