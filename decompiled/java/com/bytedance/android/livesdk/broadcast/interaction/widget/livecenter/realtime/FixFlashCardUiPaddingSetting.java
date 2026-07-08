package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.realtime;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "fix_flash_card_ui_padding")
public final class FixFlashCardUiPaddingSetting {
    public static final boolean DEFAULT = true;
    public static final FixFlashCardUiPaddingSetting INSTANCE = new FixFlashCardUiPaddingSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("fix_flash_card_ui_padding", DEFAULT);
    }
}
