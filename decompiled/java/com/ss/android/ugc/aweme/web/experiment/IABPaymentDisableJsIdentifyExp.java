package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class IABPaymentDisableJsIdentifyExp {
    public static final IABPaymentDisableJsIdentifyConfig LIZ = new IABPaymentDisableJsIdentifyConfig(null, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(297));

    public static final class IABPaymentDisableJsIdentifyConfig {

        @C09CT("disable_js_identify")
        public final boolean disableJsIdentify;

        @C09CT("methods")
        public final List<String> methods;

        public IABPaymentDisableJsIdentifyConfig() {
            this(null, false);
        }

        public IABPaymentDisableJsIdentifyConfig(List<String> list, boolean z) {
            this.methods = list;
            this.disableJsIdentify = z;
        }
    }
}
