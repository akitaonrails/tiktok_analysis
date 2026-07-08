package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class IABLoginDisableJsIdentifyExp {
    public static final IABLoginDisableJsIdentifyConfig LIZ = new IABLoginDisableJsIdentifyConfig(null, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(295));

    public static final class IABLoginDisableJsIdentifyConfig {

        @C09CT("disable_js_identify")
        public final boolean disableJsIdentify;

        @C09CT("methods")
        public final List<String> methods;

        public IABLoginDisableJsIdentifyConfig() {
            this(null, false);
        }

        public IABLoginDisableJsIdentifyConfig(List<String> list, boolean z) {
            this.methods = list;
            this.disableJsIdentify = z;
        }
    }
}
