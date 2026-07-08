package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_max_download_count")
public final class LiveKaraokeMaxDownloadCount {
    public static final int DEFAULT = 2;
    public static final LiveKaraokeMaxDownloadCount INSTANCE = new LiveKaraokeMaxDownloadCount();

    public final int maxCount() {
        return SettingsManager.INSTANCE.getIntValue("live_karaoke_max_download_count", DEFAULT);
    }
}
