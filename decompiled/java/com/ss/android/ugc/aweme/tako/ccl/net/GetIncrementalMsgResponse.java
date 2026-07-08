package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.model.api.InboxMsg;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class GetIncrementalMsgResponse extends TakoBaseResponse {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("inbox_messages")
    public final List<InboxMsg> inboxMsg;

    @C09CT("resync")
    public final boolean reSync;

    public GetIncrementalMsgResponse() {
        this(null, 0L, false, false, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetIncrementalMsgResponse)) {
            return false;
        }
        GetIncrementalMsgResponse getIncrementalMsgResponse = (GetIncrementalMsgResponse) obj;
        return Intrinsics.LJFF(this.inboxMsg, getIncrementalMsgResponse.inboxMsg) && this.cursor == getIncrementalMsgResponse.cursor && this.hasMore == getIncrementalMsgResponse.hasMore && this.reSync == getIncrementalMsgResponse.reSync;
    }

    public final int hashCode() {
        List<InboxMsg> list = this.inboxMsg;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Z2(this.reSync);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetIncrementalMsgResponse(inboxMsg=");
        sbLIZ.append(this.inboxMsg);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", reSync=");
        sbLIZ.append(this.reSync);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetIncrementalMsgResponse(List<InboxMsg> list, long j, boolean z, boolean z2) {
        super(null, 0, "");
        this.inboxMsg = list;
        this.cursor = j;
        this.hasMore = z;
        this.reSync = z2;
    }

    public GetIncrementalMsgResponse(List list, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
