package com.ss.android.ugc.aweme.upvote.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostFeedEntrancePollingExp {
    public static final RepostFeedEntrancePollingExp LIZ = new RepostFeedEntrancePollingExp();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(381));

    public static final class RepostFeedEntrancePollingConfig {

        @C09CT("enable")
        public final int enable;

        @C09CT("interval")
        public final int intervalMinutes;

        public RepostFeedEntrancePollingConfig() {
            this(0, 10);
        }

        public RepostFeedEntrancePollingConfig(int i, int i2) {
            this.enable = i;
            this.intervalMinutes = i2;
        }
    }
}
