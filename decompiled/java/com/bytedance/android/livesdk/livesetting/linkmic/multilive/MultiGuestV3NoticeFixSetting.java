package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("multiguest_notice_fix")
public final class MultiGuestV3NoticeFixSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestV3NoticeFixSetting INSTANCE = new MultiGuestV3NoticeFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_notice_fix", DEFAULT);
    }
}
