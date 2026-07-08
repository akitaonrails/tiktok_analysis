package com.ss.android.ugc.aweme.upvote.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UpvoteDeleteResponse extends BaseResponse {

    @C09CT("delete_result")
    public final UpvoteDeleteResult deleteResult;

    public UpvoteDeleteResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpvoteDeleteResponse) && Intrinsics.LJFF(this.deleteResult, ((UpvoteDeleteResponse) obj).deleteResult);
    }

    public final int hashCode() {
        UpvoteDeleteResult upvoteDeleteResult = this.deleteResult;
        if (upvoteDeleteResult == null) {
            return 0;
        }
        return upvoteDeleteResult.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvoteDeleteResponse(deleteResult=");
        sbLIZ.append(this.deleteResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpvoteDeleteResponse(UpvoteDeleteResult upvoteDeleteResult) {
        this.deleteResult = upvoteDeleteResult;
    }
}
