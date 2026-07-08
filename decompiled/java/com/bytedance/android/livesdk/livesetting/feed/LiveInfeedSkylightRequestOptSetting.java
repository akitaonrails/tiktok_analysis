package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_infeed_skylight_request_opt")
public final class LiveInfeedSkylightRequestOptSetting {
    public static final LiveInfeedSkylightRequestOptSetting INSTANCE = new LiveInfeedSkylightRequestOptSetting();
    public static final SkylightRequestStrategy DEFAULT = new SkylightRequestStrategy(false, false, 2000);

    private final SkylightRequestStrategy getValue() {
        return (SkylightRequestStrategy) SettingsManager.INSTANCE.getValueSafely("live_infeed_skylight_request_opt", DEFAULT);
    }

    public final long delayTime() {
        SkylightRequestStrategy value = getValue();
        if (value != null) {
            return value.delayTime;
        }
        return 2000L;
    }

    public final boolean enableAfterWidgetLoadEnd() {
        SkylightRequestStrategy value = getValue();
        return value != null && value.enableAfterWidgetLoadEnd;
    }

    public final boolean enableDelay() {
        SkylightRequestStrategy value = getValue();
        return value != null && value.enableDelay;
    }

    public final boolean enableLazyRequest() {
        return enableDelay() || enableAfterWidgetLoadEnd();
    }

    public static final class SkylightRequestStrategy {
        public static final TypeAdapter ADAPTER = new LiveInfeedSkylightRequestOptSetting_SkylightRequestStrategy_OptTypeAdapter(NormalGson.singleton());

        @C09CT("delay_time")
        public long delayTime;

        @C09CT("enable_after_widget_load_end")
        public boolean enableAfterWidgetLoadEnd;

        @C09CT("enable_delay")
        public boolean enableDelay;

        public SkylightRequestStrategy() {
            this(false, false, 2000L);
        }

        public SkylightRequestStrategy(boolean z, boolean z2, long j) {
            this.enableAfterWidgetLoadEnd = z;
            this.enableDelay = z2;
            this.delayTime = j;
        }
    }
}
