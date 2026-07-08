package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_profilecard_gift_vault_entrance_creator_level")
public final class LiveProfileCardGiftVaultEntranceCreatorLevel {
    public static final LiveProfileCardGiftVaultEntranceCreatorLevel INSTANCE = new LiveProfileCardGiftVaultEntranceCreatorLevel();
    public static final String[] DEFAULT = {""};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_profilecard_gift_vault_entrance_creator_level", DEFAULT);
    }
}
