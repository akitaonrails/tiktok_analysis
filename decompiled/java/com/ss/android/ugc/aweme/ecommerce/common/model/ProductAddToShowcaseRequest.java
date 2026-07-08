package com.ss.android.ugc.aweme.ecommerce.common.model;

import X.C09CT;
import X.C2188811AlT;
import X.C757470TnV;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class ProductAddToShowcaseRequest implements Serializable {
    public static final C757470TnV Companion = new Object() { // from class: X.0TnV
    };

    @C09CT("add_scene")
    public final Integer addScene;

    @C09CT("platform")
    public final Integer platform;

    @C09CT("product_ids")
    public final String productIds;

    @C09CT("source_from")
    public final Integer sourceFrom;

    public ProductAddToShowcaseRequest() {
        this(null, 2, 5, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductAddToShowcaseRequest)) {
            return false;
        }
        ProductAddToShowcaseRequest productAddToShowcaseRequest = (ProductAddToShowcaseRequest) obj;
        return Intrinsics.LJFF(this.productIds, productAddToShowcaseRequest.productIds) && Intrinsics.LJFF(this.sourceFrom, productAddToShowcaseRequest.sourceFrom) && Intrinsics.LJFF(this.platform, productAddToShowcaseRequest.platform) && Intrinsics.LJFF(this.addScene, productAddToShowcaseRequest.addScene);
    }

    public int hashCode() {
        String str = this.productIds;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.sourceFrom;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.platform;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.addScene;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductAddToShowcaseRequest(productIds=");
        sbLIZ.append(this.productIds);
        sbLIZ.append(", sourceFrom=");
        sbLIZ.append(this.sourceFrom);
        sbLIZ.append(", platform=");
        sbLIZ.append(this.platform);
        sbLIZ.append(", addScene=");
        sbLIZ.append(this.addScene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductAddToShowcaseRequest(String str, Integer num, Integer num2, Integer num3) {
        this.productIds = str;
        this.sourceFrom = num;
        this.platform = num2;
        this.addScene = num3;
    }
}
