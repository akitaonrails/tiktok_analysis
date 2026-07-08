package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class BotUpdateRequest implements Serializable {

    @C09CT("auto_reply_switch")
    public final Integer autoReplySwitch;

    @C09CT("avoid")
    public final String avoidInstructions;

    @C09CT("bot_id")
    public final long botId;

    @C09CT("check_first")
    public final String checkFirstInstructions;

    @C09CT("suggested_reply_switch")
    public final Integer suggestedReplySwitch;

    public BotUpdateRequest(long j, Integer num, Integer num2, String str, String str2) {
        this.botId = j;
        this.suggestedReplySwitch = num;
        this.autoReplySwitch = num2;
        this.avoidInstructions = str;
        this.checkFirstInstructions = str2;
    }
}
