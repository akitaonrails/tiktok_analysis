package com.bytedance.android.livesdk.livesetting.banner;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_middle_touch_architecture_live_type")
public final class LiveMiddleTouchArchitectureLiveTypeSetting {
    public static final LiveMiddleTouchArchitectureLiveTypeSetting INSTANCE = new LiveMiddleTouchArchitectureLiveTypeSetting();
    public static final MiddleTouchEnableSwitch DEFAULT = new MiddleTouchEnableSwitch(false, false, false);

    public final MiddleTouchEnableSwitch getValue() {
        return (MiddleTouchEnableSwitch) SettingsManager.INSTANCE.getValueSafely("live_middle_touch_architecture_live_type", DEFAULT);
    }

    public static final class MiddleTouchEnableSwitch {
        public static final TypeAdapter ADAPTER = new LiveMiddleTouchArchitectureLiveTypeSetting_MiddleTouchEnableSwitch_OptTypeAdapter(NormalGson.singleton());

        @C09CT("ecomerce_enable")
        public boolean ecEnable;

        @C09CT("game_enable")
        public boolean gameEnable;

        @C09CT("video_enable")
        public boolean videoEnable;

        public MiddleTouchEnableSwitch() {
            this(false, false, false);
        }

        public MiddleTouchEnableSwitch(boolean z, boolean z2, boolean z3) {
            this.videoEnable = z;
            this.gameEnable = z2;
            this.ecEnable = z3;
        }
    }
}
