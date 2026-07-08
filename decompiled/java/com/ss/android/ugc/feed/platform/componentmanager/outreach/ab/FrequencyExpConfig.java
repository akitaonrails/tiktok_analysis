package com.ss.android.ugc.feed.platform.componentmanager.outreach.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrequencyExpConfig {

    @C09CT("allow_component_key_list")
    public final List<String> allowComponentList;

    @C09CT("open_default")
    public final boolean openDefault;

    public FrequencyExpConfig() {
        this(false, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyExpConfig)) {
            return false;
        }
        FrequencyExpConfig frequencyExpConfig = (FrequencyExpConfig) obj;
        return this.openDefault == frequencyExpConfig.openDefault && Intrinsics.LJFF(this.allowComponentList, frequencyExpConfig.allowComponentList);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.openDefault) * 31;
        List<String> list = this.allowComponentList;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyExpConfig(openDefault=");
        sbLIZ.append(this.openDefault);
        sbLIZ.append(", allowComponentList=");
        sbLIZ.append(this.allowComponentList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyExpConfig(boolean z, List<String> list) {
        this.openDefault = z;
        this.allowComponentList = list;
    }
}
