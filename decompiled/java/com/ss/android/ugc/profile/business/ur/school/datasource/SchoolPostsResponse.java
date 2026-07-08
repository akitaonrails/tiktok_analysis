package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SchoolPostsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("awemes")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    public SchoolPostsResponse() {
        this(null, null, null);
    }

    public final SchoolPostsResponse copy(List<Aweme> list, Integer num, LogPbBean logPbBean) {
        return new SchoolPostsResponse(list, num, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolPostsResponse)) {
            return false;
        }
        SchoolPostsResponse schoolPostsResponse = (SchoolPostsResponse) obj;
        return Intrinsics.LJFF(this.awemeList, schoolPostsResponse.awemeList) && Intrinsics.LJFF(this.hasMore, schoolPostsResponse.hasMore) && Intrinsics.LJFF(this.logPb, schoolPostsResponse.logPb);
    }

    public int hashCode() {
        List<Aweme> list = this.awemeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.hasMore;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolPostsResponse(awemeList=");
        sbLIZ.append(this.awemeList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Integer getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public SchoolPostsResponse(List<Aweme> list, Integer num, LogPbBean logPbBean) {
        this.awemeList = list;
        this.hasMore = num;
        this.logPb = logPbBean;
    }
}
