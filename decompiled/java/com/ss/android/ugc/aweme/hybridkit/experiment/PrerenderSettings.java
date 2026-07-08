package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.google.gson.h;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class PrerenderSettings {
    public static final PrerenderXModel LIZ = new PrerenderXModel();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(73));

    public static final class PrerenderXModel {

        @C09CT("biz_block_list")
        public h bizBlockList = new h();

        @C09CT("cache_key_block_list")
        public h cacheKeyBlockList = new h();

        @C09CT("enable")
        public boolean enable;
    }

    public static PrerenderXModel LIZ() {
        return (PrerenderXModel) LIZIZ.getValue();
    }
}
