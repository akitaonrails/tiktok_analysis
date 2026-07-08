package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class DispersionModel {

    @C09CT("data_group_list")
    public final List<OutreachGroupModel> dataGroupList;

    @C09CT("multi_group_list")
    public List<OutreachMultiGroupListModel> multiGroupList;

    @C09CT("outreach_dispersion_exp_value")
    public int outreachDispersionExpValue;

    @C09CT("rule_list")
    public final List<RuleModel> ruleList;

    public DispersionModel() {
        this(0, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DispersionModel(outreachDispersionExpValue=");
        sbLIZ.append(this.outreachDispersionExpValue);
        sbLIZ.append(", multiGroupList=");
        sbLIZ.append(this.multiGroupList);
        sbLIZ.append(", dataGroupList=");
        sbLIZ.append(this.dataGroupList);
        sbLIZ.append(", ruleList=");
        sbLIZ.append(this.ruleList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DispersionModel(int i, List<OutreachMultiGroupListModel> list, List<OutreachGroupModel> list2, List<RuleModel> list3) {
        this.outreachDispersionExpValue = i;
        this.multiGroupList = list;
        this.dataGroupList = list2;
        this.ruleList = list3;
    }
}
