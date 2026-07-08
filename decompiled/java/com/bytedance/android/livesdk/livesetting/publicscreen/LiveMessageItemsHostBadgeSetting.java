package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.AnonymousClass0206;
import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.LiveSettingManagerSolidifyUtils;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_mt_message_list_host_default_badge")
public final class LiveMessageItemsHostBadgeSetting {
    public static final LiveMessageItemsHostBadgeSetting INSTANCE = new LiveMessageItemsHostBadgeSetting();
    public static final C01GW solidifyValue$delegate = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(77));
    public static final String DEFAULT = "";

    private final String getSolidifyValue() {
        return (String) solidifyValue$delegate.getValue();
    }

    public final String getHostBadgeStr() {
        return LiveSettingManagerSolidifyUtils.INSTANCE.isSolidifyEnable("live_mt_message_list_host_default_badge") ? getSolidifyValue() : SettingsManager.INSTANCE.getStringValue("live_mt_message_list_host_default_badge", DEFAULT);
    }
}
