package com.ss.android.ugc.aweme.web.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdTestCheckUrlSettings {
    public static final AdTestCheckUrlConfig LIZ = new AdTestCheckUrlConfig(false, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(303));

    public static final class AdTestCheckUrlConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("test_url")
        public final String testUrl;

        public AdTestCheckUrlConfig() {
            this(false, null);
        }

        public AdTestCheckUrlConfig(boolean z, String str) {
            this.enable = z;
            this.testUrl = str;
        }
    }
}
