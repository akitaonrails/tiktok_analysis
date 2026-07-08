package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class FetchSubConversationListResponse extends TakoBaseResponse {
    public final transient int LIZ;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("sub_conversations")
    public final List<ConversationInfo> subConversations;

    @C09CT("total_unread_count")
    public final int totalUnreadCount;

    public FetchSubConversationListResponse() {
        this(null, false, 0, 0, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchSubConversationListResponse)) {
            return false;
        }
        FetchSubConversationListResponse fetchSubConversationListResponse = (FetchSubConversationListResponse) obj;
        return Intrinsics.LJFF(this.subConversations, fetchSubConversationListResponse.subConversations) && this.hasMore == fetchSubConversationListResponse.hasMore && this.totalUnreadCount == fetchSubConversationListResponse.totalUnreadCount && this.LIZ == fetchSubConversationListResponse.LIZ;
    }

    public final int hashCode() {
        List<ConversationInfo> list = this.subConversations;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.totalUnreadCount) * 31) + this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchSubConversationListResponse(subConversations=");
        sbLIZ.append(this.subConversations);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", totalUnreadCount=");
        sbLIZ.append(this.totalUnreadCount);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FetchSubConversationListResponse(List<ConversationInfo> list, boolean z, int i, int i2) {
        super(null, 0, "");
        this.subConversations = list;
        this.hasMore = z;
        this.totalUnreadCount = i;
        this.LIZ = i2;
    }

    public FetchSubConversationListResponse(List list, boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C13BV.INSTANCE : list, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
