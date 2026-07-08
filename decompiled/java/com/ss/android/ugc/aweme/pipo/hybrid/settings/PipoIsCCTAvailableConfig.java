package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PipoIsCCTAvailableConfig {

    @C09CT("browser_list")
    public final List<String> browserList;

    @C09CT("enable")
    public final boolean enable;

    public PipoIsCCTAvailableConfig() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoIsCCTAvailableConfig)) {
            return false;
        }
        PipoIsCCTAvailableConfig pipoIsCCTAvailableConfig = (PipoIsCCTAvailableConfig) obj;
        return this.enable == pipoIsCCTAvailableConfig.enable && Intrinsics.LJFF(this.browserList, pipoIsCCTAvailableConfig.browserList);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.enable) * 31;
        List<String> list = this.browserList;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoIsCCTAvailableConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", browserList=");
        sbLIZ.append(this.browserList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoIsCCTAvailableConfig(boolean z, List<String> list) {
        this.enable = z;
        this.browserList = list;
    }

    public PipoIsCCTAvailableConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
