package com.ss.android.ugc.aweme.account.experiment;

import X.C09CT;
import X.C0C64;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes14.dex */
public final class ProfileTabDoubleTapSwitchConfig {
    public static final Config LIZ = new Config(false, 80, 1);

    public static final Config LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Config config = LIZ;
        Config config2 = (Config) c0c64LJIILLIIL.LJJIIJ(true, "profile_tab_double_tap_switch_config", 31744, Config.class, config, 1);
        return config2 != null ? config2 : config;
    }

    public static final boolean LIZIZ() {
        return LIZ().enable;
    }

    public static final class Config {

        @C09CT("enable_concentration_threshold_pct")
        public final int concentrationThresholdPct;

        @C09CT("enable_profile_tab_double_tap_switch")
        public final boolean enable;

        @C09CT("confirm_switch_popup_version")
        public final int popupVersion;

        public Config() {
            this(false, 80, 1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && this.concentrationThresholdPct == config.concentrationThresholdPct && this.popupVersion == config.popupVersion;
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.enable) * 31) + this.concentrationThresholdPct) * 31) + this.popupVersion;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", concentrationThresholdPct=");
            sbLIZ.append(this.concentrationThresholdPct);
            sbLIZ.append(", popupVersion=");
            sbLIZ.append(this.popupVersion);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(boolean z, int i, int i2) {
            this.enable = z;
            this.concentrationThresholdPct = i;
            this.popupVersion = i2;
        }
    }
}
