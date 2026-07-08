package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C2097908Jt;
import android.graphics.RectF;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_mix_avatar_to_stream_settings")
public final class LinkMicMixAvatarToStreamSettings {
    public static final LinkMicMixAvatarToStreamSettings INSTANCE = new LinkMicMixAvatarToStreamSettings();
    public static final Map<String, Double> DEFAULT = C2097908Jt.LIZJ(new Pair("1011", Double.valueOf(0.9d)));
    public static final int $stable = 8;

    public final Map<String, Double> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Double> map = DEFAULT;
        Map<String, Double> map2 = (Map) settingsManager.getValueSafely("link_mic_mix_avatar_to_stream_settings", map);
        return map2 != null ? map2 : map;
    }

    public final boolean contains(double d, RectF rectF) {
        if (rectF.width() * rectF.height() >= d) {
            return true;
        }
        return false;
    }
}
