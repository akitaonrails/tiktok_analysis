package com.ss.android.ugc.aweme.socialavatar.api;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class SocialAvatarAddFlashToCreationExperiment {
    public static final SocialAvatarAddFlashToCreationExperiment LIZ = new SocialAvatarAddFlashToCreationExperiment();
    public static final SocialAvatarFlashConfig LIZIZ = new SocialAvatarFlashConfig(true, false, 8.0f, 0.75d);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(266));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(265));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(263));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(262));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(264));

    public static boolean LIZ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    public static final class SocialAvatarFlashConfig {

        @C09CT("android_threshold")
        public final float androidThreshold;

        @C09CT("auto_flash_enabled")
        public final boolean autoFlashEnabled;

        @C09CT("brightness")
        public final double brightness;

        @C09CT("enabled")
        public final boolean flashEnabled;

        public SocialAvatarFlashConfig(boolean z, boolean z2, float f, double d) {
            this.flashEnabled = z;
            this.autoFlashEnabled = z2;
            this.androidThreshold = f;
            this.brightness = d;
        }
    }
}
