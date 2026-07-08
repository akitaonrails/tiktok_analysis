package com.ss.android.ugc.aweme.favorites.business.music.raven.exp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class RavenMusicCollectionFirstFetchThreshold {
    public static final FirstFetchThresholdModel LIZ = new FirstFetchThresholdModel(1, 10);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(183));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(184));

    public static final class FirstFetchThresholdModel {

        @C09CT("sounds_tab_first_fetch_load_counts")
        public final int extraFetchAttempts;

        @C09CT("sounds_tab_first_fetch_show_counts")
        public final int targetMusicCount;

        public FirstFetchThresholdModel() {
            this(1, 10);
        }

        public FirstFetchThresholdModel(int i, int i2) {
            this.extraFetchAttempts = i;
            this.targetMusicCount = i2;
        }
    }
}
