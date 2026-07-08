package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LazyLoadTrigger {

    @C09CT("delay_time_sec")
    public final Long delayTimeSec;

    @C09CT("type")
    public final int lazyLoadTriggerType;

    @C09CT("module_stay_trigger")
    public final ModuleStayCondition moduleStayTrigger;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLoadTrigger)) {
            return false;
        }
        LazyLoadTrigger lazyLoadTrigger = (LazyLoadTrigger) obj;
        return this.lazyLoadTriggerType == lazyLoadTrigger.lazyLoadTriggerType && Intrinsics.LJFF(this.delayTimeSec, lazyLoadTrigger.delayTimeSec) && Intrinsics.LJFF(this.moduleStayTrigger, lazyLoadTrigger.moduleStayTrigger);
    }

    public final int hashCode() {
        int i = this.lazyLoadTriggerType * 31;
        Long l = this.delayTimeSec;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        ModuleStayCondition moduleStayCondition = this.moduleStayTrigger;
        return iHashCode + (moduleStayCondition != null ? moduleStayCondition.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LazyLoadTrigger(lazyLoadTriggerType=");
        sbLIZ.append(this.lazyLoadTriggerType);
        sbLIZ.append(", delayTimeSec=");
        sbLIZ.append(this.delayTimeSec);
        sbLIZ.append(", moduleStayTrigger=");
        sbLIZ.append(this.moduleStayTrigger);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LazyLoadTrigger(int i, Long l, ModuleStayCondition moduleStayCondition) {
        this.lazyLoadTriggerType = i;
        this.delayTimeSec = l;
        this.moduleStayTrigger = moduleStayCondition;
    }
}
