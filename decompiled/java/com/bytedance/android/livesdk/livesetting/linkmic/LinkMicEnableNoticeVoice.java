package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_notice_voice")
public final class LinkMicEnableNoticeVoice {
    public static final boolean DEFAULT = false;
    public static final LinkMicEnableNoticeVoice INSTANCE = new LinkMicEnableNoticeVoice();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_notice_voice", DEFAULT);
    }
}
