package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("bug_fix_multi_guest_detached_vm_setting")
public final class BugFixMultiGuestDetachedVmSetting {
    public static final int DEFAULT = 1;
    public static final BugFixMultiGuestDetachedVmSetting INSTANCE = new BugFixMultiGuestDetachedVmSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("bug_fix_multi_guest_detached_vm_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
