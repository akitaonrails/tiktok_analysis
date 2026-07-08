package com.ss.android.ugc.aweme.search.entry.searchbubble.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBubbleInfoResponse extends BaseResponse {

    @C09CT("bubble")
    public SearchBubble bubble;

    @C09CT("log_pb")
    public final LogPbBean logPbBean;

    @C09CT("new_gid")
    public final String newGid;

    public SearchBubbleInfoResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBubbleInfoResponse)) {
            return false;
        }
        SearchBubbleInfoResponse searchBubbleInfoResponse = (SearchBubbleInfoResponse) obj;
        return Intrinsics.LJFF(this.bubble, searchBubbleInfoResponse.bubble) && Intrinsics.LJFF(this.newGid, searchBubbleInfoResponse.newGid) && Intrinsics.LJFF(this.logPbBean, searchBubbleInfoResponse.logPbBean);
    }

    public final int hashCode() {
        SearchBubble searchBubble = this.bubble;
        int iHashCode = (searchBubble == null ? 0 : searchBubble.hashCode()) * 31;
        String str = this.newGid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LogPbBean logPbBean = this.logPbBean;
        return iHashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchBubbleInfoResponse(bubble=");
        sbLIZ.append(this.bubble);
        sbLIZ.append(", newGid=");
        sbLIZ.append(this.newGid);
        sbLIZ.append(", logPbBean=");
        sbLIZ.append(this.logPbBean);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchBubbleInfoResponse(SearchBubble searchBubble, String str, LogPbBean logPbBean) {
        this.bubble = searchBubble;
        this.newGid = str;
        this.logPbBean = logPbBean;
    }
}
