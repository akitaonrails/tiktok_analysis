package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionNameCheckResponse extends BaseResponse {

    @C09CT("is_valid")
    public final Boolean isValid;

    public CollectionNameCheckResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionNameCheckResponse) && Intrinsics.LJFF(this.isValid, ((CollectionNameCheckResponse) obj).isValid);
    }

    public final int hashCode() {
        Boolean bool = this.isValid;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionNameCheckResponse(isValid=");
        sbLIZ.append(this.isValid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CollectionNameCheckResponse(Boolean bool) {
        this.isValid = bool;
    }
}
