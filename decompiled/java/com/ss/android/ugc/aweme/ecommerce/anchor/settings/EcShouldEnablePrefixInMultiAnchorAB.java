package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class EcShouldEnablePrefixInMultiAnchorAB {
    public static final Config LIZ = new Config(Boolean.FALSE, Boolean.FALSE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(49));

    public static final class Config {

        @C09CT("main_anchor")
        public final Boolean mainAnchor;

        @C09CT("multi_anchor")
        public final Boolean multiAnchor;

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public Config(Boolean bool, Boolean bool2) {
            this.mainAnchor = bool;
            this.multiAnchor = bool2;
        }
    }
}
