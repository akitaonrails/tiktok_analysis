package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPGetProductsArgumentsDto {

    @C09CT("catalog")
    public final ACPGetProductsCatalogDto catalog;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ACPGetProductsArgumentsDto) && Intrinsics.LJFF(this.catalog, ((ACPGetProductsArgumentsDto) obj).catalog);
    }

    public final int hashCode() {
        ACPGetProductsCatalogDto aCPGetProductsCatalogDto = this.catalog;
        if (aCPGetProductsCatalogDto == null) {
            return 0;
        }
        return aCPGetProductsCatalogDto.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPGetProductsArgumentsDto(catalog=");
        sbLIZ.append(this.catalog);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ACPGetProductsArgumentsDto(ACPGetProductsCatalogDto aCPGetProductsCatalogDto) {
        this.catalog = aCPGetProductsCatalogDto;
    }
}
