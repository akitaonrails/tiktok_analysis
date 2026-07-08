package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPGetProductsRequestDto {

    @C09CT("arguments")
    public final ACPGetProductsArgumentsDto arguments;

    @C09CT("name")
    public final String name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACPGetProductsRequestDto)) {
            return false;
        }
        ACPGetProductsRequestDto aCPGetProductsRequestDto = (ACPGetProductsRequestDto) obj;
        return Intrinsics.LJFF(this.name, aCPGetProductsRequestDto.name) && Intrinsics.LJFF(this.arguments, aCPGetProductsRequestDto.arguments);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ACPGetProductsArgumentsDto aCPGetProductsArgumentsDto = this.arguments;
        return iHashCode + (aCPGetProductsArgumentsDto != null ? aCPGetProductsArgumentsDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPGetProductsRequestDto(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ACPGetProductsRequestDto(String str, ACPGetProductsArgumentsDto aCPGetProductsArgumentsDto) {
        this.name = str;
        this.arguments = aCPGetProductsArgumentsDto;
    }
}
