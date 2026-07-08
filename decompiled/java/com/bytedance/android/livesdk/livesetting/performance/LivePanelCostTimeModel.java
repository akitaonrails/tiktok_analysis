package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePanelCostTimeModel {
    public static final TypeAdapter ADAPTER = new LivePanelCostTimeModel_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_sdk_panel_open_cost_times_limit_duration")
    public int mLimitDuration;

    @C09CT("live_sdk_panel_open_cost_times_switch")
    public boolean mSwitch;

    public LivePanelCostTimeModel() {
        this(true, 3);
    }

    public LivePanelCostTimeModel(boolean z, int i) {
        this.mSwitch = z;
        this.mLimitDuration = i;
    }
}
