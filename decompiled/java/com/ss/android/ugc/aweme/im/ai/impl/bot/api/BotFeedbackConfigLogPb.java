package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BotFeedbackConfigLogPb implements Serializable {

    @C09CT("impr_id")
    public final String imprId;

    public BotFeedbackConfigLogPb() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BotFeedbackConfigLogPb) && Intrinsics.LJFF(this.imprId, ((BotFeedbackConfigLogPb) obj).imprId);
    }

    public int hashCode() {
        String str = this.imprId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotFeedbackConfigLogPb(imprId=");
        sbLIZ.append(this.imprId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BotFeedbackConfigLogPb(String str) {
        this.imprId = str;
    }
}
