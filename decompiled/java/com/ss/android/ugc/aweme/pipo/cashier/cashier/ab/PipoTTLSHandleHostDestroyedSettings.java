package com.ss.android.ugc.aweme.pipo.cashier.cashier.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoTTLSHandleHostDestroyedSettings {
    public static final Config LIZ = new Config(Boolean.TRUE, 3000L);

    public static final class Config {

        @C09CT("enabled")
        public final Boolean enabled;

        @C09CT("jump_odp_interval")
        public final Long interval;

        public Config() {
            this(Boolean.TRUE, 3000L);
        }

        public Config(Boolean bool, Long l) {
            this.enabled = bool;
            this.interval = l;
        }
    }

    public static long LIZ() {
        Long l;
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("pipo_ttls_handle_biz_destroyed_settings", Config.class, LIZ);
        if (config == null || (l = config.interval) == null) {
            return 3000L;
        }
        return l.longValue();
    }
}
