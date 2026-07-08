package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class BotDeleteResponse implements Serializable {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BotDeleteResponse(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
