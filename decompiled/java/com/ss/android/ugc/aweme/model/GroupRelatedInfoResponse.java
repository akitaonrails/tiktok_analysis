package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class GroupRelatedInfoResponse extends BaseResponse implements Serializable {

    @C09CT("user_all_story_metadata")
    public final List<UserAllStoryMetadata> allStoryMetadataList;

    @C09CT("user_filter_story_info")
    public final List<UserFilterStoryInfo> filterStoryInfoList;

    @C09CT("multi_group_users")
    public final List<GroupStoryStatus> groupStatusList;

    @C09CT("users_story_status")
    public final List<SocPubStatus> statusList;

    public GroupRelatedInfoResponse() {
        this(null, null, null, null, 15, null);
    }

    public final GroupRelatedInfoResponse copy(List<GroupStoryStatus> list, List<SocPubStatus> list2, List<UserAllStoryMetadata> list3, List<UserFilterStoryInfo> list4) {
        return new GroupRelatedInfoResponse(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupRelatedInfoResponse)) {
            return false;
        }
        GroupRelatedInfoResponse groupRelatedInfoResponse = (GroupRelatedInfoResponse) obj;
        return Intrinsics.LJFF(this.groupStatusList, groupRelatedInfoResponse.groupStatusList) && Intrinsics.LJFF(this.statusList, groupRelatedInfoResponse.statusList) && Intrinsics.LJFF(this.allStoryMetadataList, groupRelatedInfoResponse.allStoryMetadataList) && Intrinsics.LJFF(this.filterStoryInfoList, groupRelatedInfoResponse.filterStoryInfoList);
    }

    public int hashCode() {
        return (((((this.groupStatusList.hashCode() * 31) + this.statusList.hashCode()) * 31) + this.allStoryMetadataList.hashCode()) * 31) + this.filterStoryInfoList.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupRelatedInfoResponse(groupStatusList=");
        sbLIZ.append(this.groupStatusList);
        sbLIZ.append(", statusList=");
        sbLIZ.append(this.statusList);
        sbLIZ.append(", allStoryMetadataList=");
        sbLIZ.append(this.allStoryMetadataList);
        sbLIZ.append(", filterStoryInfoList=");
        sbLIZ.append(this.filterStoryInfoList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<UserAllStoryMetadata> getAllStoryMetadataList() {
        return this.allStoryMetadataList;
    }

    public final List<UserFilterStoryInfo> getFilterStoryInfoList() {
        return this.filterStoryInfoList;
    }

    public final List<GroupStoryStatus> getGroupStatusList() {
        return this.groupStatusList;
    }

    public final List<SocPubStatus> getStatusList() {
        return this.statusList;
    }

    public GroupRelatedInfoResponse(List<GroupStoryStatus> list, List<SocPubStatus> list2, List<UserAllStoryMetadata> list3, List<UserFilterStoryInfo> list4) {
        this.groupStatusList = list;
        this.statusList = list2;
        this.allStoryMetadataList = list3;
        this.filterStoryInfoList = list4;
    }

    public GroupRelatedInfoResponse(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4);
    }
}
