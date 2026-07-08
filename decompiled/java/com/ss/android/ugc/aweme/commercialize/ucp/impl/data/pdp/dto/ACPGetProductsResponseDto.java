package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ACPGetProductsResponseDto extends BaseResponse {

    @C09CT("data")
    public final n data;

    public ACPGetProductsResponseDto() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ACPGetProductsResponseDto) && Intrinsics.LJFF(this.data, ((ACPGetProductsResponseDto) obj).data);
    }

    public final int hashCode() {
        n nVar = this.data;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPGetProductsResponseDto(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse
    public final boolean isSuccess() {
        if (getStatusCode() == null) {
            return true;
        }
        Integer statusCode = getStatusCode();
        return statusCode != null && statusCode.intValue() == 0;
    }

    public ACPGetProductsResponseDto(n nVar) {
        super(null, null);
        this.data = nVar;
    }
}
