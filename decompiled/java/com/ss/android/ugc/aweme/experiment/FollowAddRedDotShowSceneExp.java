package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C1E9L;
import X.C1E9M;
import X.C1E9N;
import X.C1E9O;
import X.C452501pT;

/* JADX INFO: loaded from: classes36.dex */
public final class FollowAddRedDotShowSceneExp {
    public static final Config LIZ = new Config(false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1E9O());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1E9N());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1E9M());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1E9L());

    public static final class Config {

        @C09CT("enable_back_from_follow_list_scene")
        public final boolean enableBackFromFollowListScene;

        @C09CT("enable_back_from_profile_page_scene")
        public final boolean enableBackFromProfilePageScene;

        @C09CT("enable_new_follow_scene")
        public final boolean enableNewFollowScene;

        public Config() {
            this(false, false, false);
        }

        public Config(boolean z, boolean z2, boolean z3) {
            this.enableNewFollowScene = z;
            this.enableBackFromProfilePageScene = z2;
            this.enableBackFromFollowListScene = z3;
        }
    }
}
