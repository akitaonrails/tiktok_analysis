package com.ss.android.ugc.tiktok.addyours.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursDetailResp extends BaseResponse {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("pagination")
    public final AddYoursPagination pagination;

    @C09CT("topic_info")
    public final AddYoursTopic topicInfo;

    @C09CT("videos")
    public final List<Aweme> videos;

    public AddYoursDetailResp() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursDetailResp)) {
            return false;
        }
        AddYoursDetailResp addYoursDetailResp = (AddYoursDetailResp) obj;
        return Intrinsics.LJFF(this.videos, addYoursDetailResp.videos) && Intrinsics.LJFF(this.hasMore, addYoursDetailResp.hasMore) && Intrinsics.LJFF(this.pagination, addYoursDetailResp.pagination) && Intrinsics.LJFF(this.topicInfo, addYoursDetailResp.topicInfo);
    }

    public final int hashCode() {
        List<Aweme> list = this.videos;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AddYoursPagination addYoursPagination = this.pagination;
        int iHashCode3 = (iHashCode2 + (addYoursPagination == null ? 0 : addYoursPagination.hashCode())) * 31;
        AddYoursTopic addYoursTopic = this.topicInfo;
        return iHashCode3 + (addYoursTopic != null ? addYoursTopic.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursDetailResp(videos=");
        sbLIZ.append(this.videos);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", pagination=");
        sbLIZ.append(this.pagination);
        sbLIZ.append(", topicInfo=");
        sbLIZ.append(this.topicInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursDetailResp(List<? extends Aweme> list, Boolean bool, AddYoursPagination addYoursPagination, AddYoursTopic addYoursTopic) {
        this.videos = list;
        this.hasMore = bool;
        this.pagination = addYoursPagination;
        this.topicInfo = addYoursTopic;
    }
}
