package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoEditInfo {

    @C09CT("answer_msg_id")
    public final String answerMsgId;

    @C09CT("query_msg_id")
    public final String queryMsgId;

    public TakoEditInfo() {
        this(null, null);
    }

    public final int hashCode() {
        String str = this.queryMsgId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.answerMsgId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoEditInfo(queryMsgId=");
        sbLIZ.append(this.queryMsgId);
        sbLIZ.append(", answerMsgId=");
        sbLIZ.append(this.answerMsgId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoEditInfo(String str, String str2) {
        this.queryMsgId = str;
        this.answerMsgId = str2;
    }
}
