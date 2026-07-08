package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AcShopCatalogDataDto {

    @C09CT("product")
    public final UniversalProductDto product;

    public AcShopCatalogDataDto() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AcShopCatalogDataDto) && Intrinsics.LJFF(this.product, ((AcShopCatalogDataDto) obj).product);
    }

    public final int hashCode() {
        UniversalProductDto universalProductDto = this.product;
        if (universalProductDto == null) {
            return 0;
        }
        return universalProductDto.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AcShopCatalogDataDto(product=");
        sbLIZ.append(this.product);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AcShopCatalogDataDto(UniversalProductDto universalProductDto) {
        this.product = universalProductDto;
    }
}
