package com.ss.android.ugc.nearby.settings;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class NearbyPreloadTabTriggerExperiment {
    public static final NearbyPreloadTabTriggerConfig LIZ = new NearbyPreloadTabTriggerConfig(Boolean.FALSE, null, 2, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(599));

    public static final class NearbyPreloadTabTriggerConfig {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("trigger_scene")
        public final List<String> triggerScene;

        public NearbyPreloadTabTriggerConfig() {
            this(null, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyPreloadTabTriggerConfig)) {
                return false;
            }
            NearbyPreloadTabTriggerConfig nearbyPreloadTabTriggerConfig = (NearbyPreloadTabTriggerConfig) obj;
            return Intrinsics.LJFF(this.enable, nearbyPreloadTabTriggerConfig.enable) && Intrinsics.LJFF(this.triggerScene, nearbyPreloadTabTriggerConfig.triggerScene);
        }

        public final int hashCode() {
            Boolean bool = this.enable;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            List<String> list = this.triggerScene;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NearbyPreloadTabTriggerConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", triggerScene=");
            sbLIZ.append(this.triggerScene);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public NearbyPreloadTabTriggerConfig(Boolean bool, List<String> list) {
            this.enable = bool;
            this.triggerScene = list;
        }

        public NearbyPreloadTabTriggerConfig(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
