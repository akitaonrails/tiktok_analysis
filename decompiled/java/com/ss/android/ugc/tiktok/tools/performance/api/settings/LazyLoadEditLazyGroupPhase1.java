package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class LazyLoadEditLazyGroupPhase1 {
    public static final Config LIZ = new Config();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(282));

    public static final class Config {

        @C09CT("enable_force_lazy")
        public final boolean enableForceLazy;

        @C09CT("enable_lazy_safe_component")
        public final boolean enableLazySafeComponent;

        @C09CT("enable_merge_ep_lazy")
        public final boolean enableMergeEPLazy;
    }

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }
}
