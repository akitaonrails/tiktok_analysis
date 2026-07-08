package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedTouchProtectionExperiment {
    public static final TouchProtectionModel LIZ = new TouchProtectionModel(false, false);
    public static TouchProtectionModel LIZIZ;

    public static boolean LIZ() {
        if (LIZIZ == null) {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            TouchProtectionModel touchProtectionModel = LIZ;
            TouchProtectionModel touchProtectionModel2 = (TouchProtectionModel) c0c64LJIILLIIL.LJJII(TouchProtectionModel.class, touchProtectionModel, "touch_protection_configuration", true);
            if (touchProtectionModel2 != null) {
                touchProtectionModel = touchProtectionModel2;
            }
            LIZIZ = touchProtectionModel;
        }
        TouchProtectionModel touchProtectionModel3 = LIZIZ;
        if (touchProtectionModel3 != null) {
            return touchProtectionModel3.enableTouchProtection || touchProtectionModel3.enableLeftInteraction;
        }
        return false;
    }

    public static final class TouchProtectionModel {

        @C09CT("enable_left_interaction")
        public final boolean enableLeftInteraction;

        @C09CT("enable_touch_protection")
        public final boolean enableTouchProtection;

        public TouchProtectionModel(boolean z, boolean z2) {
            this.enableTouchProtection = z;
            this.enableLeftInteraction = z2;
        }
    }
}
