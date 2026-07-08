package com.ss.android.ugc.aweme.subscription.pgc.data.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DataResponse<T> extends BaseResponse {

    @C09CT("data")
    public final T data;

    public DataResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataResponse) && Intrinsics.LJFF(this.data, ((DataResponse) obj).data);
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
        sbLIZ.append("DataResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getLogId() {
        String str;
        BaseResponse.ServerTimeExtra serverTimeExtra = this.extra;
        return (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) ? "" : str;
    }

    public DataResponse(T t) {
        this.data = t;
    }
}
