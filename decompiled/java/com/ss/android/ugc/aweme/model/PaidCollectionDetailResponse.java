package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PaidCollectionDetailResponse extends BaseResponse {

    @C09CT("collection")
    public final CollectionDetailModel collectionDetail;

    public PaidCollectionDetailResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaidCollectionDetailResponse) && Intrinsics.LJFF(this.collectionDetail, ((PaidCollectionDetailResponse) obj).collectionDetail);
    }

    public final int hashCode() {
        CollectionDetailModel collectionDetailModel = this.collectionDetail;
        if (collectionDetailModel == null) {
            return 0;
        }
        return collectionDetailModel.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidCollectionDetailResponse(collectionDetail=");
        sbLIZ.append(this.collectionDetail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaidCollectionDetailResponse(CollectionDetailModel collectionDetailModel) {
        this.collectionDetail = collectionDetailModel;
    }
}
