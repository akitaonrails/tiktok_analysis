package com.ss.android.ugc.aweme.service;

import X.C09CT;
import X.C0C64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class NearbyPerformanceOpt {
    public static final Config LIZ;

    public static final class Config {

        @C09CT("viewpager_preload_opt")
        public final Boolean inDisableViewPagerPreloadOpt;

        @C09CT("load_assem_opt")
        public final Boolean isEnableLoadAssemOpt;

        @C09CT("view_inflate_opt")
        public final Boolean isEnableViewInflateOpt;

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        }

        public Config(Boolean bool, Boolean bool2, Boolean bool3) {
            this.isEnableLoadAssemOpt = bool;
            this.inDisableViewPagerPreloadOpt = bool2;
            this.isEnableViewInflateOpt = bool3;
        }
    }

    public static boolean LIZ() {
        Config config;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            config = LIZ;
            Config config2 = (Config) c0c64LJIILLIIL.LJJII(Config.class, config, "nearby_performance_opt", false);
            if (config2 != null) {
                config = config2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            config = LIZ;
        }
        Boolean bool = config.inDisableViewPagerPreloadOpt;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    static {
        Boolean bool = Boolean.FALSE;
        LIZ = new Config(bool, bool, bool);
    }
}
