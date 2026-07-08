package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class FetchConversationResponse extends TakoBaseResponse {

    @C09CT("conversation")
    public final ConversationInfo conversation;

    public FetchConversationResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchConversationResponse) && Intrinsics.LJFF(this.conversation, ((FetchConversationResponse) obj).conversation);
    }

    public final int hashCode() {
        ConversationInfo conversationInfo = this.conversation;
        if (conversationInfo == null) {
            return 0;
        }
        return conversationInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchConversationResponse(conversation=");
        sbLIZ.append(this.conversation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FetchConversationResponse(ConversationInfo conversationInfo) {
        super(null, 0, "");
        this.conversation = conversationInfo;
    }
}
