package com.ss.android.ugc.aweme.hybridkit.forest;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.google.gson.h;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class PrefetchXSettings {
    public static final PrefetchXModel LIZ = new PrefetchXModel();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(76));

    public static final class PrefetchXModel {

        @C09CT("disable_sweep")
        public boolean disableSweep;

        @C09CT("enable")
        public boolean enable;

        @C09CT("ignored_params")
        public h ignoredParams = new h();

        @C09CT("resource_removal_threshold")
        public int resourceRemovalThreshold = 100;

        @C09CT("data_removal_threshold")
        public int dataRemovalThreshold = 100;

        @C09CT("js_code_cache_removal_threshold")
        public int jsCodeCacheRemovalThreshold = -1;

        @C09CT("registered_key")
        public h registeredKeys = new h();

        @C09CT("registered_dsl")
        public h registeredDSLs = new h();
    }
}
