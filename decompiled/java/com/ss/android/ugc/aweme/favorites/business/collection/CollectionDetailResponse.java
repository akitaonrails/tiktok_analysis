package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class CollectionDetailResponse extends BaseResponse {

    @C09CT("item_archive")
    public final CollectionDetail collectionDetail;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionDetailResponse) && Intrinsics.LJFF(this.collectionDetail, ((CollectionDetailResponse) obj).collectionDetail);
    }

    public final int hashCode() {
        CollectionDetail collectionDetail = this.collectionDetail;
        if (collectionDetail == null) {
            return 0;
        }
        return collectionDetail.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionDetailResponse(collectionDetail=");
        sbLIZ.append(this.collectionDetail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CollectionDetailResponse(CollectionDetail collectionDetail) {
        this.collectionDetail = collectionDetail;
    }
}
