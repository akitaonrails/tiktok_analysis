package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_widget_scatter_config")
public final class LiveWidgetLoadScatterSetting {
    public static final LiveWidgetScatterConfig DEFAULT;
    public static final LiveWidgetLoadScatterSetting INSTANCE = new LiveWidgetLoadScatterSetting();
    public static final LiveWidgetScatterConfig value;

    public static final class LiveWidgetScatterConfig {
        public static final TypeAdapter ADAPTER = new LiveWidgetLoadScatterSetting_LiveWidgetScatterConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public Boolean enable;

        @C09CT("load_buffer_time")
        public long loadBufferTime;

        public LiveWidgetScatterConfig() {
            this(Boolean.FALSE, 12L);
        }

        public LiveWidgetScatterConfig(Boolean bool, long j) {
            this.enable = bool;
            this.loadBufferTime = j;
        }
    }

    static {
        LiveWidgetScatterConfig liveWidgetScatterConfig = new LiveWidgetScatterConfig(Boolean.FALSE, 12L);
        DEFAULT = liveWidgetScatterConfig;
        value = (LiveWidgetScatterConfig) SettingsManager.INSTANCE.getValueSafely("live_widget_scatter_config", liveWidgetScatterConfig);
    }

    public final boolean enable() {
        LiveWidgetScatterConfig liveWidgetScatterConfig = value;
        if (liveWidgetScatterConfig != null) {
            return Intrinsics.LJFF(liveWidgetScatterConfig.enable, Boolean.TRUE);
        }
        return false;
    }

    public final long getBufferTime() {
        LiveWidgetScatterConfig liveWidgetScatterConfig = value;
        if (liveWidgetScatterConfig != null) {
            return liveWidgetScatterConfig.loadBufferTime;
        }
        return 0L;
    }
}
