package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PaidCollectionListResponse extends BaseResponse {

    @C09CT("collection_list")
    public final List<CollectionDetailModel> collectionList;

    @C09CT("num_published_collections")
    public final int collectionNumber;

    @C09CT("cursor")
    public final int cursor;

    @C09CT("dashboard_url")
    public final String dashboardUrl;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("live_added_collections")
    public final List<Long> liveAddedCollectionIds;

    @C09CT("has_individual_video_prices")
    public final boolean optedAndUsesSingleVideoPurchase;

    @C09CT("should_show_bottom_sheet")
    public final boolean shouldShowPromoteSheet;

    @C09CT("should_show_promote_tooltip")
    public final boolean shouldShowPromoteTooltip;

    @C09CT("should_show_sales_permission_request")
    public final boolean shouldShowSalesPermissionRequest;

    public PaidCollectionListResponse() {
        this(0, 0, false, false, false, false, null, null, null, false, 1023, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidCollectionListResponse)) {
            return false;
        }
        PaidCollectionListResponse paidCollectionListResponse = (PaidCollectionListResponse) obj;
        return this.collectionNumber == paidCollectionListResponse.collectionNumber && this.cursor == paidCollectionListResponse.cursor && this.hasMore == paidCollectionListResponse.hasMore && this.shouldShowPromoteTooltip == paidCollectionListResponse.shouldShowPromoteTooltip && this.optedAndUsesSingleVideoPurchase == paidCollectionListResponse.optedAndUsesSingleVideoPurchase && this.shouldShowPromoteSheet == paidCollectionListResponse.shouldShowPromoteSheet && Intrinsics.LJFF(this.collectionList, paidCollectionListResponse.collectionList) && Intrinsics.LJFF(this.liveAddedCollectionIds, paidCollectionListResponse.liveAddedCollectionIds) && Intrinsics.LJFF(this.dashboardUrl, paidCollectionListResponse.dashboardUrl) && this.shouldShowSalesPermissionRequest == paidCollectionListResponse.shouldShowSalesPermissionRequest;
    }

    public final int hashCode() {
        int iZ2 = ((((((((((this.collectionNumber * 31) + this.cursor) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Z2(this.shouldShowPromoteTooltip)) * 31) + C786410Ut5.Z2(this.optedAndUsesSingleVideoPurchase)) * 31) + C786410Ut5.Z2(this.shouldShowPromoteSheet)) * 31;
        List<CollectionDetailModel> list = this.collectionList;
        int iHashCode = (((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + this.liveAddedCollectionIds.hashCode()) * 31;
        String str = this.dashboardUrl;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.shouldShowSalesPermissionRequest);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidCollectionListResponse(collectionNumber=");
        sbLIZ.append(this.collectionNumber);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", shouldShowPromoteTooltip=");
        sbLIZ.append(this.shouldShowPromoteTooltip);
        sbLIZ.append(", optedAndUsesSingleVideoPurchase=");
        sbLIZ.append(this.optedAndUsesSingleVideoPurchase);
        sbLIZ.append(", shouldShowPromoteSheet=");
        sbLIZ.append(this.shouldShowPromoteSheet);
        sbLIZ.append(", collectionList=");
        sbLIZ.append(this.collectionList);
        sbLIZ.append(", liveAddedCollectionIds=");
        sbLIZ.append(this.liveAddedCollectionIds);
        sbLIZ.append(", dashboardUrl=");
        sbLIZ.append(this.dashboardUrl);
        sbLIZ.append(", shouldShowSalesPermissionRequest=");
        sbLIZ.append(this.shouldShowSalesPermissionRequest);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaidCollectionListResponse(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, List<CollectionDetailModel> list, List<Long> list2, String str, boolean z5) {
        this.collectionNumber = i;
        this.cursor = i2;
        this.hasMore = z;
        this.shouldShowPromoteTooltip = z2;
        this.optedAndUsesSingleVideoPurchase = z3;
        this.shouldShowPromoteSheet = z4;
        this.collectionList = list;
        this.liveAddedCollectionIds = list2;
        this.dashboardUrl = str;
        this.shouldShowSalesPermissionRequest = z5;
    }

    public PaidCollectionListResponse(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, List list, List list2, String str, boolean z5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? false : z4, (i3 & 64) != 0 ? null : list, (i3 & 128) != 0 ? C13BV.INSTANCE : list2, (i3 & 256) == 0 ? str : null, (i3 & 512) == 0 ? z5 : false);
    }
}
