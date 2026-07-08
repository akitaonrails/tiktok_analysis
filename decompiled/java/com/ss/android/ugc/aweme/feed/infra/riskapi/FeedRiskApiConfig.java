package com.ss.android.ugc.aweme.feed.infra.riskapi;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C13LQ;
import X.C1697810uHb;
import X.C452501pT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes34.dex */
public final class FeedRiskApiConfig {
    public static Boolean LIZ;
    public static Boolean LIZIZ;
    public static Boolean LIZJ;
    public static Boolean LIZLLL;
    public static final FeedRiskApiConfigBean LJ = new FeedRiskApiConfigBean(false, null, null, 0, 0, false, 0, 0, null, null, 0, null, 0, 0, 16383, null);
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(305));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(317));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(312));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(313));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(311));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(314));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(304));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(310));
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(316));
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(315));
    public static final C01GW LJIILL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(306));
    public static final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(307));
    public static final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(308));
    public static final C01GW LJIJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(309));

    public static final FeedRiskApiConfigBean LIZ() {
        return (FeedRiskApiConfigBean) LJFF.getValue();
    }

    public static boolean LIZIZ() {
        if (LIZ == null) {
            LIZ = Boolean.valueOf(AbstractC19994813Le.Default.nextDouble() < 1.0d / ((double) ((Number) LJII.getValue()).intValue()));
        }
        Boolean bool = LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final class FeedRiskApiConfigBean {

        @C09CT("alpha_check_enums")
        public final List<Float> alphaCheckEnums;

        @C09CT("disable_channel")
        public final int disableChannel;

        @C09CT("dynamic_token_v2_prefix")
        public final Set<String> dynamicTokenIdList;

        @C09CT("dynamic_token_v2_sample")
        public final int dynamicTokenSample;

        @C09CT("empty_token_v2_prefix")
        public final Set<String> emptyTokenIdList;

        @C09CT("empty_token_v2_sample")
        public final int emptyTokenSample;

        @C09CT("enable_release_stack")
        public final boolean enableReleaseStack;

        @C09CT("enable_stack_collect")
        public final boolean enableStackCollect;

        @C09CT("sample_stack_for_debug")
        public final int sampleStack;

        @C09CT("sample_stack_for_release")
        public final int sampleStackRelease;

        @C09CT("stack_break_key_workd")
        public final Set<String> stackBreakKeyWord;

        @C09CT("stack_max")
        public final int stackMaxNumber;

        @C09CT("stack_skip")
        public final int stackSkipNumber;

        @C09CT("visiblity_check_enums")
        public final List<Integer> visiblityCheckEnums;

        public FeedRiskApiConfigBean() {
            this(false, null, null, 0, 0, false, 0, 0, null, null, 0, null, 0, 0, 16383, null);
        }

        public FeedRiskApiConfigBean(boolean z, List<Integer> list, List<Float> list2, int i, int i2, boolean z2, int i3, int i4, Set<String> set, Set<String> set2, int i5, Set<String> set3, int i6, int i7) {
            this.enableStackCollect = z;
            this.visiblityCheckEnums = list;
            this.alphaCheckEnums = list2;
            this.sampleStack = i;
            this.sampleStackRelease = i2;
            this.enableReleaseStack = z2;
            this.stackSkipNumber = i3;
            this.stackMaxNumber = i4;
            this.stackBreakKeyWord = set;
            this.dynamicTokenIdList = set2;
            this.dynamicTokenSample = i5;
            this.emptyTokenIdList = set3;
            this.emptyTokenSample = i6;
            this.disableChannel = i7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FeedRiskApiConfigBean(boolean z, List list, List list2, int i, int i2, boolean z2, int i3, int i4, Set set, Set set2, int i5, Set set3, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            Set set4 = set3;
            int i9 = i5;
            Set set5 = set2;
            Set set6 = set;
            int i10 = i4;
            int i11 = i3;
            boolean z3 = z2;
            int i12 = i2;
            int i13 = i;
            List list3 = list2;
            List list4 = list;
            this((i8 & 1) != 0 ? false : z, (i8 & 2) != 0 ? C1697810uHb.LJIIJJI(8, 4) : list4, (i8 & 4) != 0 ? Collections.singletonList(Float.valueOf(0.0f)) : list3, (i8 & 8) != 0 ? 100 : i13, (i8 & 16) != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : i12, (i8 & 32) != 0 ? false : z3, (i8 & 64) != 0 ? 6 : i11, (i8 & 128) != 0 ? 10 : i10, (i8 & 256) != 0 ? C13LQ.LJLIIL(new String[]{"android.os.Handler", "VerticalViewPager", "VideoViewCellRootView"}) : set6, (i8 & 512) != 0 ? C08CX.INSTANCE : set5, (i8 & 1024) != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : i9, (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C08CX.INSTANCE : set4, (i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? i6 : LSPassThroughRecordSizeConfig.DEFAULT, (i8 & 8192) == 0 ? i7 : 0);
        }
    }
}
