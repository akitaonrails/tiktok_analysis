package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class GiftComboInfo {

    @C09CT("combo_count")
    public Integer comboCount;

    @C09CT("combo_effect_img")
    public ImageModel comboEffectImg;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.comboCount != null) {
            sb.append(", combo_count=");
            sb.append(this.comboCount);
        }
        if (this.comboEffectImg != null) {
            sb.append(", combo_effect_img=");
            sb.append(this.comboEffectImg);
        }
        sb.replace(0, 2, "GiftComboInfo{");
        sb.append('}');
        return sb.toString();
    }
}
