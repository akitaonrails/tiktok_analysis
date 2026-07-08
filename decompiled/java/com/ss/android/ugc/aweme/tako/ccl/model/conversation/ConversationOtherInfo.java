package com.ss.android.ugc.aweme.tako.ccl.model.conversation;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes29.dex */
public final class ConversationOtherInfo {

    @C09CT("bot_id")
    public final long botId;

    @C09CT("is_tako")
    public final boolean isTako;

    @C09CT("type")
    public final int type;

    public ConversationOtherInfo() {
        this(0, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationOtherInfo)) {
            return false;
        }
        ConversationOtherInfo conversationOtherInfo = (ConversationOtherInfo) obj;
        return this.type == conversationOtherInfo.type && this.botId == conversationOtherInfo.botId && this.isTako == conversationOtherInfo.isTako;
    }

    public final int hashCode() {
        return (((this.type * 31) + C786410Ut5.Y2(this.botId)) * 31) + C786410Ut5.Z2(this.isTako);
    }

    public ConversationOtherInfo(int i, long j, boolean z) {
        this.type = i;
        this.botId = j;
        this.isTako = z;
    }
}
