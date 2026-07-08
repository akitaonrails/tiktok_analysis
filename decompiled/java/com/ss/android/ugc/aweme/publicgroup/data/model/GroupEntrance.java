package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1219960hqs;
import X.EnumC1228990i5R;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupEntrance {

    @C09CT("access_criteria_collections")
    public final List<GroupAccessCriteriaCollection> accessCriteriaCollections;

    @C09CT("can_create")
    public final boolean canCreate;

    @C09CT("current_group_cnt")
    public final int currentGroupCnt;

    @C09CT("entrance_desc")
    public final String entranceDesc;

    @C09CT("group_cnt_limit")
    public final int groupCntLimit;

    @C09CT("group_member_limit")
    public final int groupMemberLimit;

    @C09CT("type")
    public final GroupCompositeType type;

    public GroupEntrance() {
        this(new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), "", EnumC1219960hqs.UNKNOWN.getValue()), true, null, null, 0, 0, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupEntrance(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", canCreate=");
        sbLIZ.append(this.canCreate);
        sbLIZ.append(", entranceDesc=");
        sbLIZ.append(this.entranceDesc);
        sbLIZ.append(", accessCriteriaCollections=");
        sbLIZ.append(this.accessCriteriaCollections);
        sbLIZ.append(", currentGroupCnt=");
        sbLIZ.append(this.currentGroupCnt);
        sbLIZ.append(", groupCntLimit=");
        sbLIZ.append(this.groupCntLimit);
        sbLIZ.append(", groupMemberLimit=");
        sbLIZ.append(this.groupMemberLimit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupEntrance(GroupCompositeType groupCompositeType, boolean z, String str, List<GroupAccessCriteriaCollection> list, int i, int i2, int i3) {
        this.type = groupCompositeType;
        this.canCreate = z;
        this.entranceDesc = str;
        this.accessCriteriaCollections = list;
        this.currentGroupCnt = i;
        this.groupCntLimit = i2;
        this.groupMemberLimit = i3;
    }
}
