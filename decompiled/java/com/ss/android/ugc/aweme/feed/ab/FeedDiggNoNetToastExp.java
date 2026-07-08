package com.ss.android.ugc.aweme.feed.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedDiggNoNetToastExp {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(75));

    public static final class NoNetToastConfig {

        @C09CT("enable")
        public final int enable;

        @C09CT("toast_interval_min")
        public final int toastInterval;

        public NoNetToastConfig() {
            this(0, 10);
        }

        public NoNetToastConfig(int i, int i2) {
            this.enable = i;
            this.toastInterval = i2;
        }
    }
}
