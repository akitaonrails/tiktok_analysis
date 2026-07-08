package com.ss.android.ugc.feed.platform.monitor.infra;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C08CX;
import X.C093Y;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class FeedVisibilityOptConfig {
    public static Boolean LIZ;
    public static Boolean LIZIZ;
    public static Boolean LIZJ;
    public static final FeedVisibilityErrorBean LIZLLL = new FeedVisibilityErrorBean(null, null, null, null, 0, 0, 0, 0, false, 0, null, null, null, 8191, null);
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(301));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(304));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(305));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(303));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(307));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(308));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(310));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(309));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(313));
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(306));
    public static final C01GW LJIILL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(312));
    public static final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(311));
    public static final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(302));

    public static boolean LIZ() {
        int iIntValue = ((Number) LJIIIZ.getValue()).intValue();
        if (LIZ == null) {
            LIZ = Boolean.valueOf(AbstractC19994813Le.Default.nextDouble() < 1.0d / ((double) iIntValue));
        }
        Boolean bool = LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZIZ() {
        int iIntValue = ((Number) LJIIJ.getValue()).intValue();
        if (LIZJ == null) {
            LIZJ = Boolean.valueOf(AbstractC19994813Le.Default.nextDouble() < 1.0d / ((double) iIntValue));
        }
        Boolean bool = LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZJ() {
        if (LIZIZ == null) {
            LIZIZ = Boolean.valueOf(AbstractC19994813Le.Default.nextDouble() < 1.0d / ((double) ((Number) LJIIJJI.getValue()).intValue()));
        }
        Boolean bool = LIZIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int LIZLLL() {
        return ((Number) LJIILIIL.getValue()).intValue();
    }

    public static final FeedVisibilityErrorBean LJ() {
        return (FeedVisibilityErrorBean) LJ.getValue();
    }

    public static final class FeedVisibilityErrorBean {

        @C09CT("check_version")
        public final int checkVersion;

        @C09CT("enable_check_comp_prefix")
        public final Set<String> enableCheckCompPrefix;

        @C09CT("enable_check_type_set")
        public final Set<Integer> enableCheckerType;

        @C09CT("enable_feed_type_set")
        public final Set<Integer> enableFeedType;

        @C09CT("enable_page_type_set")
        public final Set<Integer> enablePageType;

        @C09CT("enable_refactor_new_key")
        public final boolean enableRefactorNewKey;

        @C09CT("enable_tab_check_type_set")
        public final Set<Integer> enableTabCheckerType;

        @C09CT("sample_mob_fail")
        public final int sampleMobFail;

        @C09CT("sample_mob_fail_tab")
        public final int sampleMobFailTab;

        @C09CT("sample_mob_risk")
        public final int sampleMobRisk;

        @C09CT("skip_comp_keyword")
        public final Set<String> skipCompKeyword;

        @C09CT("skip_must_show_keyword")
        public final Set<String> skipMustShowKeyword;

        @C09CT("time_to_scroll_end_stable")
        public final long timeToScrollEndStable;

        public FeedVisibilityErrorBean() {
            this(null, null, null, null, 0, 0, 0, 0L, false, 0, null, null, null, 8191, null);
        }

        public FeedVisibilityErrorBean(Set<Integer> set, Set<Integer> set2, Set<Integer> set3, Set<Integer> set4, int i, int i2, int i3, long j, boolean z, int i4, Set<String> set5, Set<String> set6, Set<String> set7) {
            this.enableFeedType = set;
            this.enablePageType = set2;
            this.enableCheckerType = set3;
            this.enableTabCheckerType = set4;
            this.sampleMobFail = i;
            this.sampleMobRisk = i2;
            this.sampleMobFailTab = i3;
            this.timeToScrollEndStable = j;
            this.enableRefactorNewKey = z;
            this.checkVersion = i4;
            this.skipMustShowKeyword = set5;
            this.skipCompKeyword = set6;
            this.enableCheckCompPrefix = set7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FeedVisibilityErrorBean(Set set, Set set2, Set set3, Set set4, int i, int i2, int i3, long j, boolean z, int i4, Set set5, Set set6, Set set7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            Set set8 = set6;
            Set set9 = set5;
            boolean z2 = z;
            long j2 = j;
            int i6 = i2;
            int i7 = i;
            Set set10 = set4;
            Set set11 = set7;
            Set set12 = set3;
            Set set13 = set2;
            this((i5 & 1) != 0 ? Collections.singleton(0) : set, (i5 & 2) != 0 ? Collections.singleton(0) : set13, (i5 & 4) != 0 ? C08CX.INSTANCE : set12, (i5 & 8) != 0 ? C08CX.INSTANCE : set10, (i5 & 16) != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : i7, (i5 & 32) != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : i6, (i5 & 64) == 0 ? i3 : LSPassThroughRecordSizeConfig.DEFAULT, (i5 & 128) != 0 ? 2000L : j2, (i5 & 256) != 0 ? false : z2, (i5 & 512) == 0 ? i4 : 0, (i5 & 1024) != 0 ? C093Y.LJ("Search_1/8") : set9, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new LinkedHashSet() : set8, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C093Y.LJ("left_container_cla_caption", "bottom_button", "high_tag", "anchor", "bottom_banner") : set11);
        }
    }
}
