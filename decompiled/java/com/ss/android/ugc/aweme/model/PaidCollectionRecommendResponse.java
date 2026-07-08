package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PaidCollectionRecommendResponse extends BaseResponse implements Serializable {

    @C09CT("recommend_list")
    public final List<PaidCollectionOverView> recommendList;

    @C09CT("show_tab_entry")
    public final Boolean showViewAll;

    public PaidCollectionRecommendResponse() {
        this(null, null);
    }

    public final PaidCollectionRecommendResponse copy(Boolean bool, List<PaidCollectionOverView> list) {
        return new PaidCollectionRecommendResponse(bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidCollectionRecommendResponse)) {
            return false;
        }
        PaidCollectionRecommendResponse paidCollectionRecommendResponse = (PaidCollectionRecommendResponse) obj;
        return Intrinsics.LJFF(this.showViewAll, paidCollectionRecommendResponse.showViewAll) && Intrinsics.LJFF(this.recommendList, paidCollectionRecommendResponse.recommendList);
    }

    public int hashCode() {
        Boolean bool = this.showViewAll;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<PaidCollectionOverView> list = this.recommendList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidCollectionRecommendResponse(showViewAll=");
        sbLIZ.append(this.showViewAll);
        sbLIZ.append(", recommendList=");
        sbLIZ.append(this.recommendList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<PaidCollectionOverView> getRecommendList() {
        return this.recommendList;
    }

    public final Boolean getShowViewAll() {
        return this.showViewAll;
    }

    public PaidCollectionRecommendResponse(Boolean bool, List<PaidCollectionOverView> list) {
        this.showViewAll = bool;
        this.recommendList = list;
    }
}
