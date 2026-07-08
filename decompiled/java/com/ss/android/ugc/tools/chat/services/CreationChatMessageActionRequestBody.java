package com.ss.android.ugc.tools.chat.services;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CreationChatMessageActionRequestBody {

    @C09CT("action")
    public final Integer action;

    @C09CT("conversation_id")
    public final String convID;

    @C09CT("conversation_short_id")
    public final String convShortID;

    @C09CT("server_message_id")
    public final String serverMsgId;

    public CreationChatMessageActionRequestBody() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationChatMessageActionRequestBody)) {
            return false;
        }
        CreationChatMessageActionRequestBody creationChatMessageActionRequestBody = (CreationChatMessageActionRequestBody) obj;
        return Intrinsics.LJFF(this.serverMsgId, creationChatMessageActionRequestBody.serverMsgId) && Intrinsics.LJFF(this.convID, creationChatMessageActionRequestBody.convID) && Intrinsics.LJFF(this.convShortID, creationChatMessageActionRequestBody.convShortID) && Intrinsics.LJFF(this.action, creationChatMessageActionRequestBody.action);
    }

    public final int hashCode() {
        String str = this.serverMsgId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.convID;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.convShortID;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.action;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationChatMessageActionRequestBody(serverMsgId=");
        sbLIZ.append(this.serverMsgId);
        sbLIZ.append(", convID=");
        sbLIZ.append(this.convID);
        sbLIZ.append(", convShortID=");
        sbLIZ.append(this.convShortID);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreationChatMessageActionRequestBody(String str, String str2, String str3, Integer num) {
        this.serverMsgId = str;
        this.convID = str2;
        this.convShortID = str3;
        this.action = num;
    }
}
