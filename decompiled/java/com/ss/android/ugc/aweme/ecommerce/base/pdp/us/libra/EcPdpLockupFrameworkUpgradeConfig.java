package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;
import X.C0C64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPdpLockupFrameworkUpgradeConfig {
    public static final Config LIZ = new Config(0, Boolean.TRUE, Boolean.FALSE);

    public static final Config LIZ() {
        Config config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZ, "ec_pdp_lockup_framework_upgrade", true);
        return config == null ? new Config(0, Boolean.TRUE, Boolean.FALSE) : config;
    }

    public static boolean LIZIZ() {
        return Intrinsics.LJFF(LIZ().overlap, Boolean.FALSE);
    }

    public static final class Config {

        @C09CT("move_lockup_above_header_preview_data_flow")
        public final Boolean moveLockupAboveHeader;

        @C09CT("half_screen_nav_bar_overlap")
        public final Boolean overlap;

        @C09CT("half_screen_nav_bar_type")
        public final Integer type;

        public Config() {
            this(0, Boolean.TRUE, Boolean.FALSE);
        }

        public Config(Integer num, Boolean bool, Boolean bool2) {
            this.type = num;
            this.overlap = bool;
            this.moveLockupAboveHeader = bool2;
        }
    }
}
