package com.ss.android.ugc.aweme.fangroup.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FanGroupListResponse extends BaseResponse {

    @C09CT("creator_fan_group_meta")
    public final CreatorFanGroupMeta creatorFanGroupMeta;

    @C09CT("group_list")
    public final List<GroupInfo> groupList;

    public FanGroupListResponse() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FanGroupListResponse)) {
            return false;
        }
        FanGroupListResponse fanGroupListResponse = (FanGroupListResponse) obj;
        return Intrinsics.LJFF(this.groupList, fanGroupListResponse.groupList) && Intrinsics.LJFF(this.creatorFanGroupMeta, fanGroupListResponse.creatorFanGroupMeta);
    }

    public final int hashCode() {
        return (this.groupList.hashCode() * 31) + this.creatorFanGroupMeta.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanGroupListResponse(groupList=");
        sbLIZ.append(this.groupList);
        sbLIZ.append(", creatorFanGroupMeta=");
        sbLIZ.append(this.creatorFanGroupMeta);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FanGroupListResponse(List<GroupInfo> list, CreatorFanGroupMeta creatorFanGroupMeta) {
        this.groupList = list;
        this.creatorFanGroupMeta = creatorFanGroupMeta;
    }

    public FanGroupListResponse(List list, CreatorFanGroupMeta creatorFanGroupMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? new CreatorFanGroupMeta(0L, "", Boolean.FALSE) : creatorFanGroupMeta);
    }
}
