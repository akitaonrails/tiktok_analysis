package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class LazyLoadStickPointResources {
    public static final LazyStickerPointConfig LIZ = new LazyStickerPointConfig(false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(283));

    public static boolean LIZ() {
        return ((LazyStickerPointConfig) LIZIZ.getValue()).enable;
    }

    public static final class LazyStickerPointConfig {

        @C09CT("disable_delay_show")
        public final boolean disableDelayShow;

        @C09CT("disable_show_loading")
        public final boolean disableShowLoading;

        @C09CT("enable")
        public final boolean enable;

        public LazyStickerPointConfig() {
            this(false, false, false);
        }

        public LazyStickerPointConfig(boolean z, boolean z2, boolean z3) {
            this.enable = z;
            this.disableShowLoading = z2;
            this.disableDelayShow = z3;
        }
    }
}
