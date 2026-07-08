package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C09CT;
import X.C309680CBy;
import X.C452501pT;

/* JADX INFO: loaded from: classes5.dex */
public final class SparkLynxPrefetchFallbackToV1 {
    public static final Model LIZ = new Model(false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C309680CBy());

    public static final boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static final class Model {

        @C09CT("fallback")
        public boolean fallback;

        public Model() {
            this(false);
        }

        public Model(boolean z) {
            this.fallback = z;
        }
    }
}
