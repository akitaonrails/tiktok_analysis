package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class OutreachMultiGroupListModel {

    @C09CT("data_group_list")
    public final List<OutreachGroupModel> dataGroupList;

    @C09CT("data_group_key")
    public final String groupKey;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachMultiGroupListModel(groupKey=");
        sbLIZ.append(this.groupKey);
        sbLIZ.append(", dataGroupList=");
        sbLIZ.append(this.dataGroupList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OutreachMultiGroupListModel(String str, List<OutreachGroupModel> list) {
        this.groupKey = str;
        this.dataGroupList = list;
    }
}
