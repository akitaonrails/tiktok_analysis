package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupEntranceCheckResponse extends BaseResponse {

    @C09CT("access_criteria_collections")
    public final List<GroupAccessCriteriaCollection> accessCriteriaCollections;

    @C09CT("entrance_common")
    public final GroupEntranceCommon entranceCommon;

    @C09CT("entrance_list")
    public final List<GroupEntrance> entranceList;

    public GroupEntranceCheckResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupEntranceCheckResponse)) {
            return false;
        }
        GroupEntranceCheckResponse groupEntranceCheckResponse = (GroupEntranceCheckResponse) obj;
        return Intrinsics.LJFF(this.entranceList, groupEntranceCheckResponse.entranceList) && Intrinsics.LJFF(this.accessCriteriaCollections, groupEntranceCheckResponse.accessCriteriaCollections) && Intrinsics.LJFF(this.entranceCommon, groupEntranceCheckResponse.entranceCommon);
    }

    public final int hashCode() {
        List<GroupEntrance> list = this.entranceList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GroupAccessCriteriaCollection> list2 = this.accessCriteriaCollections;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        GroupEntranceCommon groupEntranceCommon = this.entranceCommon;
        return iHashCode2 + (groupEntranceCommon != null ? groupEntranceCommon.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupEntranceCheckResponse(entranceList=");
        sbLIZ.append(this.entranceList);
        sbLIZ.append(", accessCriteriaCollections=");
        sbLIZ.append(this.accessCriteriaCollections);
        sbLIZ.append(", entranceCommon=");
        sbLIZ.append(this.entranceCommon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupEntranceCheckResponse(List<GroupEntrance> list, List<GroupAccessCriteriaCollection> list2, GroupEntranceCommon groupEntranceCommon) {
        this.entranceList = list;
        this.accessCriteriaCollections = list2;
        this.entranceCommon = groupEntranceCommon;
    }
}
