package com.ss.android.ugc.aweme.cache;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class FollowingHvrStrategyExp {
    public static final FollowingHvrStrategyConfigModel LIZ = new FollowingHvrStrategyConfigModel(false, false, 10);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(102));

    public static final class FollowingHvrStrategyConfigModel {

        @C09CT("enable_deliver_server")
        public final boolean enableDeliverServer;

        @C09CT("enable_local_cache")
        public final boolean enableLocalCache;

        @C09CT("limit_count")
        public final int limitCount;

        public FollowingHvrStrategyConfigModel() {
            this(false, false, 10);
        }

        public FollowingHvrStrategyConfigModel(boolean z, boolean z2, int i) {
            this.enableLocalCache = z;
            this.enableDeliverServer = z2;
            this.limitCount = i;
        }
    }
}
