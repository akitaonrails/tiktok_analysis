package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BotFeedbackCancelRequest implements Serializable {

    @C09CT("current_feedback")
    public final Integer currentFeedback;

    @C09CT("server_msg_id")
    public final Long serverMsgId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotFeedbackCancelRequest)) {
            return false;
        }
        BotFeedbackCancelRequest botFeedbackCancelRequest = (BotFeedbackCancelRequest) obj;
        return Intrinsics.LJFF(this.serverMsgId, botFeedbackCancelRequest.serverMsgId) && Intrinsics.LJFF(this.currentFeedback, botFeedbackCancelRequest.currentFeedback);
    }

    public int hashCode() {
        Long l = this.serverMsgId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.currentFeedback;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotFeedbackCancelRequest(serverMsgId=");
        sbLIZ.append(this.serverMsgId);
        sbLIZ.append(", currentFeedback=");
        sbLIZ.append(this.currentFeedback);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BotFeedbackCancelRequest() {
        this(0L, 0);
    }

    public BotFeedbackCancelRequest(Long l, Integer num) {
        this.serverMsgId = l;
        this.currentFeedback = num;
    }
}
