package com.ss.android.ugc.aweme.exp.game.gamecenter;

import X.C09CT;
import X.C0C64;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes15.dex */
public final class IMEffectGameRevampExperiment {
    public static final Config LIZ = new Config(0, 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 1, 86400000);

    public static final class Config {

        @C09CT("ab_cache_duration")
        public final long abCacheDuration;

        @C09CT("ab_version")
        public final int abVersion;

        @C09CT("enable_value")
        public final int enableValue;

        @C09CT("is_fully_launch")
        public final int isFullyLaunch;

        @C09CT("fetch_muf_ab_group_size")
        public final int mufABSize;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enableValue == config.enableValue && this.isFullyLaunch == config.isFullyLaunch && this.mufABSize == config.mufABSize && this.abVersion == config.abVersion && this.abCacheDuration == config.abCacheDuration;
        }

        public final int hashCode() {
            return (((((((this.enableValue * 31) + this.isFullyLaunch) * 31) + this.mufABSize) * 31) + this.abVersion) * 31) + C786410Ut5.Y2(this.abCacheDuration);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enableValue=");
            sbLIZ.append(this.enableValue);
            sbLIZ.append(", isFullyLaunch=");
            sbLIZ.append(this.isFullyLaunch);
            sbLIZ.append(", mufABSize=");
            sbLIZ.append(this.mufABSize);
            sbLIZ.append(", abVersion=");
            sbLIZ.append(this.abVersion);
            sbLIZ.append(", abCacheDuration=");
            sbLIZ.append(this.abCacheDuration);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config() {
            this(0, 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 1, 86400000L);
        }

        public Config(int i, int i2, int i3, int i4, long j) {
            this.enableValue = i;
            this.isFullyLaunch = i2;
            this.mufABSize = i3;
            this.abVersion = i4;
            this.abCacheDuration = j;
        }
    }

    public static Config LIZ() {
        Config config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZ, "tt_im_effect_game_revamp", false);
        return config == null ? new Config(0, 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 1, 86400000L) : config;
    }

    public static boolean LIZIZ() {
        return LIZ().enableValue > 0;
    }
}
