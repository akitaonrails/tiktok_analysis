package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartSocialRecUserPopupConfig extends SmartSceneConfig {

    @C09CT("block_days")
    public int blockDays;

    @C09CT("enable_smart_model")
    public boolean enableSmartModel;

    @C09CT("gt_4s_score_lower_bound")
    public float gt4sScoreLowerBound;

    public SmartSocialRecUserPopupConfig() {
        setScene("social_smart_rec_popup_freq_control");
        this.gt4sScoreLowerBound = 0.5f;
        this.blockDays = 30;
    }

    public final int getBlockDays() {
        return this.blockDays;
    }

    public final boolean getEnableSmartModel() {
        return this.enableSmartModel;
    }

    public final float getGt4sScoreLowerBound() {
        return this.gt4sScoreLowerBound;
    }

    public final void setBlockDays(int i) {
        this.blockDays = i;
    }

    public final void setEnableSmartModel(boolean z) {
        this.enableSmartModel = z;
    }

    public final void setGt4sScoreLowerBound(float f) {
        this.gt4sScoreLowerBound = f;
    }
}
