package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_release_lynx_on_completion_timeout")
public final class ReleaseLynxGiftOnCompletionTimeout {
    public static final int DEFAULT = 0;
    public static final int DISABLE = 1;
    public static final ReleaseLynxGiftOnCompletionTimeout INSTANCE = new ReleaseLynxGiftOnCompletionTimeout();

    public static final boolean on() {
        return SettingsManager.INSTANCE.getIntValue("gift_release_lynx_on_completion_timeout", DEFAULT) == 0;
    }
}
