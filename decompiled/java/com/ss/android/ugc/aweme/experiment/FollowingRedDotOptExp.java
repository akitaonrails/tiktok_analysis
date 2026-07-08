package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FollowingRedDotOptExp {
    public static final Config LIZ = new Config(false, -1, 0.0f, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(57));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(151));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(145));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(146));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(149));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(147));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(148));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(150));

    public static Config LIZ() {
        return (Config) LIZJ.getValue();
    }

    public static final class Config {

        @C09CT("auto_refresh_strategy")
        public final int autoRefreshStrategy;

        @C09CT("enter_following_auto_refresh")
        public final boolean autoRefreshWhenHasUnread;

        @C09CT("preload_pull_sample_rate")
        public final float preloadSampleRate;

        @C09CT("switch_page_delay_time")
        public final long switchPageDelayTime;

        public Config() {
            this(false, -1, 0.0f, 0L);
        }

        public Config(boolean z, int i, float f, long j) {
            this.autoRefreshWhenHasUnread = z;
            this.autoRefreshStrategy = i;
            this.preloadSampleRate = f;
            this.switchPageDelayTime = j;
        }
    }
}
