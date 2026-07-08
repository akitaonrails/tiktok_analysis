package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionManageResponse extends BaseResponse {

    @C09CT("collaborative_archive_info")
    public final CollaborativeArchiveInfo collaborativeInfo;

    @C09CT("item_archive_id")
    public final String collectionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionManageResponse)) {
            return false;
        }
        CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj;
        return Intrinsics.LJFF(this.collectionId, collectionManageResponse.collectionId) && Intrinsics.LJFF(this.collaborativeInfo, collectionManageResponse.collaborativeInfo);
    }

    public final int hashCode() {
        String str = this.collectionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CollaborativeArchiveInfo collaborativeArchiveInfo = this.collaborativeInfo;
        return iHashCode + (collaborativeArchiveInfo != null ? collaborativeArchiveInfo.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionManageResponse(collectionId=");
        sbLIZ.append(this.collectionId);
        sbLIZ.append(", collaborativeInfo=");
        sbLIZ.append(this.collaborativeInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CollectionManageResponse(String str, CollaborativeArchiveInfo collaborativeArchiveInfo) {
        this.collectionId = str;
        this.collaborativeInfo = collaborativeArchiveInfo;
    }
}
