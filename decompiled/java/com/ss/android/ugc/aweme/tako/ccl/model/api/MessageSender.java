package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageSender)) {
            return false;
        }
        MessageSender messageSender = (MessageSender) obj;
        return this.senderType == messageSender.senderType && this.userId == messageSender.userId && this.botId == messageSender.botId && this.isSelf == messageSender.isSelf && Intrinsics.LJFF(this.iconUrl, messageSender.iconUrl);
    }

    public final int hashCode() {
        return (((((((this.senderType * 31) + C786410Ut5.Y2(this.userId)) * 31) + C786410Ut5.Y2(this.botId)) * 31) + C786410Ut5.Z2(this.isSelf)) * 31) + this.iconUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageSender(senderType=");
        sbLIZ.append(this.senderType);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", botId=");
        sbLIZ.append(this.botId);
        sbLIZ.append(", isSelf=");
        sbLIZ.append(this.isSelf);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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
