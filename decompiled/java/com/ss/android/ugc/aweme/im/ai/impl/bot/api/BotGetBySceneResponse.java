package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BotGetBySceneResponse implements Serializable {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final long nextCursor;

    @C09CT("smart_reply_bot")
    public final List<DMBotInfoValueFromHttp> smartReplyBotList;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BotGetBySceneResponse(int i, String str, List<DMBotInfoValueFromHttp> list, long j, boolean z) {
        this.statusCode = i;
        this.statusMsg = str;
        this.smartReplyBotList = list;
        this.nextCursor = j;
        this.hasMore = z;
    }
}
