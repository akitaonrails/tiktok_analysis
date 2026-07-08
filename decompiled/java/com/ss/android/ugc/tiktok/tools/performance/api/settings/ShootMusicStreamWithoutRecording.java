package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class ShootMusicStreamWithoutRecording {
    public static final ShootMusicStreamWithoutRecordingConfig LIZ = new ShootMusicStreamWithoutRecordingConfig(0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(371));

    public static final class ShootMusicStreamWithoutRecordingConfig {

        @C09CT("cache_progress_threshold")
        public final int cacheProgressThreshold;

        @C09CT("net_level_threshold")
        public final int netLevelThreshold;

        @C09CT("strategy")
        public final int strategy;

        public ShootMusicStreamWithoutRecordingConfig() {
            this(0, 0, 0);
        }

        public ShootMusicStreamWithoutRecordingConfig(int i, int i2, int i3) {
            this.strategy = i;
            this.netLevelThreshold = i2;
            this.cacheProgressThreshold = i3;
        }
    }
}
