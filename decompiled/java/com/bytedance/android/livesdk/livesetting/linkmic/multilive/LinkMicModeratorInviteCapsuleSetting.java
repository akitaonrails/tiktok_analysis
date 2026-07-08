package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("mg_moderator_expand_invite_capsule_and_mic_guide")
public final class LinkMicModeratorInviteCapsuleSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicModeratorInviteCapsuleSetting INSTANCE = new LinkMicModeratorInviteCapsuleSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("mg_moderator_expand_invite_capsule_and_mic_guide", DEFAULT);
    }
}
