package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupInviteListTabsRequest {

    @C09CT("conversation_short_id")
    public final long conversationShortId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupInviteListTabsRequest) && this.conversationShortId == ((GroupInviteListTabsRequest) obj).conversationShortId;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.conversationShortId);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupInviteListTabsRequest(conversationShortId=");
        sbLIZ.append(this.conversationShortId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupInviteListTabsRequest() {
        this(0L);
    }

    public GroupInviteListTabsRequest(long j) {
        this.conversationShortId = j;
    }
}
