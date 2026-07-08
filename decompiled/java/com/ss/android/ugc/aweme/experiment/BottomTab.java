package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BottomTab {

    @C09CT("bottom_tab_key")
    public final String bottomTabKey;

    @C09CT("filter_rules")
    public final Map<String, Boolean> filterRules;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomTab)) {
            return false;
        }
        BottomTab bottomTab = (BottomTab) obj;
        return Intrinsics.LJFF(this.bottomTabKey, bottomTab.bottomTabKey) && Intrinsics.LJFF(this.filterRules, bottomTab.filterRules);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomTab(bottomTabKey=");
        sbLIZ.append(this.bottomTabKey);
        sbLIZ.append(", filterRules=");
        sbLIZ.append(this.filterRules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BottomTab(String str, Map<String, Boolean> map) {
        this.bottomTabKey = str;
        this.filterRules = map;
    }
}
