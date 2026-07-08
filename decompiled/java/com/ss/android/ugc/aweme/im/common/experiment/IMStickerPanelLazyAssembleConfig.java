package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMStickerPanelLazyAssembleConfig {
    public static final Config LIZ = new Config(500);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(368));

    public static final class Config {

        @C09CT("preload_delay")
        public final long preloadDelay;

        public Config() {
            this(500L);
        }

        public Config(long j) {
            this.preloadDelay = j;
        }
    }
}
