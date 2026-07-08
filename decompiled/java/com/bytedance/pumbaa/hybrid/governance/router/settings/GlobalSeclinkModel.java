package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GlobalSeclinkModel extends BaseGovernanceModel {

    @C09CT("dfid_escape")
    public final List<String> dfidWhiteList;

    @C09CT("opt_list")
    public final List<String> urlWhiteList;

    public GlobalSeclinkModel() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSeclinkModel)) {
            return false;
        }
        GlobalSeclinkModel globalSeclinkModel = (GlobalSeclinkModel) obj;
        return Intrinsics.LJFF(this.dfidWhiteList, globalSeclinkModel.dfidWhiteList) && Intrinsics.LJFF(this.urlWhiteList, globalSeclinkModel.urlWhiteList);
    }

    public final int hashCode() {
        List<String> list = this.dfidWhiteList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.urlWhiteList;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalSeclinkModel(dfidWhiteList=");
        sbLIZ.append(this.dfidWhiteList);
        sbLIZ.append(", urlWhiteList=");
        sbLIZ.append(this.urlWhiteList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GlobalSeclinkModel(List<String> list, List<String> list2) {
        super(null, false, false, false, false);
        this.dfidWhiteList = list;
        this.urlWhiteList = list2;
    }
}
