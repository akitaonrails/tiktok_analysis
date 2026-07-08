package com.ss.android.ugc.aweme.ecommerce.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ProductAddToShowcaseResponse extends BaseResponse {

    @C09CT("product_add_status")
    public final List<ProductAddStatus> productAddStatus;

    public ProductAddToShowcaseResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductAddToShowcaseResponse) && Intrinsics.LJFF(this.productAddStatus, ((ProductAddToShowcaseResponse) obj).productAddStatus);
    }

    public final int hashCode() {
        List<ProductAddStatus> list = this.productAddStatus;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductAddToShowcaseResponse(productAddStatus=");
        sbLIZ.append(this.productAddStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductAddToShowcaseResponse(List<ProductAddStatus> list) {
        this.productAddStatus = list;
    }
}
