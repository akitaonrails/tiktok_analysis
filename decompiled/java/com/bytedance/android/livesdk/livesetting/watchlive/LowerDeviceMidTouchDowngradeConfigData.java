package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LowerDeviceMidTouchDowngradeConfigData {
    public static final TypeAdapter ADAPTER = new LowerDeviceMidTouchDowngradeConfigData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_time_for_mid_touch")
    public long delayTimeForMidTouch;

    @C09CT("disable_animation_for_preview_card")
    public boolean disableAnimationForPreviewCard;

    @C09CT("global_switch_for_downgrade")
    public boolean globalSwitchForDowngrade;

    @C09CT("start_delay_when_interaction_ready")
    public boolean startDelayWhenInteractionReady;

    public LowerDeviceMidTouchDowngradeConfigData() {
        this(false, true, 0L, false);
    }

    public LowerDeviceMidTouchDowngradeConfigData(boolean z, boolean z2, long j, boolean z3) {
        this.globalSwitchForDowngrade = z;
        this.startDelayWhenInteractionReady = z2;
        this.delayTimeForMidTouch = j;
        this.disableAnimationForPreviewCard = z3;
    }
}
