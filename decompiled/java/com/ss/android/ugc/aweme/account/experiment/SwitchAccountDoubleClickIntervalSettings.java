package com.ss.android.ugc.aweme.account.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class SwitchAccountDoubleClickIntervalSettings {
    public static final Model LIZ = new Model(40, 300);
    public static final WeakHashMap<View, Long> LIZIZ = new WeakHashMap<>();

    public static final class Model {

        @C09CT("max_interval_ms")
        public final long maxIntervalMs;

        @C09CT("min_interval_ms")
        public final long minIntervalMs;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return this.minIntervalMs == model.minIntervalMs && this.maxIntervalMs == model.maxIntervalMs;
        }

        public final int hashCode() {
            return (C786410Ut5.Y2(this.minIntervalMs) * 31) + C786410Ut5.Y2(this.maxIntervalMs);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Model(minIntervalMs=");
            sbLIZ.append(this.minIntervalMs);
            sbLIZ.append(", maxIntervalMs=");
            sbLIZ.append(this.maxIntervalMs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Model() {
            this(40L, 300L);
        }

        public Model(long j, long j2) {
            this.minIntervalMs = j;
            this.maxIntervalMs = j2;
        }
    }
}
