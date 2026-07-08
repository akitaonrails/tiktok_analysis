package com.ss.android.ugc.aweme.relation.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MaFUserVideoListResponse extends BaseResponse implements Serializable {

    @C09CT("items")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("next_page_token")
    public final String nextPageToken;

    public MaFUserVideoListResponse() {
        this(null, null, false, null, 15, null);
    }

    public final MaFUserVideoListResponse copy(String str, List<? extends Aweme> list, boolean z, LogPbBean logPbBean) {
        return new MaFUserVideoListResponse(str, list, z, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaFUserVideoListResponse)) {
            return false;
        }
        MaFUserVideoListResponse maFUserVideoListResponse = (MaFUserVideoListResponse) obj;
        return Intrinsics.LJFF(this.nextPageToken, maFUserVideoListResponse.nextPageToken) && Intrinsics.LJFF(this.awemeList, maFUserVideoListResponse.awemeList) && this.hasMore == maFUserVideoListResponse.hasMore && Intrinsics.LJFF(this.logPb, maFUserVideoListResponse.logPb);
    }

    public int hashCode() {
        int iHashCode = ((((this.nextPageToken.hashCode() * 31) + this.awemeList.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaFUserVideoListResponse(nextPageToken=");
        sbLIZ.append(this.nextPageToken);
        sbLIZ.append(", awemeList=");
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

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaFUserVideoListResponse(String str, List<? extends Aweme> list, boolean z, LogPbBean logPbBean) {
        this.nextPageToken = str;
        this.awemeList = list;
        this.hasMore = z;
        this.logPb = logPbBean;
    }

    public MaFUserVideoListResponse(String str, List list, boolean z, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : logPbBean);
    }
}
