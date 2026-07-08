package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C09CT;
import X.C1D1Y;
import X.C1D1Z;
import X.C2249041D1a;
import X.C452501pT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes36.dex */
public final class DisableSparkLynxPrefetchV2 {
    public static final Model LIZ = new Model(false, new ArrayList(), 300000);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1D1Y());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2249041D1a());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1D1Z());

    public static final boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static final long LIZIZ() {
        return ((Number) LIZLLL.getValue()).longValue();
    }

    public static final class Model {

        @C09CT("denyList")
        public ArrayList<String> denyList;

        @C09CT("global")
        public boolean global;

        @C09CT("maxAliveDuration")
        public long maxAliveDuration;

        public Model() {
            this(false, new ArrayList(), 300000L);
        }

        public Model(boolean z, ArrayList<String> arrayList, long j) {
            this.global = z;
            this.denyList = arrayList;
            this.maxAliveDuration = j;
        }
    }
}
