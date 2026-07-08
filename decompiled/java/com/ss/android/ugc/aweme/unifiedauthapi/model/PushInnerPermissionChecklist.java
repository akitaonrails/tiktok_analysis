package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PushInnerPermissionChecklist implements Serializable {

    @C09CT("all_need_close_switches")
    public List<String> allNeedCloseSwitches;

    @C09CT("any_need_close_switches")
    public List<String> anyNeedCloseSwitches;

    public PushInnerPermissionChecklist() {
        this(null, null);
    }

    public int hashCode() {
        List<String> list = this.allNeedCloseSwitches;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.anyNeedCloseSwitches;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushInnerPermissionChecklist(allNeedCloseSwitches=");
        sbLIZ.append(this.allNeedCloseSwitches);
        sbLIZ.append(", anyNeedCloseSwitches=");
        sbLIZ.append(this.anyNeedCloseSwitches);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setAllNeedCloseSwitches(List<String> list) {
        this.allNeedCloseSwitches = list;
    }

    public final void setAnyNeedCloseSwitches(List<String> list) {
        this.anyNeedCloseSwitches = list;
    }

    public PushInnerPermissionChecklist(List<String> list, List<String> list2) {
        this.allNeedCloseSwitches = list;
        this.anyNeedCloseSwitches = list2;
    }
}
