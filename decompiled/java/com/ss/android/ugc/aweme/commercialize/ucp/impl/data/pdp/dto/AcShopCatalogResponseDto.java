package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AcShopCatalogResponseDto extends BaseResponse {

    @C09CT("data")
    public final AcShopCatalogDataDto data;

    public AcShopCatalogResponseDto() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AcShopCatalogResponseDto) && Intrinsics.LJFF(this.data, ((AcShopCatalogResponseDto) obj).data);
    }

    public final int hashCode() {
        AcShopCatalogDataDto acShopCatalogDataDto = this.data;
        if (acShopCatalogDataDto == null) {
            return 0;
        }
        return acShopCatalogDataDto.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AcShopCatalogResponseDto(data=");
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

    public AcShopCatalogResponseDto(AcShopCatalogDataDto acShopCatalogDataDto) {
        super(null, null);
        this.data = acShopCatalogDataDto;
    }
}
