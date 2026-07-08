package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPGetProductsCatalogDto {

    @C09CT("context")
    public final ACPGetProductsContextDto context;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("selected")
    public final List<VariantOptionDto> selected;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACPGetProductsCatalogDto)) {
            return false;
        }
        ACPGetProductsCatalogDto aCPGetProductsCatalogDto = (ACPGetProductsCatalogDto) obj;
        return Intrinsics.LJFF(this.id, aCPGetProductsCatalogDto.id) && Intrinsics.LJFF(this.context, aCPGetProductsCatalogDto.context) && Intrinsics.LJFF(this.selected, aCPGetProductsCatalogDto.selected);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ACPGetProductsContextDto aCPGetProductsContextDto = this.context;
        int iHashCode2 = (iHashCode + (aCPGetProductsContextDto == null ? 0 : aCPGetProductsContextDto.hashCode())) * 31;
        List<VariantOptionDto> list = this.selected;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPGetProductsCatalogDto(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", context=");
        sbLIZ.append(this.context);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.selected);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ACPGetProductsCatalogDto(String str, ACPGetProductsContextDto aCPGetProductsContextDto, List<VariantOptionDto> list) {
        this.id = str;
        this.context = aCPGetProductsContextDto;
        this.selected = list;
    }
}
