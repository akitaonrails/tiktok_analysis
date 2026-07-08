package com.ss.android.ugc.aweme.ad.preload.prewarm;

import X.C01GW;
import X.C09CT;
import X.C1037010d5n;
import X.C452501pT;
import X.EnumC1016770cZ9;
import com.ss.android.ugc.aweme.settings.WebViewPortraitConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class LandPageWarmExperiment {
    public static final LandPageWarmConfig LIZ;
    public static final C01GW LIZIZ;

    static {
        new LandPageWarmConfig(true, true, "", false, null, 0, 0L, false, false, null);
        LIZ = new LandPageWarmConfig(false, false, "", false, null, 0, 0L, false, false, null);
        LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(95));
    }

    public static final LandPageWarmConfig LIZIZ() {
        return (LandPageWarmConfig) LIZIZ.getValue();
    }

    public static long LIZ() {
        if (LIZIZ().forcePrewarmInAdAwemeTimingLowEnd <= 0) {
            return 0L;
        }
        C1037010d5n.LIZ.getClass();
        if (C1037010d5n.LJIILIIL == EnumC1016770cZ9.LOW_END) {
            return LIZIZ().forcePrewarmInAdAwemeTimingLowEnd;
        }
        return 0L;
    }

    public static final class IABExtraCreateWebviewConfig {

        @C09CT("ea")
        public final List<Long> ea;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("interval")
        public final long interval;

        @C09CT("type")
        public final int type;

        public IABExtraCreateWebviewConfig(boolean z, long j, List<Long> list, int i) {
            this.enable = z;
            this.interval = j;
            this.ea = list;
            this.type = i;
        }
    }

    public static final class LandPageWarmConfig {

        @C09CT("enable_prewarm_first_party")
        public final boolean enablePreWarmFirstParty;

        @C09CT("enable_prewarm_third_party")
        public final boolean enablePreWarmThirdParty;

        @C09CT("extra_create_webview_config")
        public final IABExtraCreateWebviewConfig extraCreateWebviewConfig;

        @C09CT("force_prewarm_in_ad_aweme_timing_low_end")
        public final long forcePrewarmInAdAwemeTimingLowEnd;

        @C09CT("android_tt_hybrid_commerce_14d")
        public final int hybridCommerce14d;

        @C09CT("only_prewarm_in_ad_aweme_low_end")
        public final boolean onlyPreWarmInAdAwemeLowEnd;

        @C09CT("pack_fix_device_score_unknown")
        public final boolean packFixDeviceScoreUnknown;

        @C09CT("portrait_config")
        public final WebViewPortraitConfig.WebViewPortraitConfigModel portraitConfig;

        @C09CT("portrait_tag")
        public final String portraitTag;

        @C09CT("wait_for_webview_create")
        public final boolean waitForWebviewCreate;

        public LandPageWarmConfig() {
            this(false, false, "", false, null, 0, 0L, false, false, null);
        }

        public LandPageWarmConfig(boolean z, boolean z2, String str, boolean z3, WebViewPortraitConfig.WebViewPortraitConfigModel webViewPortraitConfigModel, int i, long j, boolean z4, boolean z5, IABExtraCreateWebviewConfig iABExtraCreateWebviewConfig) {
            this.enablePreWarmFirstParty = z;
            this.enablePreWarmThirdParty = z2;
            this.portraitTag = str;
            this.waitForWebviewCreate = z3;
            this.portraitConfig = webViewPortraitConfigModel;
            this.hybridCommerce14d = i;
            this.forcePrewarmInAdAwemeTimingLowEnd = j;
            this.onlyPreWarmInAdAwemeLowEnd = z4;
            this.packFixDeviceScoreUnknown = z5;
            this.extraCreateWebviewConfig = iABExtraCreateWebviewConfig;
        }
    }
}
