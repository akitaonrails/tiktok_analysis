package com.ss.android.ugc.aweme.social.creation.api.edit.exp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class SocialEffectNotificationExp {
    public static final Config LIZ = new Config(0, 0, 0, 15);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final int LIZLLL;
    public static final boolean LJ;
    public static final int LJFF;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(192));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((Config) c01gwLIZIZ.getValue()).socialEffectEnabled > 0;
        LIZLLL = ((Config) c01gwLIZIZ.getValue()).socialEffectFriendThreshold;
        LJ = ((Config) c01gwLIZIZ.getValue()).socialEffectSkipFreq > 0;
        LJFF = ((Config) c01gwLIZIZ.getValue()).graphNodesCount;
    }

    public static final class Config {

        @C09CT("graph_nodes_count")
        public final int graphNodesCount;

        @C09CT("social_effect_enabled")
        public final int socialEffectEnabled;

        @C09CT("social_effect_friend_threshold")
        public final int socialEffectFriendThreshold;

        @C09CT("social_effect_popup_skip_freq")
        public final int socialEffectSkipFreq;

        public Config() {
            this(0, 0, 0, 15);
        }

        public Config(int i, int i2, int i3, int i4) {
            this.socialEffectEnabled = i;
            this.socialEffectFriendThreshold = i2;
            this.socialEffectSkipFreq = i3;
            this.graphNodesCount = i4;
        }
    }
}
