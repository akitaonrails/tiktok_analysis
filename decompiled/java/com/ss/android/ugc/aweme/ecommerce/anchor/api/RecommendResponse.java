package com.ss.android.ugc.aweme.ecommerce.anchor.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendResponse<T> extends BaseResponse {

    @C09CT("data")
    public final T data;

    public RecommendResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendResponse) && Intrinsics.LJFF(this.data, ((RecommendResponse) obj).data);
    }

    public final int hashCode() {
        T t = this.data;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendResponse(T t) {
        this.data = t;
    }
}
