package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_redesign_notify_message_interceptor_keys")
public final class LiveMatchRedesignBlockNotifyMsgSetting {
    public static final LiveMatchRedesignBlockNotifyMsgSetting INSTANCE = new LiveMatchRedesignBlockNotifyMsgSetting();
    public static final String[] DEFAULT = {"pm_mt_boost_crit_got_comment_others", "pm_mt_boost_mist_got_comment_others"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_match_redesign_notify_message_interceptor_keys", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
