package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("room_screen_status_observe")
public final class RoomScreenStatusObserveNewSetting {
    public static final ObserveConfig DEFAULT;
    public static final RoomScreenStatusObserveNewSetting INSTANCE = new RoomScreenStatusObserveNewSetting();
    public static final ObserveConfig value;

    public static final class ObserveConfig {
        public static final TypeAdapter ADAPTER = new RoomScreenStatusObserveNewSetting_ObserveConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("blackDurThresholdSec")
        public long blackDurThreshold;

        @C09CT("enable")
        public Boolean enable;

        @C09CT("enableQuickSlideCheck")
        public boolean enableQuickSlideCheck;

        @C09CT("enableRemove")
        public boolean enableRemove;

        @C09CT("maxTime")
        public Long maxBlackTimeMs;

        @C09CT("timeoutMs")
        public Long timeoutMs;

        public ObserveConfig() {
            this(Boolean.FALSE, 30000L, Long.valueOf(TimeUnit.MINUTES.toMillis(15L)), false, false, 30L);
        }

        public ObserveConfig(Boolean bool, Long l, Long l2, boolean z, boolean z2, long j) {
            this.enable = bool;
            this.timeoutMs = l;
            this.maxBlackTimeMs = l2;
            this.enableRemove = z;
            this.enableQuickSlideCheck = z2;
            this.blackDurThreshold = j;
        }
    }

    static {
        ObserveConfig observeConfig = new ObserveConfig(Boolean.FALSE, 30000L, Long.valueOf(TimeUnit.MINUTES.toMillis(15L)), false, false, 30L);
        DEFAULT = observeConfig;
        ObserveConfig observeConfig2 = (ObserveConfig) SettingsManager.INSTANCE.getValueSafely(RoomScreenStatusObserveNewSetting.class);
        if (observeConfig2 != null) {
            observeConfig = observeConfig2;
        }
        value = observeConfig;
    }

    public static final boolean enableBlackStreamRemove() {
        return value.enableRemove;
    }

    public static final boolean enableLog() {
        return Intrinsics.LJFF(value.enable, Boolean.TRUE);
    }

    public static final boolean enableQuickSlideCheck() {
        return value.enableQuickSlideCheck;
    }

    public static final long getBlackDurThreshold() {
        return value.blackDurThreshold;
    }

    public static final long getMaxMonitorTimeMs() {
        Long l = value.maxBlackTimeMs;
        return l != null ? l.longValue() : TimeUnit.MINUTES.toMillis(15L);
    }

    public static final long getTimeoutMs() {
        Long l = value.timeoutMs;
        if (l != null) {
            return l.longValue();
        }
        return 36000L;
    }
}
