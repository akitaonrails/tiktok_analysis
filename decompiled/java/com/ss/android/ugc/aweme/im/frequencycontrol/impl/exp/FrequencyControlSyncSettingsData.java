package com.ss.android.ugc.aweme.im.frequencycontrol.impl.exp;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrequencyControlSyncSettingsData {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("enabled_scenes")
    public final List<String> enabledScenes;

    public FrequencyControlSyncSettingsData() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyControlSyncSettingsData)) {
            return false;
        }
        FrequencyControlSyncSettingsData frequencyControlSyncSettingsData = (FrequencyControlSyncSettingsData) obj;
        return this.enabled == frequencyControlSyncSettingsData.enabled && Intrinsics.LJFF(this.enabledScenes, frequencyControlSyncSettingsData.enabledScenes);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enabled) * 31) + this.enabledScenes.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyControlSyncSettingsData(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", enabledScenes=");
        sbLIZ.append(this.enabledScenes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyControlSyncSettingsData(boolean z, List<String> list) {
        this.enabled = z;
        this.enabledScenes = list;
    }

    public FrequencyControlSyncSettingsData(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
