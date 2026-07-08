package com.ss.android.ugc.ur.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class ManageBatchUnfollowAbilityExp {
    public static final Config LIZ = new Config(Boolean.FALSE, 100, Boolean.TRUE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(133));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(130));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(132));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(131));

    public static final class Config {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("enable_sync_unfollow_notification")
        public final Boolean enableSyncUnfollowNotification;

        @C09CT("max_batch_unfollow_count")
        public final Integer maxBatchUnfollowCount;

        public Config() {
            this(Boolean.FALSE, 100, Boolean.TRUE);
        }

        public Config(Boolean bool, Integer num, Boolean bool2) {
            this.enable = bool;
            this.maxBatchUnfollowCount = num;
            this.enableSyncUnfollowNotification = bool2;
        }
    }
}
