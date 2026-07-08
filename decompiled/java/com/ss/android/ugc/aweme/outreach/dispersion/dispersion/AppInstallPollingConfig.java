package com.ss.android.ugc.aweme.outreach.dispersion.dispersion;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes32.dex */
public final class AppInstallPollingConfig {
    public static final Config LIZ = new Config(0, 0, 15);

    public static final class Config {

        @C09CT("m2_install_polling_trigger_delay_seconds")
        public final long pollingDelay;

        @C09CT("m2_install_polling_duration_seconds")
        public final long pollingDuration;

        @C09CT("m2_install_polling_interval_seconds")
        public final long pollingInterval;

        public Config() {
            this(0L, 0L, 15L);
        }

        public Config(long j, long j2, long j3) {
            this.pollingDuration = j;
            this.pollingInterval = j2;
            this.pollingDelay = j3;
        }
    }

    public static Config LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Config config = LIZ;
        Config config2 = (Config) c0c64LJIILLIIL.LJJII(Config.class, config, "m2_install_polling_config", true);
        return config2 != null ? config2 : config;
    }
}
