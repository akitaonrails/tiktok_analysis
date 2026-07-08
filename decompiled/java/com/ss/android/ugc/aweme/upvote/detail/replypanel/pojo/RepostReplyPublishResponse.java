package com.ss.android.ugc.aweme.upvote.detail.replypanel.pojo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostReplyPublishResponse extends BaseResponse {

    @C09CT("reply")
    public final RepostReplyStruct repostReply;

    public RepostReplyPublishResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RepostReplyPublishResponse) && Intrinsics.LJFF(this.repostReply, ((RepostReplyPublishResponse) obj).repostReply);
    }

    public final int hashCode() {
        RepostReplyStruct repostReplyStruct = this.repostReply;
        if (repostReplyStruct == null) {
            return 0;
        }
        return repostReplyStruct.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostReplyPublishResponse(repostReply=");
        sbLIZ.append(this.repostReply);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RepostReplyPublishResponse(RepostReplyStruct repostReplyStruct) {
        this.repostReply = repostReplyStruct;
    }
}
