package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_ignore_effect_sticker_face_info")
public final class TTLHIgnoreEffectStickerFaceInfoSettings {
    public static final int DEFAULT = 0;
    public static final TTLHIgnoreEffectStickerFaceInfoSettings INSTANCE = new TTLHIgnoreEffectStickerFaceInfoSettings();

    public final boolean value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_ignore_effect_sticker_face_info", DEFAULT) == 1;
    }
}
