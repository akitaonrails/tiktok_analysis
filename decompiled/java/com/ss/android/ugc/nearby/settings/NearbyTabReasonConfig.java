package com.ss.android.ugc.nearby.settings;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class NearbyTabReasonConfig {
    public static final NearbyTabReasonModel LIZ = new NearbyTabReasonModel(true, null);

    public static final class NearbyTabReasonModel {
        public final boolean LIZ;

        @C09CT("reason")
        public final List<String> reason;

        public NearbyTabReasonModel() {
            this(false, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyTabReasonModel)) {
                return false;
            }
            NearbyTabReasonModel nearbyTabReasonModel = (NearbyTabReasonModel) obj;
            return this.LIZ == nearbyTabReasonModel.LIZ && Intrinsics.LJFF(this.reason, nearbyTabReasonModel.reason);
        }

        public final int hashCode() {
            int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
            List<String> list = this.reason;
            return iZ2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NearbyTabReasonModel(isDefault=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", reason=");
            sbLIZ.append(this.reason);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public NearbyTabReasonModel(boolean z, List<String> list) {
            this.LIZ = z;
            this.reason = list;
        }
    }
}
