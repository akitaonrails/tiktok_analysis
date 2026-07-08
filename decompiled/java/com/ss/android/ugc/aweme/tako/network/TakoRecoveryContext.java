package com.ss.android.ugc.aweme.tako.network;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoRecoveryContext {
    public static final int $stable = 0;
    public final long botId;
    public final String subConversationId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoRecoveryContext)) {
            return false;
        }
        TakoRecoveryContext takoRecoveryContext = (TakoRecoveryContext) obj;
        return this.botId == takoRecoveryContext.botId && Intrinsics.LJFF(this.subConversationId, takoRecoveryContext.subConversationId);
    }

    public int hashCode() {
        int iY2 = C786410Ut5.Y2(this.botId) * 31;
        String str = this.subConversationId;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoRecoveryContext(botId=");
        sbLIZ.append(this.botId);
        sbLIZ.append(", subConversationId=");
        sbLIZ.append(this.subConversationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoRecoveryContext(long j, String str) {
        this.botId = j;
        this.subConversationId = str;
    }
}
