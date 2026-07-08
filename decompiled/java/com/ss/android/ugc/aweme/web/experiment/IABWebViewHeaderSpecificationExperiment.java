package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class IABWebViewHeaderSpecificationExperiment {
    public static final IABWebViewHeaderSpecificationExperiment LIZ = new IABWebViewHeaderSpecificationExperiment();
    public static final Config LIZIZ = new Config(false, false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(299));

    public static final class Config implements Serializable {

        @C09CT("start_with_standard_webview_ua")
        public final boolean startWithStandardWebViewUA;

        @C09CT("with_device_information")
        public final boolean withDeviceInformation;

        @C09CT("with_x_requested_with")
        public final boolean withXRequestedWith;

        public Config() {
            this(false, false, false);
        }

        public final boolean getStartWithStandardWebViewUA() {
            return this.startWithStandardWebViewUA;
        }

        public final boolean getWithDeviceInformation() {
            return this.withDeviceInformation;
        }

        public final boolean getWithXRequestedWith() {
            return this.withXRequestedWith;
        }

        public Config(boolean z, boolean z2, boolean z3) {
            this.startWithStandardWebViewUA = z;
            this.withDeviceInformation = z2;
            this.withXRequestedWith = z3;
        }
    }
}
