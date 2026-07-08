package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class CollectionAllFavoritesResponse extends BaseResponse {

    @C09CT("item_archive_detail")
    public final CollectionDetail detail;

    public CollectionAllFavoritesResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionAllFavoritesResponse) && Intrinsics.LJFF(this.detail, ((CollectionAllFavoritesResponse) obj).detail);
    }

    public final int hashCode() {
        CollectionDetail collectionDetail = this.detail;
        if (collectionDetail == null) {
            return 0;
        }
        return collectionDetail.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionAllFavoritesResponse(detail=");
        sbLIZ.append(this.detail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CollectionAllFavoritesResponse(CollectionDetail collectionDetail) {
        this.detail = collectionDetail;
    }
}
