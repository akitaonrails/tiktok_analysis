package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sub_privilege_page_to_super_fan")
public final class SubPrivilegePageSchemaToSuperFanSetting {
    public static final boolean DEFAULT = true;
    public static final SubPrivilegePageSchemaToSuperFanSetting INSTANCE = new SubPrivilegePageSchemaToSuperFanSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sub_privilege_page_to_super_fan", DEFAULT);
    }
}
