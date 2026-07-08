package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("mock_link_mic_aab_download_fail")
public final class MockLinkMicAabDownloadFail {
    public static final MockLinkMicAabDownloadFail INSTANCE = new MockLinkMicAabDownloadFail();
    public static final int DEFAULT = 0;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("mock_link_mic_aab_download_fail", DEFAULT);

    public final boolean enable() {
        return setting == 1;
    }
}
