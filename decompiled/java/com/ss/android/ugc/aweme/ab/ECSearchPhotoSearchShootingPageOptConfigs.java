package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C285810BId;
import X.C452501pT;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ECSearchPhotoSearchShootingPageOptConfigs {
    public static final ShootingPageOptConfig LIZ = new ShootingPageOptConfig(false, false, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(72));

    public static boolean LIZ() {
        return C285810BId.LIZ() || ((ShootingPageOptConfig) LIZIZ.getValue()).alwaysShowExtendAlbum;
    }

    public static boolean LIZIZ() {
        return C285810BId.LIZ() || ((ShootingPageOptConfig) LIZIZ.getValue()).showCameraUIWithoutPermission;
    }

    public static boolean LIZJ() {
        return C285810BId.LIZ() || ((ShootingPageOptConfig) LIZIZ.getValue()).showLimitAccess;
    }

    public static final class ShootingPageOptConfig {

        @C09CT("always_show_extend_album")
        public final boolean alwaysShowExtendAlbum;

        @C09CT("new_user_guide_opt")
        public final boolean newUserGuideOpt;

        @C09CT("show_bottom_tips_text")
        public final boolean showBottomText;

        @C09CT("show_camera_ui_without_permission")
        public final boolean showCameraUIWithoutPermission;

        @C09CT("show_limit_access")
        public final boolean showLimitAccess;

        public ShootingPageOptConfig() {
            this(false, false, false, false, false);
        }

        public ShootingPageOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.alwaysShowExtendAlbum = z;
            this.newUserGuideOpt = z2;
            this.showLimitAccess = z3;
            this.showBottomText = z4;
            this.showCameraUIWithoutPermission = z5;
        }
    }
}
