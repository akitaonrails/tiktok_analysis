package com.ss.android.ugc.tiktok.location.config;

import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LocationInAppPreciseConsentExperimentModel {

    @C09CT("enabled_triggers")
    public final Set<Integer> enabledTriggers;

    public LocationInAppPreciseConsentExperimentModel() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocationInAppPreciseConsentExperimentModel) && Intrinsics.LJFF(this.enabledTriggers, ((LocationInAppPreciseConsentExperimentModel) obj).enabledTriggers);
    }

    public final int hashCode() {
        return this.enabledTriggers.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationInAppPreciseConsentExperimentModel(enabledTriggers=");
        sbLIZ.append(this.enabledTriggers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocationInAppPreciseConsentExperimentModel(Set<Integer> set) {
        this.enabledTriggers = set;
    }

    public LocationInAppPreciseConsentExperimentModel(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set);
    }
}
