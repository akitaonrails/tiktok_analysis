package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class LoadMoreMsgByConversationResponse extends CommerceAgentBaseResponse {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("messages")
    public final List<Message> messages;

    public LoadMoreMsgByConversationResponse() {
        this(null, 0L, false, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoreMsgByConversationResponse)) {
            return false;
        }
        LoadMoreMsgByConversationResponse loadMoreMsgByConversationResponse = (LoadMoreMsgByConversationResponse) obj;
        return Intrinsics.LJFF(this.messages, loadMoreMsgByConversationResponse.messages) && this.cursor == loadMoreMsgByConversationResponse.cursor && this.hasMore == loadMoreMsgByConversationResponse.hasMore;
    }

    public final int hashCode() {
        List<Message> list = this.messages;
        return ((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadMoreMsgByConversationResponse(messages=");
        sbLIZ.append(this.messages);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LoadMoreMsgByConversationResponse(List<Message> list, long j, boolean z) {
        super(null, 0, "");
        this.messages = list;
        this.cursor = j;
        this.hasMore = z;
    }

    public LoadMoreMsgByConversationResponse(List list, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z);
    }
}
