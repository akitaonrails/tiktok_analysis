package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_beauty_compare_icon_transparency")
public final class LiveBroadcastBeautyCompareIconTransparency {
    public static final float DEFAULT;
    public static final LiveBroadcastBeautyCompareIconTransparency INSTANCE;
    public static final C01GW solidifyValue$delegate;
    public static final float value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveBroadcastBeautyCompareIconTransparency liveBroadcastBeautyCompareIconTransparency = new LiveBroadcastBeautyCompareIconTransparency();
        INSTANCE = liveBroadcastBeautyCompareIconTransparency;
        solidifyValue$delegate = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(142));
        DEFAULT = 0.8f;
        value = LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_beauty_compare_icon_transparency") ? liveBroadcastBeautyCompareIconTransparency.getSolidifyValue() : SettingsManager.INSTANCE.getFloatValue("live_beauty_compare_icon_transparency", 0.8f);
    }

    private final float getSolidifyValue() {
        return ((Number) solidifyValue$delegate.getValue()).floatValue();
    }

    public static final float getValue() {
        return value;
    }
}
