package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes19.dex */
public final class LivePreviewBgConfig {

    @C09CT("bg_disappear_duration")
    public final long bgDisappearDuration;

    @C09CT("enable_bg_anim")
    public final boolean enableBgAnim;

    @C09CT("enable_margin_bar")
    public final boolean enableMarginBar;

    @C09CT("enable_max_score")
    public float maxScore;

    @C09CT("enable_min_score")
    public float minScore;

    public LivePreviewBgConfig() {
        this(false, 0.0f, Float.MAX_VALUE, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePreviewBgConfig)) {
            return false;
        }
        LivePreviewBgConfig livePreviewBgConfig = (LivePreviewBgConfig) obj;
        return this.enableBgAnim == livePreviewBgConfig.enableBgAnim && Float.compare(this.minScore, livePreviewBgConfig.minScore) == 0 && Float.compare(this.maxScore, livePreviewBgConfig.maxScore) == 0 && this.bgDisappearDuration == livePreviewBgConfig.bgDisappearDuration && this.enableMarginBar == livePreviewBgConfig.enableMarginBar;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePreviewBgConfig(enableBgAnim=");
        sbLIZ.append(this.enableBgAnim);
        sbLIZ.append(", minScore=");
        sbLIZ.append(this.minScore);
        sbLIZ.append(", maxScore=");
        sbLIZ.append(this.maxScore);
        sbLIZ.append(", bgDisappearDuration=");
        sbLIZ.append(this.bgDisappearDuration);
        sbLIZ.append(", enableMarginBar=");
        sbLIZ.append(this.enableMarginBar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.enableBgAnim) * 31) + Float.floatToIntBits(this.minScore)) * 31) + Float.floatToIntBits(this.maxScore)) * 31) + C786410Ut5.Y2(this.bgDisappearDuration)) * 31) + C786410Ut5.Z2(this.enableMarginBar);
    }

    public LivePreviewBgConfig(boolean z, float f, float f2, long j, boolean z2) {
        this.enableBgAnim = z;
        this.minScore = f;
        this.maxScore = f2;
        this.bgDisappearDuration = j;
        this.enableMarginBar = z2;
    }
}
