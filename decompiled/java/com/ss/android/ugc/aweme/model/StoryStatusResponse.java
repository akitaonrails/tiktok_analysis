package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryStatusResponse extends BaseResponse {

    @C09CT("user_all_story_metadata")
    public final List<UserAllStoryMetadata> allStoryMetadata;

    @C09CT("user_filter_story_info")
    public final List<UserFilterStoryInfo> filterStoryInfo;

    @C09CT("users_story_status")
    public final List<SocPubStatus> statusList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryStatusResponse)) {
            return false;
        }
        StoryStatusResponse storyStatusResponse = (StoryStatusResponse) obj;
        return Intrinsics.LJFF(this.statusList, storyStatusResponse.statusList) && Intrinsics.LJFF(this.allStoryMetadata, storyStatusResponse.allStoryMetadata) && Intrinsics.LJFF(this.filterStoryInfo, storyStatusResponse.filterStoryInfo);
    }

    public final int hashCode() {
        List<SocPubStatus> list = this.statusList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UserAllStoryMetadata> list2 = this.allStoryMetadata;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UserFilterStoryInfo> list3 = this.filterStoryInfo;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryStatusResponse(statusList=");
        sbLIZ.append(this.statusList);
        sbLIZ.append(", allStoryMetadata=");
        sbLIZ.append(this.allStoryMetadata);
        sbLIZ.append(", filterStoryInfo=");
        sbLIZ.append(this.filterStoryInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryStatusResponse(List<SocPubStatus> list, List<UserAllStoryMetadata> list2, List<UserFilterStoryInfo> list3) {
        this.statusList = list;
        this.allStoryMetadata = list2;
        this.filterStoryInfo = list3;
    }
}
