package com.bytedance.android.livesdk.broadcast.preview.widget.boards;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("board_edit_text_opt_setting")
public final class BoardEditTextOptSetting {
    public static final boolean DEFAULT = false;
    public static final boolean GROUP_EXPERIMENT = true;
    public static final BoardEditTextOptSetting INSTANCE = new BoardEditTextOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("board_edit_text_opt_setting", DEFAULT);
    }
}
