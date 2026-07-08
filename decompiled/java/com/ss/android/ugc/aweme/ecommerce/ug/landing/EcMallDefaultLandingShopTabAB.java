package com.ss.android.ugc.aweme.ecommerce.ug.landing;

import X.C09CT;
import X.C0C64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes3.dex */
public final class EcMallDefaultLandingShopTabAB {
    public static final Config LIZ;
    public static final Config LIZIZ;

    static {
        Config config = new Config(false, 5, 60, 10);
        LIZ = config;
        try {
            Config config2 = (Config) C0C64.LJIILLIIL().LJJII(Config.class, config, "ec_mall_default_landing_shoptab", true);
            if (config2 != null) {
                config = config2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            config = LIZ;
        }
        LIZIZ = config;
    }

    public static final class Config {

        @C09CT("default_landing_enable")
        public final boolean enable;

        @C09CT("update_leave_interval_seconds")
        public final int leaveThreshold;

        @C09CT("polling_request_delay_seconds")
        public final int requestDelay;

        @C09CT("polling_request_interval_minutes")
        public final int requestInterval;

        public Config() {
            this(false, 5, 60, 10);
        }

        public Config(boolean z, int i, int i2, int i3) {
            this.enable = z;
            this.requestDelay = i;
            this.requestInterval = i2;
            this.leaveThreshold = i3;
        }
    }
}
