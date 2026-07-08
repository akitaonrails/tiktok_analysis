package com.ss.android.ugc.aweme.trace;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TraceLogUploadResponse extends BaseResponse {

    @C09CT("results")
    public final List<Object> results;

    public TraceLogUploadResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraceLogUploadResponse) && Intrinsics.LJFF(this.results, ((TraceLogUploadResponse) obj).results);
    }

    public final int hashCode() {
        List<Object> list = this.results;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TraceLogUploadResponse(results=");
        sbLIZ.append(this.results);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TraceLogUploadResponse(List<Object> list) {
        this.results = list;
    }
}
