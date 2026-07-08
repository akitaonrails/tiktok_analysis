package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_envelope_user_diamond_permission")
public final class RedEnvelopeUserDiamondPermissionSetting {
    public static final boolean DEFAULT = true;
    public static final RedEnvelopeUserDiamondPermissionSetting INSTANCE = new RedEnvelopeUserDiamondPermissionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_envelope_user_diamond_permission", DEFAULT);
    }
}
