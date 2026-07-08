package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class BotDeleteRequest implements Serializable {

    @C09CT("bot_id")
    public final long botId;

    public BotDeleteRequest(long j) {
        this.botId = j;
    }
}
