package com.ss.android.ugc.aweme.im.b2c.replies.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class QuickReplyListResponse extends BaseResponse {

    @C09CT("quick_reply_list")
    public final List<IMQuickReply> list;

    public QuickReplyListResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuickReplyListResponse) && Intrinsics.LJFF(this.list, ((QuickReplyListResponse) obj).list);
    }

    public final int hashCode() {
        return this.list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickReplyListResponse(list=");
        sbLIZ.append(this.list);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuickReplyListResponse(List<IMQuickReply> list) {
        this.list = list;
    }

    public QuickReplyListResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
