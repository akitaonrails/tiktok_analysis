package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_add_auto_accept_in_go_live_page")
public final class MultiGuestAddAutoAcceptInGoLivePageSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestAddAutoAcceptInGoLivePageSetting INSTANCE = new MultiGuestAddAutoAcceptInGoLivePageSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_add_auto_accept_in_go_live_page", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
