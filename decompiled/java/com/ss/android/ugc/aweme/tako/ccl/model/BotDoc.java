package com.ss.android.ugc.aweme.tako.ccl.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes28.dex */
public final class BotDoc {

    @C09CT("bot_id")
    public long botId;

    @C09CT("bot_mode")
    public int botMode;

    @C09CT("sub_session_id")
    public String subSessionId;

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.botId) * 31) + this.subSessionId.hashCode()) * 31) + this.botMode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotDoc(botId=");
        sbLIZ.append(this.botId);
        sbLIZ.append(", subSessionId=");
        sbLIZ.append(this.subSessionId);
        sbLIZ.append(", botMode=");
        sbLIZ.append(this.botMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BotDoc() {
        this(0L, "", -1);
    }

    public BotDoc(long j, String str, int i) {
        this.botId = j;
        this.subSessionId = str;
        this.botMode = i;
    }
}
