package com.ss.android.ugc.aweme.im.push.api.alerttone.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMAudioResourceResponse extends BaseResponse {

    @C09CT("results")
    public final List<IMAudioResourceResponseEntry> results;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMAudioResourceResponse) && Intrinsics.LJFF(this.results, ((IMAudioResourceResponse) obj).results);
    }

    public final int hashCode() {
        return this.results.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAudioResourceResponse(results=");
        sbLIZ.append(this.results);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMAudioResourceResponse() {
        this(new ArrayList());
    }

    public IMAudioResourceResponse(List<IMAudioResourceResponseEntry> list) {
        this.results = list;
    }
}
