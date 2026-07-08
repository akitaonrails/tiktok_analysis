package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_bean_invite_capsule_no_education")
public final class LiveMatchBeanInviteCapsuleNoEduSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchBeanInviteCapsuleNoEduSetting INSTANCE = new LiveMatchBeanInviteCapsuleNoEduSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_bean_invite_capsule_no_education", DEFAULT);
    }
}
