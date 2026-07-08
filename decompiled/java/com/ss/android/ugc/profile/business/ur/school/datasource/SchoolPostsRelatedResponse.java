package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SchoolPostsRelatedResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_infos")
    public final List<RelatedAwemeResponseInfo> infoList;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    public SchoolPostsRelatedResponse() {
        this(null, null);
    }

    public final SchoolPostsRelatedResponse copy(List<RelatedAwemeResponseInfo> list, LogPbBean logPbBean) {
        return new SchoolPostsRelatedResponse(list, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolPostsRelatedResponse)) {
            return false;
        }
        SchoolPostsRelatedResponse schoolPostsRelatedResponse = (SchoolPostsRelatedResponse) obj;
        return Intrinsics.LJFF(this.infoList, schoolPostsRelatedResponse.infoList) && Intrinsics.LJFF(this.logPb, schoolPostsRelatedResponse.logPb);
    }

    public int hashCode() {
        List<RelatedAwemeResponseInfo> list = this.infoList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolPostsRelatedResponse(infoList=");
        sbLIZ.append(this.infoList);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<RelatedAwemeResponseInfo> getInfoList() {
        return this.infoList;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public SchoolPostsRelatedResponse(List<RelatedAwemeResponseInfo> list, LogPbBean logPbBean) {
        this.infoList = list;
        this.logPb = logPbBean;
    }
}
