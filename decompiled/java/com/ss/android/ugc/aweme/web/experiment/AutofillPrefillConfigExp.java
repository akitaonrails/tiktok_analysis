package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AutofillPrefillConfigExp {
    public static final AutofillPrefillConfig LIZ = new AutofillPrefillConfig(false, 0, "");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(290));

    public static final boolean LIZ() {
        return ((AutofillPrefillConfig) LIZIZ.getValue()).enable;
    }

    public static final class AutofillPrefillConfig {

        @C09CT("banner_show_frequency")
        public final long bannerShowFrequency;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("learn_more_link")
        public final String learnMoreLink;

        public AutofillPrefillConfig() {
            this(false, 0L, "");
        }

        public AutofillPrefillConfig(boolean z, long j, String str) {
            this.enable = z;
            this.bannerShowFrequency = j;
            this.learnMoreLink = str;
        }
    }
}
