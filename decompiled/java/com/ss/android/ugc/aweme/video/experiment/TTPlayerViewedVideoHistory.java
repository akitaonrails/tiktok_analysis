package com.ss.android.ugc.aweme.video.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import X.C584260Mvo;

/* JADX INFO: loaded from: classes10.dex */
public final class TTPlayerViewedVideoHistory {
    public static final PlaybackHistoryConfig LIZ = new PlaybackHistoryConfig(false, 100);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C584260Mvo());

    public static final class PlaybackHistoryConfig {

        @C09CT("enable_history")
        public final boolean enableHistory;

        @C09CT("max_history_count")
        public final int maxHistoryCount;

        public PlaybackHistoryConfig() {
            this(false, 100);
        }

        public PlaybackHistoryConfig(boolean z, int i) {
            this.enableHistory = z;
            this.maxHistoryCount = i;
        }
    }
}
