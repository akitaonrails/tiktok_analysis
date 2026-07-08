package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C01GW;
import X.C09CT;
import X.C1514430pVp;
import X.C452501pT;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class GuideOutPushUGNewExp {
    public static final UgNewConfig LIZ = new UgNewConfig(false, false, false, false, false, false, false, -1, -1, false, 4, 3, 7, false, 14, 4, 3, 7);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(280));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(274));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(275));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(277));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(272));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(273));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(276));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(271));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(279));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(287));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(286));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(289));
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(278));
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(288));
    public static final C01GW LJIILL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(282));
    public static final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(285));
    public static final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(284));
    public static final C01GW LJIJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(281));
    public static final C01GW LJIJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(283));

    public static boolean LIZ() {
        return ((Boolean) LJFF.getValue()).booleanValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    public static int LIZJ() {
        return ((Number) LJIILIIL.getValue()).intValue();
    }

    public static UgNewConfig LIZLLL() {
        return (UgNewConfig) LIZIZ.getValue();
    }

    public static int LJ() {
        return ((Number) LJIJ.getValue()).intValue();
    }

    public static int LJFF() {
        return ((Number) LJIJI.getValue()).intValue();
    }

    public static int LJI() {
        return ((Number) LJIIZILJ.getValue()).intValue();
    }

    public static int LJII() {
        return ((Number) LJIILJJIL.getValue()).intValue();
    }

    public static int LJIIIIZZ() {
        return ((Number) LJIIL.getValue()).intValue();
    }

    public static boolean LJIIIZ() {
        return System.currentTimeMillis() - C1514430pVp.LIZ() < ((long) ((Number) LJIILLIIL.getValue()).intValue()) * TimeUnit.DAYS.toMillis(1L);
    }

    public static final class UgNewConfig {

        @C09CT("add_scene_cold_boot")
        public final boolean addSceneColdBoot;

        @C09CT("add_scene_copy_link")
        public final boolean addSceneCopyLink;

        @C09CT("add_scene_download")
        public final boolean addSceneDownload;

        @C09CT("add_scene_feed_vv_enough")
        public final boolean addSceneFeedVV;

        @C09CT("add_scene_like")
        public final boolean addSceneLike;

        @C09CT("add_scene_search")
        public final boolean addSceneSearch;

        @C09CT("add_scene_share_out_app")
        public final boolean addSceneShareOut;

        @C09CT("close_time_limit")
        public final int closeTimesLimit;

        @C09CT("cold_boot_freq_ctrl_in_days")
        public final int coldBootFreqInDays;

        @C09CT("new_user_close_time_limit")
        public final int nuCloseTimesLimit;

        @C09CT("new_user_different_frequency")
        public final boolean nuDifferentFreq;

        @C09CT("new_user_show_up_after_3times_interval")
        public final int nuShowUpAfter3TimesInterval;

        @C09CT("new_user_show_up_interval")
        public final int nuShowUpInterval;

        @C09CT("new_user_activate_days")
        public final int nuThreshold;

        @C09CT("need_override_freq")
        public final boolean overrideFrequency;

        @C09CT("show_new_scene_interval_in_min")
        public final int showNewSceneIntervalInMin;

        @C09CT("show_up_after_3times_interval")
        public final int showUpAfter3TimesInterval;

        @C09CT("show_up_interval")
        public final int showUpInterval;

        public UgNewConfig() {
            this(false, false, false, false, false, false, false, -1, -1, false, 4, 3, 7, false, 14, 4, 3, 7);
        }

        public UgNewConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, boolean z8, int i3, int i4, int i5, boolean z9, int i6, int i7, int i8, int i9) {
            this.addSceneFeedVV = z;
            this.addSceneLike = z2;
            this.addSceneShareOut = z3;
            this.addSceneCopyLink = z4;
            this.addSceneDownload = z5;
            this.addSceneSearch = z6;
            this.addSceneColdBoot = z7;
            this.coldBootFreqInDays = i;
            this.showNewSceneIntervalInMin = i2;
            this.overrideFrequency = z8;
            this.showUpInterval = i3;
            this.closeTimesLimit = i4;
            this.showUpAfter3TimesInterval = i5;
            this.nuDifferentFreq = z9;
            this.nuThreshold = i6;
            this.nuShowUpInterval = i7;
            this.nuCloseTimesLimit = i8;
            this.nuShowUpAfter3TimesInterval = i9;
        }
    }
}
