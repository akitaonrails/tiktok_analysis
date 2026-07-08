package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PnsJsbBlockConfigModel extends BaseGovernanceModel {

    @C09CT("jsb_dfid_mapping")
    public Map<String, String> dfIdMapping;

    @C09CT("jsb_dfid_whitelist")
    public List<String> dfIdWhiteList;

    public PnsJsbBlockConfigModel() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnsJsbBlockConfigModel)) {
            return false;
        }
        PnsJsbBlockConfigModel pnsJsbBlockConfigModel = (PnsJsbBlockConfigModel) obj;
        return Intrinsics.LJFF(this.dfIdWhiteList, pnsJsbBlockConfigModel.dfIdWhiteList) && Intrinsics.LJFF(this.dfIdMapping, pnsJsbBlockConfigModel.dfIdMapping);
    }

    public final int hashCode() {
        return (this.dfIdWhiteList.hashCode() * 31) + this.dfIdMapping.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsJsbBlockConfigModel(dfIdWhiteList=");
        sbLIZ.append(this.dfIdWhiteList);
        sbLIZ.append(", dfIdMapping=");
        sbLIZ.append(this.dfIdMapping);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsJsbBlockConfigModel(List<String> list, Map<String, String> map) {
        super(null, false, false, false, false);
        this.dfIdWhiteList = list;
        this.dfIdMapping = map;
    }

    public PnsJsbBlockConfigModel(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C2097608Jq.LJ() : map);
    }
}
