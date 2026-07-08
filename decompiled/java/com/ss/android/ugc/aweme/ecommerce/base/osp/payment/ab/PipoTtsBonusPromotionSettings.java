package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsBonusPromotionSettings {
    public static final Config LIZ = new Config(Boolean.FALSE, Boolean.FALSE);

    public static final class Config {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("hide_view_all")
        public final Boolean hideViewAll;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Intrinsics.LJFF(this.enable, config.enable) && Intrinsics.LJFF(this.hideViewAll, config.hideViewAll);
        }

        public final int hashCode() {
            Boolean bool = this.enable;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.hideViewAll;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", hideViewAll=");
            sbLIZ.append(this.hideViewAll);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public Config(Boolean bool, Boolean bool2) {
            this.enable = bool;
            this.hideViewAll = bool2;
        }
    }

    public static final boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Config config = LIZ;
        Config config2 = (Config) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_bonus_promotion", Config.class, config);
        if (config2 != null) {
            config = config2;
        }
        return Intrinsics.LJFF(config.enable, Boolean.TRUE);
    }
}
