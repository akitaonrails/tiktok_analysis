package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class BotInteractionInfo {

    @C09CT("msg_cnt")
    public final Long msgCnt;

    @C09CT("msg_cnt_show")
    public final String msgCntShow;

    public BotInteractionInfo() {
        this(null, "");
    }

    public BotInteractionInfo(Long l, String str) {
        this.msgCnt = l;
        this.msgCntShow = str;
    }
}
