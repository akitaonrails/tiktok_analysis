package com.ss.android.ugc.aweme.tako.ccl.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class ActionNoHistoryItem {

    @C09CT("action_id")
    public final long actionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionNoHistoryItem) && this.actionId == ((ActionNoHistoryItem) obj).actionId;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.actionId);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionNoHistoryItem(actionId=");
        sbLIZ.append(this.actionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ActionNoHistoryItem() {
        this(0L);
    }

    public ActionNoHistoryItem(long j) {
        this.actionId = j;
    }
}
