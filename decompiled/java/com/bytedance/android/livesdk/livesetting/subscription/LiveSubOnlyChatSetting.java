package com.bytedance.android.livesdk.livesetting.subscription;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveSubOnlyChatSetting {
    public static final TypeAdapter ADAPTER = new LiveSubOnlyChatSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("animation_enable")
    public boolean animationEnable;

    @C09CT("on_live_switch_enable")
    public boolean onLiveSwitchEnable;

    @C09CT("on_live_setting_switch_frequency_min")
    public int onLiveSwitchFrequencyMin;

    public LiveSubOnlyChatSetting() {
        this(1, false, false);
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    public final boolean getOnLiveSwitchEnable() {
        return this.onLiveSwitchEnable;
    }

    public final int getOnLiveSwitchFrequencyMin() {
        return this.onLiveSwitchFrequencyMin;
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    public final void setOnLiveSwitchEnable(boolean z) {
        this.onLiveSwitchEnable = z;
    }

    public final void setOnLiveSwitchFrequencyMin(int i) {
        this.onLiveSwitchFrequencyMin = i;
    }

    public LiveSubOnlyChatSetting(int i, boolean z, boolean z2) {
        this.onLiveSwitchFrequencyMin = i;
        this.onLiveSwitchEnable = z;
        this.animationEnable = z2;
    }
}
