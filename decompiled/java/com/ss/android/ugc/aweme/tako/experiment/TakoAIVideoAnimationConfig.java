package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class TakoAIVideoAnimationConfig {

    @C09CT("animation_blur_size")
    public final int animationBlurSize;

    @C09CT("animation_draw_interval")
    public final int animationDrawInterval;

    @C09CT("enable_optimized_wave_effect")
    public final boolean enableOptimizedWaveEffect;

    public TakoAIVideoAnimationConfig() {
        this(4, true, 16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoAIVideoAnimationConfig)) {
            return false;
        }
        TakoAIVideoAnimationConfig takoAIVideoAnimationConfig = (TakoAIVideoAnimationConfig) obj;
        return this.animationDrawInterval == takoAIVideoAnimationConfig.animationDrawInterval && this.enableOptimizedWaveEffect == takoAIVideoAnimationConfig.enableOptimizedWaveEffect && this.animationBlurSize == takoAIVideoAnimationConfig.animationBlurSize;
    }

    public final int hashCode() {
        return (((this.animationDrawInterval * 31) + C786410Ut5.Z2(this.enableOptimizedWaveEffect)) * 31) + this.animationBlurSize;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAIVideoAnimationConfig(animationDrawInterval=");
        sbLIZ.append(this.animationDrawInterval);
        sbLIZ.append(", enableOptimizedWaveEffect=");
        sbLIZ.append(this.enableOptimizedWaveEffect);
        sbLIZ.append(", animationBlurSize=");
        sbLIZ.append(this.animationBlurSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoAIVideoAnimationConfig(int i, boolean z, int i2) {
        this.animationDrawInterval = i;
        this.enableOptimizedWaveEffect = z;
        this.animationBlurSize = i2;
    }
}
