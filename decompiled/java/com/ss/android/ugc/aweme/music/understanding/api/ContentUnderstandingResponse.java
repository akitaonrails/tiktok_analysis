package com.ss.android.ugc.aweme.music.understanding.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentUnderstandingResponse extends BaseResponse {

    @C09CT("extra_params")
    public final String extraParams;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("logid")
    public final String logid;

    @C09CT("recommend_info")
    public final RecommendInfo recommendInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    public ContentUnderstandingResponse() {
        this(null, null, null, null, null);
    }

    public final ContentUnderstandingResponse copy(RecommendInfo recommendInfo, String str, String str2, Integer num, LogPbBean logPbBean) {
        return new ContentUnderstandingResponse(recommendInfo, str, str2, num, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentUnderstandingResponse)) {
            return false;
        }
        ContentUnderstandingResponse contentUnderstandingResponse = (ContentUnderstandingResponse) obj;
        return Intrinsics.LJFF(this.recommendInfo, contentUnderstandingResponse.recommendInfo) && Intrinsics.LJFF(this.extraParams, contentUnderstandingResponse.extraParams) && Intrinsics.LJFF(this.logid, contentUnderstandingResponse.logid) && Intrinsics.LJFF(this.status, contentUnderstandingResponse.status) && Intrinsics.LJFF(this.logPb, contentUnderstandingResponse.logPb);
    }

    public int hashCode() {
        RecommendInfo recommendInfo = this.recommendInfo;
        int iHashCode = (recommendInfo == null ? 0 : recommendInfo.hashCode()) * 31;
        String str = this.extraParams;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logid;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode4 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentUnderstandingResponse(recommendInfo=");
        sbLIZ.append(this.recommendInfo);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.extraParams);
        sbLIZ.append(", logid=");
        sbLIZ.append(this.logid);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getExtraParams() {
        return this.extraParams;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getLogid() {
        return this.logid;
    }

    public final RecommendInfo getRecommendInfo() {
        return this.recommendInfo;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public ContentUnderstandingResponse(RecommendInfo recommendInfo, String str, String str2, Integer num, LogPbBean logPbBean) {
        this.recommendInfo = recommendInfo;
        this.extraParams = str;
        this.logid = str2;
        this.status = num;
        this.logPb = logPbBean;
    }
}
