package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_flexible_invite_type_store")
public final class CohostUseFlexibleInviteTypeStore {
    public static final boolean DEFAULT = true;
    public static final CohostUseFlexibleInviteTypeStore INSTANCE = new CohostUseFlexibleInviteTypeStore();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_flexible_invite_type_store", DEFAULT);
    }
}
