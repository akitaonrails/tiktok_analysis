package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ModuleStayCondition {

    @C09CT("module_group_ids")
    public final List<String> moduleGroupIds;

    @C09CT("stay_time_sec")
    public final long stayTimeSec;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleStayCondition)) {
            return false;
        }
        ModuleStayCondition moduleStayCondition = (ModuleStayCondition) obj;
        return Intrinsics.LJFF(this.moduleGroupIds, moduleStayCondition.moduleGroupIds) && this.stayTimeSec == moduleStayCondition.stayTimeSec;
    }

    public final int hashCode() {
        List<String> list = this.moduleGroupIds;
        return ((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Y2(this.stayTimeSec);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModuleStayCondition(moduleGroupIds=");
        sbLIZ.append(this.moduleGroupIds);
        sbLIZ.append(", stayTimeSec=");
        sbLIZ.append(this.stayTimeSec);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ModuleStayCondition(List<String> list, long j) {
        this.moduleGroupIds = list;
        this.stayTimeSec = j;
    }
}
