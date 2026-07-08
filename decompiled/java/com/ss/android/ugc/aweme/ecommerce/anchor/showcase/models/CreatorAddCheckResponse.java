package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreatorAddCheckResponse extends BaseResponse {

    @C09CT("is_automatic_shop_showcase_valid")
    public final Boolean isAutomaticShopShowcaseValid;

    @C09CT("shop_product_info")
    public final ShopProductInfo shopProductInfo;

    public CreatorAddCheckResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorAddCheckResponse)) {
            return false;
        }
        CreatorAddCheckResponse creatorAddCheckResponse = (CreatorAddCheckResponse) obj;
        return Intrinsics.LJFF(this.isAutomaticShopShowcaseValid, creatorAddCheckResponse.isAutomaticShopShowcaseValid) && Intrinsics.LJFF(this.shopProductInfo, creatorAddCheckResponse.shopProductInfo);
    }

    public final int hashCode() {
        Boolean bool = this.isAutomaticShopShowcaseValid;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ShopProductInfo shopProductInfo = this.shopProductInfo;
        return iHashCode + (shopProductInfo != null ? shopProductInfo.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorAddCheckResponse(isAutomaticShopShowcaseValid=");
        sbLIZ.append(this.isAutomaticShopShowcaseValid);
        sbLIZ.append(", shopProductInfo=");
        sbLIZ.append(this.shopProductInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreatorAddCheckResponse(Boolean bool, ShopProductInfo shopProductInfo) {
        this.isAutomaticShopShowcaseValid = bool;
        this.shopProductInfo = shopProductInfo;
    }
}
