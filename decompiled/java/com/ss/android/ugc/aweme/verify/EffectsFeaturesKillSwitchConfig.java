package com.ss.android.ugc.aweme.verify;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectsFeaturesKillSwitchConfig {
    public static final DisableConfig LIZ = new DisableConfig(false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(260));

    public static final class DisableConfig {

        @C09CT("disable_effect_warning_feature")
        public final boolean effectWarningFeature;

        public DisableConfig() {
            this(false);
        }

        public DisableConfig(boolean z) {
            this.effectWarningFeature = z;
        }
    }
}
