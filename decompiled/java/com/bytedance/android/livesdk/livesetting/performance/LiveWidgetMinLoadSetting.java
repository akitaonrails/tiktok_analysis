package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_widget_min_load")
public final class LiveWidgetMinLoadSetting {
    public static final int DEFAULT = 0;
    public static final LiveWidgetMinLoadSetting INSTANCE;
    public static final C01GW solidifyValue$delegate;
    public static final int value;

    static {
        LiveWidgetMinLoadSetting liveWidgetMinLoadSetting = new LiveWidgetMinLoadSetting();
        INSTANCE = liveWidgetMinLoadSetting;
        solidifyValue$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(80));
        value = LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_widget_min_load") ? liveWidgetMinLoadSetting.getSolidifyValue() : SettingsManager.INSTANCE.getIntValue("live_widget_min_load", DEFAULT);
    }

    private final int getSolidifyValue() {
        return ((Number) solidifyValue$delegate.getValue()).intValue();
    }

    public final boolean enableFullVideo() {
        return (value & 8) == 8;
    }

    public final boolean enableInteractCut() {
        return (value & 2) == 2;
    }

    public final boolean enableTopEffect() {
        return (value & 4) == 4;
    }

    public final boolean enableWatchFocus() {
        return (value & 1) == 1;
    }
}
