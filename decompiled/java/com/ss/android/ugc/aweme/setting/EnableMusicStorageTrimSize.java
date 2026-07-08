package com.ss.android.ugc.aweme.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class EnableMusicStorageTrimSize {
    public static final MusicStorageTrimSizeConfig LIZ = new MusicStorageTrimSizeConfig(false, 300, 0.5f);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(93));

    public static final class MusicStorageTrimSizeConfig {

        @C09CT("cache_threshold_mb")
        public final long cacheThresholdMb;

        @C09CT("clean_factor")
        public final float cleanFactor;

        @C09CT("is_open")
        public final boolean isOpen;

        public MusicStorageTrimSizeConfig() {
            this(false, 300L, 0.5f);
        }

        public MusicStorageTrimSizeConfig(boolean z, long j, float f) {
            this.isOpen = z;
            this.cacheThresholdMb = j;
            this.cleanFactor = f;
        }
    }
}
