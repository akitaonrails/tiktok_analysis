package com.bytedance.android.livesdk.firstrecharge;

import X.C09CT;
import com.bytedance.android.livesdk.wallet.Diamond;

/* JADX INFO: loaded from: classes.dex */
public final class FirstChargeData {

    @C09CT("default_diamond")
    public Diamond diamond;

    @C09CT("first_charge_gift_style")
    public int giftShowStyle = 1;

    @C09CT("is_first_charge")
    public boolean isFirstCharge;

    @C09CT("guide_effect_rule")
    public FirstChargeGuideEffectRule rule;
}
