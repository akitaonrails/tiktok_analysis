package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BotFeedbackReason implements Serializable {

    @C09CT("reason_id")
    public final Long reasonId;

    @C09CT("reason_text")
    public final String reasonText;

    public BotFeedbackReason() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotFeedbackReason)) {
            return false;
        }
        BotFeedbackReason botFeedbackReason = (BotFeedbackReason) obj;
        return Intrinsics.LJFF(this.reasonId, botFeedbackReason.reasonId) && Intrinsics.LJFF(this.reasonText, botFeedbackReason.reasonText);
    }

    public int hashCode() {
        Long l = this.reasonId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.reasonText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotFeedbackReason(reasonId=");
        sbLIZ.append(this.reasonId);
        sbLIZ.append(", reasonText=");
        sbLIZ.append(this.reasonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BotFeedbackReason(Long l, String str) {
        this.reasonId = l;
        this.reasonText = str;
    }
}
