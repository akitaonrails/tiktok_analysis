package com.ss.android.ugc.aweme.repostfeed.model;

import X.C09CT;
import X.C0X12;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RepostFeedResponse extends BaseResponse implements C0X12 {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("last_view_item_id")
    public String lastViewItemId;

    @C09CT("page_token")
    public String pageToken;

    @C09CT("feed_data")
    public List<RepostFeed> repostFeedData;
    public String requestId;

    @C09CT("source")
    public int source;

    public RepostFeedResponse() {
        this(0, "", false, null, "", "");
    }

    private final String component6() {
        return this.requestId;
    }

    public final RepostFeedResponse copy(int i, String str, boolean z, List<RepostFeed> list, String str2, String str3) {
        return new RepostFeedResponse(i, str, z, list, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostFeedResponse)) {
            return false;
        }
        RepostFeedResponse repostFeedResponse = (RepostFeedResponse) obj;
        return this.source == repostFeedResponse.source && Intrinsics.LJFF(this.pageToken, repostFeedResponse.pageToken) && this.hasMore == repostFeedResponse.hasMore && Intrinsics.LJFF(this.repostFeedData, repostFeedResponse.repostFeedData) && Intrinsics.LJFF(this.lastViewItemId, repostFeedResponse.lastViewItemId) && Intrinsics.LJFF(this.requestId, repostFeedResponse.requestId);
    }

    public int hashCode() {
        int i = this.source * 31;
        String str = this.pageToken;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        List<RepostFeed> list = this.repostFeedData;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.lastViewItemId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostFeedResponse(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", pageToken=");
        sbLIZ.append(this.pageToken);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", repostFeedData=");
        sbLIZ.append(this.repostFeedData);
        sbLIZ.append(", lastViewItemId=");
        sbLIZ.append(this.lastViewItemId);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0X12
    public String getRequestId() {
        String str = this.requestId;
        return str == null ? "" : str;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getLastViewItemId() {
        return this.lastViewItemId;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final List<RepostFeed> getRepostFeedData() {
        return this.repostFeedData;
    }

    public final int getSource() {
        return this.source;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLastViewItemId(String str) {
        this.lastViewItemId = str;
    }

    public final void setPageToken(String str) {
        this.pageToken = str;
    }

    public final void setRepostFeedData(List<RepostFeed> list) {
        this.repostFeedData = list;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public RepostFeedResponse(int i, String str, boolean z, List<RepostFeed> list, String str2, String str3) {
        this.source = i;
        this.pageToken = str;
        this.hasMore = z;
        this.repostFeedData = list;
        this.lastViewItemId = str2;
        this.requestId = str3;
    }
}
