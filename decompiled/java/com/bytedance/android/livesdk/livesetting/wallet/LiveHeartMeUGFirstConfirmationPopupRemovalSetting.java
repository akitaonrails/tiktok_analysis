package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_heartme_ug_first_confirmation_popup_removal")
public final class LiveHeartMeUGFirstConfirmationPopupRemovalSetting {
    public static final boolean DEFAULT = true;
    public static final LiveHeartMeUGFirstConfirmationPopupRemovalSetting INSTANCE = new LiveHeartMeUGFirstConfirmationPopupRemovalSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_heartme_ug_first_confirmation_popup_removal", DEFAULT);
    }
}
