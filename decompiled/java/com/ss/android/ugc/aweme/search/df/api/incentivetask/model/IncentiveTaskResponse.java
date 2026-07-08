package com.ss.android.ugc.aweme.search.df.api.incentivetask.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IncentiveTaskResponse extends BaseResponse {

    @C09CT("banner_list")
    public final List<IncentiveBannerInfo> bannerList;

    @C09CT("task_detail")
    public final IncentiveDetailInfo taskDetail;

    @C09CT("task_page_prompt")
    public final IncentiveTaskPageInfo taskPageTitle;

    public IncentiveTaskResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveTaskResponse)) {
            return false;
        }
        IncentiveTaskResponse incentiveTaskResponse = (IncentiveTaskResponse) obj;
        return Intrinsics.LJFF(this.bannerList, incentiveTaskResponse.bannerList) && Intrinsics.LJFF(this.taskDetail, incentiveTaskResponse.taskDetail) && Intrinsics.LJFF(this.taskPageTitle, incentiveTaskResponse.taskPageTitle);
    }

    public final int hashCode() {
        List<IncentiveBannerInfo> list = this.bannerList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        IncentiveDetailInfo incentiveDetailInfo = this.taskDetail;
        int iHashCode2 = (iHashCode + (incentiveDetailInfo == null ? 0 : incentiveDetailInfo.hashCode())) * 31;
        IncentiveTaskPageInfo incentiveTaskPageInfo = this.taskPageTitle;
        return iHashCode2 + (incentiveTaskPageInfo != null ? incentiveTaskPageInfo.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveTaskResponse(bannerList=");
        sbLIZ.append(this.bannerList);
        sbLIZ.append(", taskDetail=");
        sbLIZ.append(this.taskDetail);
        sbLIZ.append(", taskPageTitle=");
        sbLIZ.append(this.taskPageTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentiveTaskResponse(List<IncentiveBannerInfo> list, IncentiveDetailInfo incentiveDetailInfo, IncentiveTaskPageInfo incentiveTaskPageInfo) {
        this.bannerList = list;
        this.taskDetail = incentiveDetailInfo;
        this.taskPageTitle = incentiveTaskPageInfo;
    }
}
