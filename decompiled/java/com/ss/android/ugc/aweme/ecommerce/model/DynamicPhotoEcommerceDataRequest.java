package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DynamicPhotoEcommerceDataRequest implements Serializable {

    @C09CT("anchor_type")
    public final int anchorType;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("image_count")
    public final int imageCount;

    @C09CT("image_product_map")
    public final Map<Integer, String> imgProductMap;

    @C09CT("product_id")
    public final String productId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPhotoEcommerceDataRequest)) {
            return false;
        }
        DynamicPhotoEcommerceDataRequest dynamicPhotoEcommerceDataRequest = (DynamicPhotoEcommerceDataRequest) obj;
        return Intrinsics.LJFF(this.awemeId, dynamicPhotoEcommerceDataRequest.awemeId) && Intrinsics.LJFF(this.imgProductMap, dynamicPhotoEcommerceDataRequest.imgProductMap) && Intrinsics.LJFF(this.productId, dynamicPhotoEcommerceDataRequest.productId) && this.imageCount == dynamicPhotoEcommerceDataRequest.imageCount && this.anchorType == dynamicPhotoEcommerceDataRequest.anchorType && Intrinsics.LJFF(this.extra, dynamicPhotoEcommerceDataRequest.extra);
    }

    public int hashCode() {
        int iHashCode = ((this.awemeId.hashCode() * 31) + this.imgProductMap.hashCode()) * 31;
        String str = this.productId;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.imageCount) * 31) + this.anchorType) * 31) + this.extra.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicPhotoEcommerceDataRequest(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", imgProductMap=");
        sbLIZ.append(this.imgProductMap);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", imageCount=");
        sbLIZ.append(this.imageCount);
        sbLIZ.append(", anchorType=");
        sbLIZ.append(this.anchorType);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DynamicPhotoEcommerceDataRequest(String str, Map<Integer, String> map, String str2, int i, int i2, Map<String, String> map2) {
        this.awemeId = str;
        this.imgProductMap = map;
        this.productId = str2;
        this.imageCount = i;
        this.anchorType = i2;
        this.extra = map2;
    }
}
