package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LowerDeviceShortTouchDowngradeConfigData {
    public static final TypeAdapter ADAPTER = new LowerDeviceShortTouchDowngradeConfigData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_time_for_short_touch")
    public long delayTimeForShortTouch;

    @C09CT("disable_animation_for_short_touch")
    public boolean disableAnimationForShortTouch;

    @C09CT("global_switch_for_downgrade")
    public boolean globalSwitchForDowngrade;

    @C09CT("start_delay_when_interaction_ready")
    public boolean startDelayWhenInteractionReady;

    @C09CT("sub_switch_for_short_touch")
    public int subSwitchForShortTouch;

    public LowerDeviceShortTouchDowngradeConfigData() {
        this(false, true, 0L, false, 0);
    }

    public LowerDeviceShortTouchDowngradeConfigData(boolean z, boolean z2, long j, boolean z3, int i) {
        this.globalSwitchForDowngrade = z;
        this.startDelayWhenInteractionReady = z2;
        this.delayTimeForShortTouch = j;
        this.disableAnimationForShortTouch = z3;
        this.subSwitchForShortTouch = i;
    }
}
