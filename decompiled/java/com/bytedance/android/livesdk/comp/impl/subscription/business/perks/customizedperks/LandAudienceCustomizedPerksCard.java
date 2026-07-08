package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class LandAudienceCustomizedPerksCard extends AudienceCustomizedPerksCard {
    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.AudienceCustomizedPerksCard
    public final void I1() {
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2k;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.AudienceCustomizedPerksCard, com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.CustomizedPerksCardWidget, com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
