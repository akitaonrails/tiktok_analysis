package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_room_poll_duration")
public final class LivePollDurationSetting {
    public static final long DEFAULT = 60000;
    public static final LivePollDurationSetting INSTANCE = new LivePollDurationSetting();

    public final long getMillisecond() {
        return SettingsManager.INSTANCE.getLongValue("live_room_poll_duration", DEFAULT);
    }

    public final long getSecond() {
        return getMillisecond() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
