package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BotUpdateResponse implements Serializable {

    @C09CT("highlight_text")
    public final List<String> highlightText;

    @C09CT("reject_reason")
    public final String rejectReason;

    @C09CT("smart_reply_bot")
    public final IMAIBotInfo smartReplyBot;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BotUpdateResponse(int i, String str, IMAIBotInfo iMAIBotInfo, List<String> list, String str2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.smartReplyBot = iMAIBotInfo;
        this.highlightText = list;
        this.rejectReason = str2;
    }
}
