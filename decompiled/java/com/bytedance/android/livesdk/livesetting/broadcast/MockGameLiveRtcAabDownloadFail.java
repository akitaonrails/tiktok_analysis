package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("mock_game_live_rtc_aab_download_fail")
public final class MockGameLiveRtcAabDownloadFail {
    public static final MockGameLiveRtcAabDownloadFail INSTANCE = new MockGameLiveRtcAabDownloadFail();
    public static final int DEFAULT = 0;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("mock_game_live_rtc_aab_download_fail", DEFAULT);

    public final boolean enable() {
        return setting == 1;
    }
}
