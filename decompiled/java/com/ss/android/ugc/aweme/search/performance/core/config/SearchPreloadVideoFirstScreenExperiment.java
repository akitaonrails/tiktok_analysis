package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPreloadVideoFirstScreenExperiment {
    public static final SearchPreloadVideoFirstScreenExperiment LIZ = new SearchPreloadVideoFirstScreenExperiment();
    public static final FirstVideoPreloadConfig LIZIZ = new FirstVideoPreloadConfig(false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(346));

    public static final class FirstVideoPreloadConfig {

        @C09CT("enable_prefetch_video")
        public final boolean enablePrefetchVideo;

        @C09CT("enable_prepare_player")
        public final boolean enablePreparePlayer;

        public FirstVideoPreloadConfig() {
            this(false, false);
        }

        public FirstVideoPreloadConfig(boolean z, boolean z2) {
            this.enablePrefetchVideo = z;
            this.enablePreparePlayer = z2;
        }
    }
}
