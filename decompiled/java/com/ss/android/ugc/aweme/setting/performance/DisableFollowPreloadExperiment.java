package com.ss.android.ugc.aweme.setting.performance;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class DisableFollowPreloadExperiment {
    public static final DisableFollowPreloadConfig LIZ = new DisableFollowPreloadConfig(false, 2, 2);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(131));

    public static final class DisableFollowPreloadConfig {

        @C09CT("effect_min_follow_shoot")
        public final long effectMinFollowShoot;

        @C09CT("is_open")
        public final boolean isOpen;

        @C09CT("music_min_follow_shoot")
        public final int musicMinFollowShoot;

        public DisableFollowPreloadConfig() {
            this(false, 2L, 2);
        }

        public DisableFollowPreloadConfig(boolean z, long j, int i) {
            this.isOpen = z;
            this.effectMinFollowShoot = j;
            this.musicMinFollowShoot = i;
        }
    }
}
