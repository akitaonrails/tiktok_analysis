package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes36.dex */
public final class ColdCacheRevertStrategyConfig {

    @C09CT("after_first_brush_ms")
    public final int afterFirstBrushMs;

    @C09CT("all_revert")
    public final boolean allRevert;

    @C09CT("enable_exp")
    public final boolean enableExp;

    @C09CT("event_report")
    public final boolean eventReport;

    @C09CT("include_ad")
    public final boolean includeAd;

    @C09CT("include_gmv")
    public final boolean includeGmv;

    @C09CT("include_live")
    public final boolean includeLive;

    @C09CT("judgment_nums")
    public final int judgmentNums;

    @C09CT("net_video_download_percent")
    public final float netVideoDownloadPercent;

    @C09CT("preload_size")
    public final int preloadSizeKB;

    @C09CT("re_prerender")
    public final boolean rePrerender;

    @C09CT("revert_probability")
    public final float revertProbability;

    @C09CT("revert_probability_ad")
    public final float revertProbabilityAd;

    @C09CT("revert_probability_ecom")
    public final float revertProbabilityEcom;

    @C09CT("revert_probability_fix")
    public final boolean revertProbabilityFix;

    @C09CT("revert_probability_live")
    public final float revertProbabilityLive;

    public ColdCacheRevertStrategyConfig() {
        this(false, 3, false, false, false, false, -1.0f, false, -1.0f, -1.0f, -1.0f, -1, -1.0f, false, false, LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public ColdCacheRevertStrategyConfig(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, float f, boolean z6, float f2, float f3, float f4, int i2, float f5, boolean z7, boolean z8, int i3) {
        this.enableExp = z;
        this.judgmentNums = i;
        this.allRevert = z2;
        this.includeLive = z3;
        this.includeGmv = z4;
        this.includeAd = z5;
        this.revertProbability = f;
        this.revertProbabilityFix = z6;
        this.revertProbabilityLive = f2;
        this.revertProbabilityEcom = f3;
        this.revertProbabilityAd = f4;
        this.afterFirstBrushMs = i2;
        this.netVideoDownloadPercent = f5;
        this.rePrerender = z7;
        this.eventReport = z8;
        this.preloadSizeKB = i3;
    }
}
