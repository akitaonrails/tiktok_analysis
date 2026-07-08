package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("anchor_start_live_loading")
public final class LiveStartLiveLoadingABSettings {
    public static final LiveStartLiveLoadingABSettings INSTANCE = new LiveStartLiveLoadingABSettings();
    public static final Option DEFAULT = new Option(0, 300);

    public final Option getValue() {
        Option option = (Option) SettingsManager.INSTANCE.getValueSafely(LiveStartLiveLoadingABSettings.class);
        return option == null ? DEFAULT : option;
    }

    public final boolean isEnable() {
        return getValue().enable == 1;
    }

    public static final class Option {
        public static final TypeAdapter ADAPTER;

        @C09CT("delay_time")
        public long delayTime;

        @C09CT("enable")
        public int enable;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveStartLiveLoadingABSettings_Option_OptTypeAdapter();
        }

        public Option() {
            this(0, 300L);
        }

        public Option(int i, long j) {
            this.enable = i;
            this.delayTime = j;
        }
    }
}
