package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class IABLoadingFormatOptConfigExp {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(293));

    public static IABLoadingFormatOptConfig LIZ() {
        return (IABLoadingFormatOptConfig) LIZ.getValue();
    }

    public static final class IABLoadingFormatOptConfig {

        @C09CT("all_fallback_icon")
        public final boolean allFallbackIcon;

        @C09CT("dismiss_delay_time")
        public final long dismissDelayTime;

        @C09CT("enable_click_dismiss")
        public final boolean enableClickDismiss;

        @C09CT("opt_dismiss_timing")
        public final boolean optDismissTiming;

        @C09CT("opt_icon")
        public final boolean optIcon;

        public IABLoadingFormatOptConfig() {
            this(false, false, false, 0L, false);
        }

        public IABLoadingFormatOptConfig(boolean z, boolean z2, boolean z3, long j, boolean z4) {
            this.optIcon = z;
            this.optDismissTiming = z2;
            this.enableClickDismiss = z3;
            this.dismissDelayTime = j;
            this.allFallbackIcon = z4;
        }
    }
}
