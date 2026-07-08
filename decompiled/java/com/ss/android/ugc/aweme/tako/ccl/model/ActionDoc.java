package com.ss.android.ugc.aweme.tako.ccl.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes5.dex */
public final class ActionDoc {

    @C09CT("action_id")
    public long actionId;

    @C09CT("sub_session_id")
    public String subSessionId;

    public final int hashCode() {
        return (C786410Ut5.Y2(this.actionId) * 31) + this.subSessionId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionDoc(actionId=");
        sbLIZ.append(this.actionId);
        sbLIZ.append(", subSessionId=");
        sbLIZ.append(this.subSessionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ActionDoc() {
        this(0L, "");
    }

    public ActionDoc(long j, String str) {
        this.actionId = j;
        this.subSessionId = str;
    }
}
