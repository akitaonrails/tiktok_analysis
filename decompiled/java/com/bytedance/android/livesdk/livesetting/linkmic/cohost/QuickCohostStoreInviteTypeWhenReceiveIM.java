package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_quick_cohost_store_invite_type_from_im")
public final class QuickCohostStoreInviteTypeWhenReceiveIM {
    public static final boolean DEFAULT = true;
    public static final QuickCohostStoreInviteTypeWhenReceiveIM INSTANCE = new QuickCohostStoreInviteTypeWhenReceiveIM();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_quick_cohost_store_invite_type_from_im", DEFAULT);
    }
}
