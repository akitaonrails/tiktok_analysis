package com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LandingPageDataResponse extends BaseResponse {

    @C09CT("aggregation_pros_cons_card_detail")
    public final AggregationProsConsCardLandingPageModel aggregationProsConsCardDetail;

    @C09CT("cursor")
    public final int cursor;

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("items")
    public final List<Aweme> items;

    public LandingPageDataResponse() {
        this(0, 0, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingPageDataResponse)) {
            return false;
        }
        LandingPageDataResponse landingPageDataResponse = (LandingPageDataResponse) obj;
        return this.cursor == landingPageDataResponse.cursor && this.hasMore == landingPageDataResponse.hasMore && Intrinsics.LJFF(this.items, landingPageDataResponse.items) && Intrinsics.LJFF(this.aggregationProsConsCardDetail, landingPageDataResponse.aggregationProsConsCardDetail);
    }

    public final int hashCode() {
        int i = ((this.cursor * 31) + this.hasMore) * 31;
        List<Aweme> list = this.items;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        AggregationProsConsCardLandingPageModel aggregationProsConsCardLandingPageModel = this.aggregationProsConsCardDetail;
        return iHashCode + (aggregationProsConsCardLandingPageModel != null ? aggregationProsConsCardLandingPageModel.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandingPageDataResponse(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", aggregationProsConsCardDetail=");
        sbLIZ.append(this.aggregationProsConsCardDetail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingPageDataResponse(int i, int i2, List<? extends Aweme> list, AggregationProsConsCardLandingPageModel aggregationProsConsCardLandingPageModel) {
        this.cursor = i;
        this.hasMore = i2;
        this.items = list;
        this.aggregationProsConsCardDetail = aggregationProsConsCardLandingPageModel;
    }
}
