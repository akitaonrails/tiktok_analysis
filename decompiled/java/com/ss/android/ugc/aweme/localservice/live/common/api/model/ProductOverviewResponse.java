package com.ss.android.ugc.aweme.localservice.live.common.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ProductOverviewResponse extends BaseResponse {

    @C09CT("data")
    public final ProductOverviewData data;

    public ProductOverviewResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductOverviewResponse) && Intrinsics.LJFF(this.data, ((ProductOverviewResponse) obj).data);
    }

    public final int hashCode() {
        ProductOverviewData productOverviewData = this.data;
        if (productOverviewData == null) {
            return 0;
        }
        return productOverviewData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductOverviewResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductOverviewResponse(ProductOverviewData productOverviewData) {
        this.data = productOverviewData;
    }
}
