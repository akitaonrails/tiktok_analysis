package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes8.dex */
public final class ToplivePageLoadAdvanceSetting {
    public static final ToplivePageOptConfig LIZ = new ToplivePageOptConfig();

    public static final class ToplivePageOptConfig {

        @C09CT("enable_touch_preload")
        public final boolean enableTouchPreload = true;

        @C09CT("touch_preload_interval")
        public final int touchPreloadInterval = 10000;

        @C09CT("enable_layout_opt")
        public final boolean enableLayoutOpt = true;

        @C09CT("enable_activity_anim")
        public final boolean enableActivityAnim = true;

        @C09CT("enable_layout_preload")
        public final boolean enableLayoutPreload = true;

        @C09CT("enable_boost")
        public final boolean enableBoost = true;

        @C09CT("disable_change_anim")
        public final boolean disableChangeAnim = true;
    }

    public static final ToplivePageOptConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ToplivePageOptConfig toplivePageOptConfig = LIZ;
        ToplivePageOptConfig toplivePageOptConfig2 = (ToplivePageOptConfig) c0c64LJIILLIIL.LJJII(ToplivePageOptConfig.class, toplivePageOptConfig, "toplive_new_page_advance_opt", true);
        return toplivePageOptConfig2 != null ? toplivePageOptConfig2 : toplivePageOptConfig;
    }
}
