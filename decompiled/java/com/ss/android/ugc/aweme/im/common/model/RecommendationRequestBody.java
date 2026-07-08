package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendationRequestBody {

    @C09CT("uids")
    public final List<Long> uids;

    public RecommendationRequestBody() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendationRequestBody) && Intrinsics.LJFF(this.uids, ((RecommendationRequestBody) obj).uids);
    }

    public final int hashCode() {
        List<Long> list = this.uids;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendationRequestBody(uids=");
        sbLIZ.append(this.uids);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendationRequestBody(List<Long> list) {
        this.uids = list;
    }
}
