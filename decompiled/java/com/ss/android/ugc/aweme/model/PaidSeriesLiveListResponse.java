package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PaidSeriesLiveListResponse extends BaseResponse {

    @C09CT("creator_status")
    public final PaidContentCreatorStatus creatorStatus;

    @C09CT("introduce_id")
    public final Long introduceId;

    @C09CT("live_collection_list")
    public final List<CollectionDetailModel> paidCollectionDetail;

    public PaidSeriesLiveListResponse() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidSeriesLiveListResponse)) {
            return false;
        }
        PaidSeriesLiveListResponse paidSeriesLiveListResponse = (PaidSeriesLiveListResponse) obj;
        return this.creatorStatus == paidSeriesLiveListResponse.creatorStatus && Intrinsics.LJFF(this.paidCollectionDetail, paidSeriesLiveListResponse.paidCollectionDetail) && Intrinsics.LJFF(this.introduceId, paidSeriesLiveListResponse.introduceId);
    }

    public final int hashCode() {
        PaidContentCreatorStatus paidContentCreatorStatus = this.creatorStatus;
        int iHashCode = (((paidContentCreatorStatus == null ? 0 : paidContentCreatorStatus.hashCode()) * 31) + this.paidCollectionDetail.hashCode()) * 31;
        Long l = this.introduceId;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidSeriesLiveListResponse(creatorStatus=");
        sbLIZ.append(this.creatorStatus);
        sbLIZ.append(", paidCollectionDetail=");
        sbLIZ.append(this.paidCollectionDetail);
        sbLIZ.append(", introduceId=");
        sbLIZ.append(this.introduceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaidSeriesLiveListResponse(PaidContentCreatorStatus paidContentCreatorStatus, List<CollectionDetailModel> list, Long l) {
        this.creatorStatus = paidContentCreatorStatus;
        this.paidCollectionDetail = list;
        this.introduceId = l;
    }

    public PaidSeriesLiveListResponse(PaidContentCreatorStatus paidContentCreatorStatus, List list, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paidContentCreatorStatus, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : l);
    }
}
