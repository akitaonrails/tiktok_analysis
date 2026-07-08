package com.ss.android.ugc.aweme.topic.movie.favorite.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IPLeaderboardCollectionStatusUpdateRequest {

    @C09CT("action")
    public final int action;

    @C09CT("collection_item_id")
    public final String collectionItemId;

    @C09CT("collection_item_type")
    public final int collectionItemType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IPLeaderboardCollectionStatusUpdateRequest)) {
            return false;
        }
        IPLeaderboardCollectionStatusUpdateRequest iPLeaderboardCollectionStatusUpdateRequest = (IPLeaderboardCollectionStatusUpdateRequest) obj;
        return Intrinsics.LJFF(this.collectionItemId, iPLeaderboardCollectionStatusUpdateRequest.collectionItemId) && this.collectionItemType == iPLeaderboardCollectionStatusUpdateRequest.collectionItemType && this.action == iPLeaderboardCollectionStatusUpdateRequest.action;
    }

    public final int hashCode() {
        return (((this.collectionItemId.hashCode() * 31) + this.collectionItemType) * 31) + this.action;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IPLeaderboardCollectionStatusUpdateRequest(collectionItemId=");
        sbLIZ.append(this.collectionItemId);
        sbLIZ.append(", collectionItemType=");
        sbLIZ.append(this.collectionItemType);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IPLeaderboardCollectionStatusUpdateRequest() {
        this("", 0, 0);
    }

    public IPLeaderboardCollectionStatusUpdateRequest(String str, int i, int i2) {
        this.collectionItemId = str;
        this.collectionItemType = i;
        this.action = i2;
    }
}
