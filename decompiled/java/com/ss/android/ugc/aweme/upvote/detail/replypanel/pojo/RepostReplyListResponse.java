package com.ss.android.ugc.aweme.upvote.detail.replypanel.pojo;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RepostReplyListResponse extends BaseResponse {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final long nextCursor;

    @C09CT("comments")
    public final List<RepostReplyStruct> replies;

    @C09CT("total")
    public final Long total;

    public RepostReplyListResponse() {
        this(null, 0L, false, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostReplyListResponse)) {
            return false;
        }
        RepostReplyListResponse repostReplyListResponse = (RepostReplyListResponse) obj;
        return Intrinsics.LJFF(this.replies, repostReplyListResponse.replies) && this.nextCursor == repostReplyListResponse.nextCursor && this.hasMore == repostReplyListResponse.hasMore && Intrinsics.LJFF(this.total, repostReplyListResponse.total);
    }

    public final int hashCode() {
        int iHashCode = ((((this.replies.hashCode() * 31) + C786410Ut5.Y2(this.nextCursor)) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        Long l = this.total;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostReplyListResponse(replies=");
        sbLIZ.append(this.replies);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RepostReplyListResponse(List<RepostReplyStruct> list, long j, boolean z, Long l) {
        this.replies = list;
        this.nextCursor = j;
        this.hasMore = z;
        this.total = l;
    }

    public RepostReplyListResponse(List list, long j, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : l);
    }
}
