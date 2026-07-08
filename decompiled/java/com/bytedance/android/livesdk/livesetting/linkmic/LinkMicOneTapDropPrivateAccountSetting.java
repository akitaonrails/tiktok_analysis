package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("link_mic_one_tap_drop_private_account")
public final class LinkMicOneTapDropPrivateAccountSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicOneTapDropPrivateAccountSetting INSTANCE = new LinkMicOneTapDropPrivateAccountSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_one_tap_drop_private_account", DEFAULT);
    }
}
