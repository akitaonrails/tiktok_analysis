package com.ss.android.ugc.aweme.feed.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedDiggFakeWriteOptExp {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(107));

    public static final class FakeWriteConfig {

        @C09CT("enable")
        public final int enable;

        @C09CT("retry_count")
        public final int retryCount;

        @C09CT("retry_interval_min")
        public final int retryInterval;

        public FakeWriteConfig() {
            this(0, 2, 5);
        }

        public FakeWriteConfig(int i, int i2, int i3) {
            this.enable = i;
            this.retryCount = i2;
            this.retryInterval = i3;
        }
    }
}
