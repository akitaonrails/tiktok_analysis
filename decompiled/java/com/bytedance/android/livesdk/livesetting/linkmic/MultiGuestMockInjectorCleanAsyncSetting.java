package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_mock_injector_clean_async")
public final class MultiGuestMockInjectorCleanAsyncSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestMockInjectorCleanAsyncSetting INSTANCE = new MultiGuestMockInjectorCleanAsyncSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_mock_injector_clean_async", DEFAULT);
    }
}
