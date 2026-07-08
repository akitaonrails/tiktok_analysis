package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FollowingSkylightAbilityOptConfig {
    public static final Config LIZ = new Config(false, 0, true, 3, 900);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(161));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(158));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(160));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(159));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(156));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(157));

    public static final class Config {

        @C09CT("auto_fold_count")
        public final int autoFoldCount;

        @C09CT("inner_back_refresh_duration")
        public final long backRefreshSkylightDuration;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("feed_real_time_read_enable")
        public final boolean enableRealTimeRead;

        @C09CT("preload_size_limit")
        public final int preloadSizeLimit;

        public Config() {
            this(false, 0, true, 3, 900L);
        }

        public Config(boolean z, int i, boolean z2, int i2, long j) {
            this.enable = z;
            this.preloadSizeLimit = i;
            this.enableRealTimeRead = z2;
            this.autoFoldCount = i2;
            this.backRefreshSkylightDuration = j;
        }
    }

    public static boolean LIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }
}
