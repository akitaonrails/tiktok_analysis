package com.ss.android.ugc.aweme.ecommerce.showcase.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class StoreLivePlayAB {
    public static final /* synthetic */ int LIZ = 0;

    public static final class StoreLivePlayConfig {

        @C09CT("block_sources")
        public final String[] blockSources;

        @C09CT("close_minutes")
        public final int closeMinutes;

        public StoreLivePlayConfig() {
            this(0, new String[0]);
        }

        public StoreLivePlayConfig(int i, String[] strArr) {
            this.closeMinutes = i;
            this.blockSources = strArr;
        }
    }
}
