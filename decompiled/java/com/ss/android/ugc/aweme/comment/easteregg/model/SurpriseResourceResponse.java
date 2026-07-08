package com.ss.android.ugc.aweme.comment.easteregg.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SurpriseResourceResponse extends BaseResponse {

    @C09CT("comment_surprises")
    public final List<CommentSurprise> commentSurprises;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SurpriseResourceResponse) && Intrinsics.LJFF(this.commentSurprises, ((SurpriseResourceResponse) obj).commentSurprises);
    }

    public final int hashCode() {
        return this.commentSurprises.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurpriseResourceResponse(commentSurprises=");
        sbLIZ.append(this.commentSurprises);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SurpriseResourceResponse() {
        this(new ArrayList());
    }

    public SurpriseResourceResponse(List<CommentSurprise> list) {
        this.commentSurprises = list;
    }
}
