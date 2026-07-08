package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;
import X.C0C64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public final class LowMemoryClearPlayerExp {
    public static final Config LIZ;
    public static final Config LIZIZ;

    static {
        Config config = new Config(false, false, 65535, false, true, 0);
        LIZ = config;
        try {
            Config config2 = (Config) C0C64.LJIILLIIL().LJJII(Config.class, config, "low_memory_clear_player", true);
            if (config2 != null) {
                config = config2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            config = LIZ;
        }
        LIZIZ = config;
    }

    public static final class Config {

        @C09CT("clear_biz")
        public final int clearBiz;

        @C09CT("clear_live")
        public final boolean clearLive;

        @C09CT("clear_max")
        public final int clearMax;

        @C09CT("clear_vod")
        public final boolean clearVod;

        @C09CT("clear_when_pause")
        public final boolean clearWhenPause;

        @C09CT("enable")
        public final boolean enable;

        public Config() {
            this(false, false, 65535, false, true, 0);
        }

        public Config(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2) {
            this.enable = z;
            this.clearWhenPause = z2;
            this.clearBiz = i;
            this.clearLive = z3;
            this.clearVod = z4;
            this.clearMax = i2;
        }
    }
}
