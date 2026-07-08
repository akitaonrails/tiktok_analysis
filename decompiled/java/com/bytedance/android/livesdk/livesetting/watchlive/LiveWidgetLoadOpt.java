package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_widget_load_opt")
public final class LiveWidgetLoadOpt {
    public static final LiveWidgetScatterConfig DEFAULT;
    public static final LiveWidgetLoadOpt INSTANCE = new LiveWidgetLoadOpt();
    public static final LiveWidgetScatterConfig value;

    public static final class LiveWidgetScatterConfig {
        public static final TypeAdapter ADAPTER = new LiveWidgetLoadOpt_LiveWidgetScatterConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public Boolean enable;

        @C09CT("load_buffer_time")
        public long loadBufferTime;

        @C09CT("low_dev_load_buffer_time")
        public long lowLoadBufferTime;

        @C09CT("always_split")
        public Boolean splitAll;

        public LiveWidgetScatterConfig() {
            this(30L, 50L, Boolean.FALSE, Boolean.FALSE);
        }

        public LiveWidgetScatterConfig(long j, long j2, Boolean bool, Boolean bool2) {
            this.loadBufferTime = j;
            this.lowLoadBufferTime = j2;
            this.enable = bool;
            this.splitAll = bool2;
        }
    }

    static {
        LiveWidgetScatterConfig liveWidgetScatterConfig = new LiveWidgetScatterConfig(30L, 50L, Boolean.FALSE, Boolean.FALSE);
        DEFAULT = liveWidgetScatterConfig;
        value = (LiveWidgetScatterConfig) SettingsManager.INSTANCE.getValueSafely("live_widget_load_opt", liveWidgetScatterConfig);
    }

    public static final boolean alwaysSplit() {
        LiveWidgetScatterConfig liveWidgetScatterConfig = value;
        if (liveWidgetScatterConfig != null) {
            return Intrinsics.LJFF(liveWidgetScatterConfig.splitAll, Boolean.TRUE);
        }
        return false;
    }

    public static final boolean enable() {
        LiveWidgetScatterConfig liveWidgetScatterConfig = value;
        if (liveWidgetScatterConfig != null) {
            return Intrinsics.LJFF(liveWidgetScatterConfig.enable, Boolean.TRUE);
        }
        return false;
    }

    public static final long getBatchTimeMs() {
        LiveWidgetScatterConfig liveWidgetScatterConfig = value;
        if (liveWidgetScatterConfig != null) {
            return liveWidgetScatterConfig.loadBufferTime;
        }
        return 0L;
    }

    public static final long getLowDevBatchTimeMs() {
        LiveWidgetScatterConfig liveWidgetScatterConfig = value;
        if (liveWidgetScatterConfig != null) {
            return liveWidgetScatterConfig.lowLoadBufferTime;
        }
        return 0L;
    }
}
