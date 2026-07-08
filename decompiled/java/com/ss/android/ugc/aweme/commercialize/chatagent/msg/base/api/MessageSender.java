package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes5.dex */
public final class MessageSender {

    @C09CT("bot_id")
    public final long botId;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("is_self")
    public final boolean isSelf;

    @C09CT("type")
    public final int senderType;

    @C09CT("user_id")
    public final long userId;

    public final int hashCode() {
        return (((((((this.senderType * 31) + C786410Ut5.Y2(this.userId)) * 31) + C786410Ut5.Y2(this.botId)) * 31) + C786410Ut5.Z2(this.isSelf)) * 31) + this.iconUrl.hashCode();
    }

    public MessageSender() {
        this(1, 0L, 0L, false, "");
    }

    public MessageSender(int i, long j, long j2, boolean z, String str) {
        this.senderType = i;
        this.userId = j;
        this.botId = j2;
        this.isSelf = z;
        this.iconUrl = str;
    }
}
