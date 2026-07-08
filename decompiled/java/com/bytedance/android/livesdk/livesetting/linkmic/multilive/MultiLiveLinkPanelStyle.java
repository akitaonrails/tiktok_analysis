package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sdk_multilive_link_panel_style")
public final class MultiLiveLinkPanelStyle {
    public static final int DEFAULT = 1;
    public static final MultiLiveLinkPanelStyle INSTANCE = new MultiLiveLinkPanelStyle();
    public static final int USE_NEW_PANEL_WITH_VIDEO = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multilive_link_panel_style", DEFAULT);
    }
}
