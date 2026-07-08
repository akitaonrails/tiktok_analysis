package com.ss.android.ugc.aweme.tablet.impl.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class TabletFastForwardRewindConfigurationAB {
    public static final TabletFastForwardRewindConfigurationAB LIZ = new TabletFastForwardRewindConfigurationAB();
    public static final List<TabletFastForwardRewindConfigurationItem> LIZIZ = Collections.singletonList(new TabletFastForwardRewindConfigurationItem(-1, 5));

    public static final class TabletFastForwardRewindConfigurationItem {

        @C09CT("aweme_duration_threshold_ms")
        public final long awemeDurationThresholdMs;

        @C09CT("tablet_fast_forward_rewind_time_seconds")
        public final int tabletFastForwardRewindTimeSeconds;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabletFastForwardRewindConfigurationItem)) {
                return false;
            }
            TabletFastForwardRewindConfigurationItem tabletFastForwardRewindConfigurationItem = (TabletFastForwardRewindConfigurationItem) obj;
            return this.awemeDurationThresholdMs == tabletFastForwardRewindConfigurationItem.awemeDurationThresholdMs && this.tabletFastForwardRewindTimeSeconds == tabletFastForwardRewindConfigurationItem.tabletFastForwardRewindTimeSeconds;
        }

        public final int hashCode() {
            return (C786410Ut5.Y2(this.awemeDurationThresholdMs) * 31) + this.tabletFastForwardRewindTimeSeconds;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TabletFastForwardRewindConfigurationItem(awemeDurationThresholdMs=");
            sbLIZ.append(this.awemeDurationThresholdMs);
            sbLIZ.append(", tabletFastForwardRewindTimeSeconds=");
            sbLIZ.append(this.tabletFastForwardRewindTimeSeconds);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TabletFastForwardRewindConfigurationItem() {
            this(-1L, 5);
        }

        public TabletFastForwardRewindConfigurationItem(long j, int i) {
            this.awemeDurationThresholdMs = j;
            this.tabletFastForwardRewindTimeSeconds = i;
        }
    }
}
