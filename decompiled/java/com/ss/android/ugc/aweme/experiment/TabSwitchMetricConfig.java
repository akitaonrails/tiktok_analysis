package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class TabSwitchMetricConfig {
    public static final Config LIZ = new Config(false, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(105));

    public static final class Config {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("fps_sample_duration")
        public final long fpsSampleDuration;

        @C09CT("session_flush_timeout_ms")
        public final long sessionFlushTimeoutMs;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && this.sessionFlushTimeoutMs == config.sessionFlushTimeoutMs && this.fpsSampleDuration == config.fpsSampleDuration;
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.sessionFlushTimeoutMs)) * 31) + C786410Ut5.Y2(this.fpsSampleDuration);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", sessionFlushTimeoutMs=");
            sbLIZ.append(this.sessionFlushTimeoutMs);
            sbLIZ.append(", fpsSampleDuration=");
            sbLIZ.append(this.fpsSampleDuration);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config() {
            this(false, 0L, 0L);
        }

        public Config(boolean z, long j, long j2) {
            this.enable = z;
            this.sessionFlushTimeoutMs = j;
            this.fpsSampleDuration = j2;
        }
    }
}
