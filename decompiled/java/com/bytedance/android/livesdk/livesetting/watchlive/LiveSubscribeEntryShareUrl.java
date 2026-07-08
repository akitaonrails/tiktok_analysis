package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("subscribe_entry_share_scheme")
public final class LiveSubscribeEntryShareUrl {
    public static final LiveSubscribeEntryShareUrl INSTANCE = new LiveSubscribeEntryShareUrl();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("subscribe_entry_share_scheme", DEFAULT) + "&use_native_pgc_sub_privilege_page=1";
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
