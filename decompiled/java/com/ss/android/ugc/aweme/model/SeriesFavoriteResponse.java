package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeriesFavoriteResponse extends BaseResponse {

    @C09CT("is_added")
    public final Boolean isAdd;

    public SeriesFavoriteResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeriesFavoriteResponse) && Intrinsics.LJFF(this.isAdd, ((SeriesFavoriteResponse) obj).isAdd);
    }

    public final int hashCode() {
        Boolean bool = this.isAdd;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesFavoriteResponse(isAdd=");
        sbLIZ.append(this.isAdd);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesFavoriteResponse(Boolean bool) {
        this.isAdd = bool;
    }
}
