package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("mg_anchor_admin_authorization_link_opt")
public final class LinkMicAdminAuthorizationLinkOptSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicAdminAuthorizationLinkOptSetting INSTANCE = new LinkMicAdminAuthorizationLinkOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("mg_anchor_admin_authorization_link_opt", DEFAULT);
    }
}
