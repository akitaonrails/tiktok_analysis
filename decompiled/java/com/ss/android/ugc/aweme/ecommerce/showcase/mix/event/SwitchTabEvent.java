package com.ss.android.ugc.aweme.ecommerce.showcase.mix.event;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SwitchTabEvent extends BaseMixEvent {

    @C09CT("tab_type")
    public final Long tabType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwitchTabEvent) && Intrinsics.LJFF(this.tabType, ((SwitchTabEvent) obj).tabType);
    }

    public final int hashCode() {
        Long l = this.tabType;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchTabEvent(tabType=");
        sbLIZ.append(this.tabType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SwitchTabEvent(Long l) {
        this.tabType = l;
    }
}
