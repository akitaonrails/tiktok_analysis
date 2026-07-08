package com.ss.android.ugc.aweme.ad.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AdShadowMaskData implements Serializable {

    @C09CT("enable_modify_mask_alpha")
    public final boolean enableModifyMaskAlpha;

    @C09CT("normal_bottom_mask_alpha_android")
    public final float normalBottomMaskAlpha;

    public AdShadowMaskData() {
        this(false, 0.0f);
    }

    public AdShadowMaskData(boolean z, float f) {
        this.enableModifyMaskAlpha = z;
        this.normalBottomMaskAlpha = f;
    }
}
