package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C098200Yq;
import X.C09CT;
import X.C0C64;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class LandingPopupOptExperiment {
    public static final Config LIZ = new Config(false, false, false, false);

    public static Config LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZ, "ec_mall_landing_popup_opt", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Config config = (Config) c098200Yq;
        return config == null ? LIZ : config;
    }

    public static final class Config {

        @C09CT("enable_await_finish_opt")
        public final boolean enableAwaitFinishOpt;

        @C09CT("enable_landing_track_opt")
        public final boolean enableLandingTrackOpt;

        @C09CT("enable_lifecycle_track")
        public final boolean enableLifecycleTrack;

        @C09CT("enable_mall_track_opt")
        public final boolean enableMallTrackOpt;

        public Config(boolean z, boolean z2, boolean z3, boolean z4) {
            this.enableLifecycleTrack = z;
            this.enableMallTrackOpt = z2;
            this.enableAwaitFinishOpt = z3;
            this.enableLandingTrackOpt = z4;
        }
    }
}
