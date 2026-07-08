package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_beauty_compare_interval_time")
public final class LiveBroadcastBeautyCompareIntervalTime {
    public static final long DEFAULT;
    public static final LiveBroadcastBeautyCompareIntervalTime INSTANCE;
    public static final C01GW solidifyValue$delegate;
    public static final long value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveBroadcastBeautyCompareIntervalTime liveBroadcastBeautyCompareIntervalTime = new LiveBroadcastBeautyCompareIntervalTime();
        INSTANCE = liveBroadcastBeautyCompareIntervalTime;
        solidifyValue$delegate = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(143));
        DEFAULT = 300L;
        value = LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_beauty_compare_interval_time") ? liveBroadcastBeautyCompareIntervalTime.getSolidifyValue() : SettingsManager.INSTANCE.getLongValue("live_beauty_compare_interval_time", 300L);
    }

    private final long getSolidifyValue() {
        return ((Number) solidifyValue$delegate.getValue()).longValue();
    }

    public static final long getValue() {
        return value;
    }
}
