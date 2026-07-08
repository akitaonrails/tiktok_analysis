package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_click_close_keyboard_anchor")
public final class LivePublicScreenClickCloseKeyboardAnchorSetting {
    public static final int DEFAULT = 0;
    public static final LivePublicScreenClickCloseKeyboardAnchorSetting INSTANCE = new LivePublicScreenClickCloseKeyboardAnchorSetting();
    public static final int MARGIN_CAN_CLOSE = 1;
    public static final int MARGIN_CAN_NOT_CLOSE = 2;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_click_close_keyboard_anchor", DEFAULT);
    }

    public final boolean blankCanCloseKeyboard() {
        return getValue() == 1 || getValue() == 2;
    }

    public final boolean marginCanNotCloseKeyboard() {
        return getValue() == 2;
    }
}
