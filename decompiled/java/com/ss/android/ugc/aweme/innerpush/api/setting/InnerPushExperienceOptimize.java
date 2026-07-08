package com.ss.android.ugc.aweme.innerpush.api.setting;

import X.C01GW;
import X.C09CT;
import X.C1EE8;
import X.C1EE9;
import X.C1EEA;
import X.C1EEB;
import X.C1EEC;
import X.C1EED;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class InnerPushExperienceOptimize {
    public static final Config LIZ = new Config(0, 1, false, 180, new int[0], new int[0], false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1EED());
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(220));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1EE9());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1EEC());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1EEB());
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(218));
    public static final C01GW LJII = C452501pT.LIZIZ(new C1EE8());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(219));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C1EEA());

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static final class Config {

        @C09CT("social_push_avoid_inbox")
        public final int[] avoidInbox;

        @C09CT("dedup_for_friend_post_story")
        public final boolean dedupForStoryPost;

        @C09CT("disable_warm_hot_pull")
        public final boolean disableWarmHotStartPull;

        @C09CT("enable")
        public final int enable;

        @C09CT("exp_value")
        public final int expVal;

        @C09CT("social_push_only_in_feed")
        public final int[] onlyInFeed;

        @C09CT("pull_avoid_dm")
        public final boolean pullAvoidDm;

        @C09CT("pull_delay_by_dm")
        public final int pullDelayByDm;

        public Config() {
            this(0, 1, false, 180, new int[0], new int[0], false, false);
        }

        public Config(int i, int i2, boolean z, int i3, int[] iArr, int[] iArr2, boolean z2, boolean z3) {
            this.enable = i;
            this.expVal = i2;
            this.pullAvoidDm = z;
            this.pullDelayByDm = i3;
            this.avoidInbox = iArr;
            this.onlyInFeed = iArr2;
            this.disableWarmHotStartPull = z2;
            this.dedupForStoryPost = z3;
        }
    }
}
