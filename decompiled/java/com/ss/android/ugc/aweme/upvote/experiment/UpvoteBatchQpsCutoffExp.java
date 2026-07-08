package com.ss.android.ugc.aweme.upvote.experiment;

import X.C01GW;
import X.C09CT;
import X.C1359040lTC;
import X.C452501pT;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteBatchQpsCutoffExp {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1359040lTC());

    public static UpvoteBatchQpsCutoffConfig LIZIZ() {
        return (UpvoteBatchQpsCutoffConfig) LIZ.getValue();
    }

    public static boolean LIZ() {
        UpvoteBatchQpsCutoffConfig upvoteBatchQpsCutoffConfigLIZIZ = LIZIZ();
        return upvoteBatchQpsCutoffConfigLIZIZ != null && upvoteBatchQpsCutoffConfigLIZIZ.enable == 1;
    }

    public static final class UpvoteBatchQpsCutoffConfig {

        @C09CT("duplicate_time_window")
        public final int duplicateTimeWindow;

        @C09CT("enable")
        public final int enable;

        @C09CT("merge_time_window")
        public final int mergeTimeWindow;

        @C09CT("opt_task")
        public final int optTask;

        public UpvoteBatchQpsCutoffConfig() {
            this(0, 2000, 500, 0);
        }

        public UpvoteBatchQpsCutoffConfig(int i, int i2, int i3, int i4) {
            this.enable = i;
            this.duplicateTimeWindow = i2;
            this.mergeTimeWindow = i3;
            this.optTask = i4;
        }
    }
}
