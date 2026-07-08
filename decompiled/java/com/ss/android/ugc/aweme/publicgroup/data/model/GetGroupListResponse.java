package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.UserDisplayMeta;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class GetGroupListResponse extends BaseResponse {

    @C09CT("user_display_meta")
    public final UserDisplayMeta displayMeta;

    @C09CT("group_meta_list")
    public final List<GroupPreviewDisplayMeta> groupList;

    @C09CT("hidden_group_list")
    public final List<GroupPreviewDisplayMeta> hiddenGroupList;

    public GetGroupListResponse() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGroupListResponse)) {
            return false;
        }
        GetGroupListResponse getGroupListResponse = (GetGroupListResponse) obj;
        return Intrinsics.LJFF(this.groupList, getGroupListResponse.groupList) && Intrinsics.LJFF(this.displayMeta, getGroupListResponse.displayMeta) && Intrinsics.LJFF(this.hiddenGroupList, getGroupListResponse.hiddenGroupList);
    }

    public final int hashCode() {
        int iHashCode = this.groupList.hashCode() * 31;
        UserDisplayMeta userDisplayMeta = this.displayMeta;
        return ((iHashCode + (userDisplayMeta == null ? 0 : userDisplayMeta.hashCode())) * 31) + this.hiddenGroupList.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetGroupListResponse(groupList=");
        sbLIZ.append(this.groupList);
        sbLIZ.append(", displayMeta=");
        sbLIZ.append(this.displayMeta);
        sbLIZ.append(", hiddenGroupList=");
        sbLIZ.append(this.hiddenGroupList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetGroupListResponse(List<GroupPreviewDisplayMeta> list, UserDisplayMeta userDisplayMeta, List<GroupPreviewDisplayMeta> list2) {
        this.groupList = list;
        this.displayMeta = userDisplayMeta;
        this.hiddenGroupList = list2;
    }

    public GetGroupListResponse(List list, UserDisplayMeta userDisplayMeta, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? new UserDisplayMeta(0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, true) : userDisplayMeta, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
