package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("tp_text_font_size_bugfix")
public final class TpTextFontSizeBugfixSetting {
    public static final TpTextFontSizeBugfixSetting INSTANCE = new TpTextFontSizeBugfixSetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("tp_text_font_size_bugfix", DEFAULT);
    }
}
