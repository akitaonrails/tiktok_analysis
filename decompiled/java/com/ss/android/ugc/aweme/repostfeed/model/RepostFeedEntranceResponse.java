package com.ss.android.ugc.aweme.repostfeed.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RepostFeedEntranceResponse extends BaseResponse {

    @C09CT("new_content_count")
    public final int newContentCount;

    @C09CT("new_content_gids")
    public final List<String> newContentGids;

    @C09CT("new_content_metas")
    public final List<RepostNewContentMeta> newContentMetas;

    @C09CT("new_content_users")
    public final List<RepostNewContentUser> newContentUsers;

    @C09CT("tab_shown_status")
    public final boolean tabShownStatus;

    public RepostFeedEntranceResponse() {
        this(false, 0, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostFeedEntranceResponse)) {
            return false;
        }
        RepostFeedEntranceResponse repostFeedEntranceResponse = (RepostFeedEntranceResponse) obj;
        return this.tabShownStatus == repostFeedEntranceResponse.tabShownStatus && this.newContentCount == repostFeedEntranceResponse.newContentCount && Intrinsics.LJFF(this.newContentGids, repostFeedEntranceResponse.newContentGids) && Intrinsics.LJFF(this.newContentUsers, repostFeedEntranceResponse.newContentUsers) && Intrinsics.LJFF(this.newContentMetas, repostFeedEntranceResponse.newContentMetas);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.tabShownStatus) * 31) + this.newContentCount) * 31;
        List<String> list = this.newContentGids;
        int iHashCode = (iZ2 + (list == null ? 0 : list.hashCode())) * 31;
        List<RepostNewContentUser> list2 = this.newContentUsers;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<RepostNewContentMeta> list3 = this.newContentMetas;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostFeedEntranceResponse(tabShownStatus=");
        sbLIZ.append(this.tabShownStatus);
        sbLIZ.append(", newContentCount=");
        sbLIZ.append(this.newContentCount);
        sbLIZ.append(", newContentGids=");
        sbLIZ.append(this.newContentGids);
        sbLIZ.append(", newContentUsers=");
        sbLIZ.append(this.newContentUsers);
        sbLIZ.append(", newContentMetas=");
        sbLIZ.append(this.newContentMetas);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RepostFeedEntranceResponse(boolean z, int i, List<String> list, List<RepostNewContentUser> list2, List<RepostNewContentMeta> list3) {
        this.tabShownStatus = z;
        this.newContentCount = i;
        this.newContentGids = list;
        this.newContentUsers = list2;
        this.newContentMetas = list3;
    }
}
