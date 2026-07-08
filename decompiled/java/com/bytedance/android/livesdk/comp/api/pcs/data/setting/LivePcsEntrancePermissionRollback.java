package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_pcs_entrance_permission_rollback")
public final class LivePcsEntrancePermissionRollback {
    public static final int DEFAULT = 0;
    public static final LivePcsEntrancePermissionRollback INSTANCE = new LivePcsEntrancePermissionRollback();
    public static final int ENABLE = 1;

    public final boolean rollback() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_entrance_permission_rollback", DEFAULT) == ENABLE;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE() {
        return ENABLE;
    }
}
