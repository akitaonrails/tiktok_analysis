package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_click_close_keyboard")
public final class LivePublicScreenClickCloseKeyboardSetting {
    public static final int DEFAULT = 0;
    public static final LivePublicScreenClickCloseKeyboardSetting INSTANCE = new LivePublicScreenClickCloseKeyboardSetting();
    public static final int MARGIN_CAN_CLOSE = 1;
    public static final int MARGIN_CAN_NOT_CLOSE = 2;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_click_close_keyboard", DEFAULT);
    }

    public final boolean blankCanCloseKeyboard(boolean z) {
        if (z) {
            return LivePublicScreenClickCloseKeyboardAnchorSetting.INSTANCE.blankCanCloseKeyboard();
        }
        if (getValue() != 1 && getValue() != 2) {
            return false;
        }
        return true;
    }

    public final boolean marginCanNotCloseKeyboard(boolean z) {
        if (z) {
            return LivePublicScreenClickCloseKeyboardAnchorSetting.INSTANCE.marginCanNotCloseKeyboard();
        }
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
