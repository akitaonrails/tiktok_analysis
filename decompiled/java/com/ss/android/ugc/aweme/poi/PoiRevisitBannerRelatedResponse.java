package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class PoiRevisitBannerRelatedResponse extends BaseResponse {

    @C09CT("cover_text")
    public final String coverText;

    @C09CT("images")
    public final List<String> imageUrlList;

    @C09CT("poi_id_list")
    public final List<String> poiIdList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRevisitBannerRelatedResponse)) {
            return false;
        }
        PoiRevisitBannerRelatedResponse poiRevisitBannerRelatedResponse = (PoiRevisitBannerRelatedResponse) obj;
        return Intrinsics.LJFF(this.poiIdList, poiRevisitBannerRelatedResponse.poiIdList) && Intrinsics.LJFF(this.imageUrlList, poiRevisitBannerRelatedResponse.imageUrlList) && Intrinsics.LJFF(this.coverText, poiRevisitBannerRelatedResponse.coverText);
    }

    public final int hashCode() {
        List<String> list = this.poiIdList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.imageUrlList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.coverText;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRevisitBannerRelatedResponse(poiIdList=");
        sbLIZ.append(this.poiIdList);
        sbLIZ.append(", imageUrlList=");
        sbLIZ.append(this.imageUrlList);
        sbLIZ.append(", coverText=");
        sbLIZ.append(this.coverText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiRevisitBannerRelatedResponse(List<String> list, List<String> list2, String str) {
        this.poiIdList = list;
        this.imageUrlList = list2;
        this.coverText = str;
    }
}
