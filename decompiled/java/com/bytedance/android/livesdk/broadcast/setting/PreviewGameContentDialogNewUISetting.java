package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("preview_game_content_dialog_new_ui_enable")
public final class PreviewGameContentDialogNewUISetting {
    public static final boolean DEFAULT = true;
    public static final PreviewGameContentDialogNewUISetting INSTANCE = new PreviewGameContentDialogNewUISetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("preview_game_content_dialog_new_ui_enable", DEFAULT);
    }
}
