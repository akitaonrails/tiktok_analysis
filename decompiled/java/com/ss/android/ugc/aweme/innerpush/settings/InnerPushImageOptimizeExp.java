package com.ss.android.ugc.aweme.innerpush.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class InnerPushImageOptimizeExp {
    public static final Config LIZ = new Config(false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(230));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(232));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(231));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(233));

    public static final class Config {

        @C09CT("use_local_avatar_icon")
        public final boolean useLocalAvatarIcon;

        @C09CT("use_local_contact_user_avatar")
        public final boolean useLocalContactUserAvatar;

        @C09CT("use_profile_view_icon")
        public final boolean useProfileViewIcon;

        public Config() {
            this(false, false, false);
        }

        public Config(boolean z, boolean z2, boolean z3) {
            this.useLocalContactUserAvatar = z;
            this.useLocalAvatarIcon = z2;
            this.useProfileViewIcon = z3;
        }
    }
}
