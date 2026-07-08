package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class BotCreateResponse implements Serializable {

    @C09CT("bot_id")
    public final long botId;

    @C09CT("smart_reply_bot")
    public final DMBotInfoValueFromHttp smartReplyBot;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BotCreateResponse(int i, String str, long j, DMBotInfoValueFromHttp dMBotInfoValueFromHttp) {
        this.statusCode = i;
        this.statusMsg = str;
        this.botId = j;
        this.smartReplyBot = dMBotInfoValueFromHttp;
    }
}
