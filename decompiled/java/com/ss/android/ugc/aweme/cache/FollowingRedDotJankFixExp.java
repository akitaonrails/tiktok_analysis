package com.ss.android.ugc.aweme.cache;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FollowingRedDotJankFixExp {
    public static final Config LIZ = new Config(true, Mp4ScreenVideoLoadTimeout.CONTROL);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(60));

    public static final class Config {

        @C09CT("delay")
        public final long delay;

        @C09CT("enable")
        public final boolean enable;

        public Config() {
            this(true, Mp4ScreenVideoLoadTimeout.CONTROL);
        }

        public Config(boolean z, long j) {
            this.enable = z;
            this.delay = j;
        }
    }
}
