package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMessageReadResponse extends TakoBaseResponse {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("msg_id")
    public final String msgId;

    @C09CT("msg_seq_id")
    public final long msgSeqId;

    @C09CT("sub_conv_id")
    public final String subConversationId;

    public TakoMessageReadResponse() {
        this("", null, 0L, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoMessageReadResponse)) {
            return false;
        }
        TakoMessageReadResponse takoMessageReadResponse = (TakoMessageReadResponse) obj;
        return Intrinsics.LJFF(this.conversationId, takoMessageReadResponse.conversationId) && Intrinsics.LJFF(this.subConversationId, takoMessageReadResponse.subConversationId) && this.msgSeqId == takoMessageReadResponse.msgSeqId && Intrinsics.LJFF(this.msgId, takoMessageReadResponse.msgId);
    }

    public final int hashCode() {
        int iHashCode = this.conversationId.hashCode() * 31;
        String str = this.subConversationId;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.msgSeqId)) * 31) + this.msgId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMessageReadResponse(conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", subConversationId=");
        sbLIZ.append(this.subConversationId);
        sbLIZ.append(", msgSeqId=");
        sbLIZ.append(this.msgSeqId);
        sbLIZ.append(", msgId=");
        sbLIZ.append(this.msgId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoMessageReadResponse(String str, String str2, long j, String str3) {
        super(null, 0, "");
        this.conversationId = str;
        this.subConversationId = str2;
        this.msgSeqId = j;
        this.msgId = str3;
    }
}
