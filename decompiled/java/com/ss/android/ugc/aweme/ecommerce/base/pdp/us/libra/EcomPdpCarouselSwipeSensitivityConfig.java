package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
public final class EcomPdpCarouselSwipeSensitivityConfig {
    public static final Config LIZ = new Config(true, true, 10);

    public static Config LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Config config = LIZ;
        Config config2 = (Config) settingsManagerLIZLLL.LJIIIIZZ("ec_pdp_carousel_swipe_sensitivity", Config.class, config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {

        @C09CT("enabled")
        public final boolean enabled;

        @C09CT("use_reflection")
        public final boolean reflectionEnabled;

        @C09CT("touch_slop_px")
        public final int touchSlopPx;

        public Config() {
            this(true, true, 10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enabled == config.enabled && this.reflectionEnabled == config.reflectionEnabled && this.touchSlopPx == config.touchSlopPx;
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Z2(this.reflectionEnabled)) * 31) + this.touchSlopPx;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enabled=");
            sbLIZ.append(this.enabled);
            sbLIZ.append(", reflectionEnabled=");
            sbLIZ.append(this.reflectionEnabled);
            sbLIZ.append(", touchSlopPx=");
            sbLIZ.append(this.touchSlopPx);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(boolean z, boolean z2, int i) {
            this.enabled = z;
            this.reflectionEnabled = z2;
            this.touchSlopPx = i;
        }
    }
}
