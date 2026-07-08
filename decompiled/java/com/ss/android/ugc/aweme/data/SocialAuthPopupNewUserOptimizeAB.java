package com.ss.android.ugc.aweme.data;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes22.dex */
public final class SocialAuthPopupNewUserOptimizeAB {
    public static final NewUserAuthDelayExpConfig LIZ = new NewUserAuthDelayExpConfig(true, 8, 0, 0);

    public static NewUserAuthDelayExpConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        NewUserAuthDelayExpConfig newUserAuthDelayExpConfig = LIZ;
        NewUserAuthDelayExpConfig newUserAuthDelayExpConfig2 = (NewUserAuthDelayExpConfig) c0c64LJIILLIIL.LJJII(NewUserAuthDelayExpConfig.class, newUserAuthDelayExpConfig, "auth_popup_delay_learning_experiment", true);
        return newUserAuthDelayExpConfig2 != null ? newUserAuthDelayExpConfig2 : newUserAuthDelayExpConfig;
    }

    public static boolean LIZIZ() {
        if (LIZ().delay_vv == 0) {
            return LIZ().enabled && LIZ().delay_vv == 0 && LIZ().delay_day == 0 && LIZ().delay_cold_start == 0;
        }
        return true;
    }

    public static final class NewUserAuthDelayExpConfig {

        @C09CT("delay_cold_start")
        public final int delay_cold_start;

        @C09CT("delay_day")
        public final int delay_day;

        @C09CT("delay_vv")
        public final int delay_vv;

        @C09CT("enabled")
        public final boolean enabled;

        public NewUserAuthDelayExpConfig() {
            this(true, 8, 0, 0);
        }

        public NewUserAuthDelayExpConfig(boolean z, int i, int i2, int i3) {
            this.enabled = z;
            this.delay_vv = i;
            this.delay_day = i2;
            this.delay_cold_start = i3;
        }
    }
}
