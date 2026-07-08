package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AcShopCatalogRequestDto {

    @C09CT("context")
    public final Map<String, String> context;

    @C09CT("product_id")
    public final String productId;

    @C09CT("selected")
    public final List<VariantOptionDto> selected;

    @C09CT("shop_domain")
    public final String shopDomain;

    public AcShopCatalogRequestDto() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcShopCatalogRequestDto)) {
            return false;
        }
        AcShopCatalogRequestDto acShopCatalogRequestDto = (AcShopCatalogRequestDto) obj;
        return Intrinsics.LJFF(this.shopDomain, acShopCatalogRequestDto.shopDomain) && Intrinsics.LJFF(this.productId, acShopCatalogRequestDto.productId) && Intrinsics.LJFF(this.selected, acShopCatalogRequestDto.selected) && Intrinsics.LJFF(this.context, acShopCatalogRequestDto.context);
    }

    public final int hashCode() {
        String str = this.shopDomain;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<VariantOptionDto> list = this.selected;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.context;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AcShopCatalogRequestDto(shopDomain=");
        sbLIZ.append(this.shopDomain);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.selected);
        sbLIZ.append(", context=");
        sbLIZ.append(this.context);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AcShopCatalogRequestDto(String str, String str2, List<VariantOptionDto> list, Map<String, String> map) {
        this.shopDomain = str;
        this.productId = str2;
        this.selected = list;
        this.context = map;
    }
}
