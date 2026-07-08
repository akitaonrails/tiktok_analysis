package com.ss.android.ugc.aweme.comment.commentlist.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CommentBatchDeleteResponse extends BaseResponse {

    @C09CT("failed_cids")
    public final String failedCids;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommentBatchDeleteResponse) && Intrinsics.LJFF(this.failedCids, ((CommentBatchDeleteResponse) obj).failedCids);
    }

    public final int hashCode() {
        String str = this.failedCids;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentBatchDeleteResponse(failedCids=");
        sbLIZ.append(this.failedCids);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommentBatchDeleteResponse() {
        this("");
    }

    public CommentBatchDeleteResponse(String str) {
        this.failedCids = str;
    }
}
