package com.ss.android.ugc.aweme.config;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSAFPlaceholderBitmapPreloadExp {
    public static final Config LIZ = new Config(0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(60));

    public static final boolean LIZ() {
        return ((Config) LIZIZ.getValue()).enable == 1;
    }

    public static final class Config {

        @C09CT("enable")
        public final int enable;

        @C09CT("recycle_on_low_memory")
        public final int recycleOnLowMemory;

        @C09CT("replay_click")
        public final int replayClick;

        public Config() {
            this(0, 0, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && this.recycleOnLowMemory == config.recycleOnLowMemory && this.replayClick == config.replayClick;
        }

        public final int hashCode() {
            return (((this.enable * 31) + this.recycleOnLowMemory) * 31) + this.replayClick;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", recycleOnLowMemory=");
            sbLIZ.append(this.recycleOnLowMemory);
            sbLIZ.append(", replayClick=");
            sbLIZ.append(this.replayClick);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(int i, int i2, int i3) {
            this.enable = i;
            this.recycleOnLowMemory = i2;
            this.replayClick = i3;
        }
    }
}
