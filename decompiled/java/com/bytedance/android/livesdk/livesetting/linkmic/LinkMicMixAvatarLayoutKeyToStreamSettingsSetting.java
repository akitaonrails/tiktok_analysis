package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C2097608Jq;
import android.graphics.RectF;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_mix_avatar_layout_key_to_stream_settings")
public final class LinkMicMixAvatarLayoutKeyToStreamSettingsSetting {
    public static final int $stable;
    public static final Map<String, Double> DEFAULT;
    public static final LinkMicMixAvatarLayoutKeyToStreamSettingsSetting INSTANCE = new LinkMicMixAvatarLayoutKeyToStreamSettingsSetting();

    static {
        Double dValueOf = Double.valueOf(0.9d);
        DEFAULT = C2097608Jq.LJIIIIZZ(new Pair("panel_float", dValueOf), new Pair("double_camp", dValueOf), new Pair("panel_fix", Double.valueOf(0.7d)), new Pair("2_", dValueOf), new Pair("7_", Double.valueOf(0.8d)), new Pair("3_", Double.valueOf(0.7d)));
        $stable = 8;
    }

    public final Map<String, Double> getValue() {
        Map<String, Double> map = (Map) SettingsManager.INSTANCE.getValueSafely(LinkMicMixAvatarLayoutKeyToStreamSettingsSetting.class);
        return map == null ? DEFAULT : map;
    }

    public final boolean contains(double d, RectF rectF) {
        if (rectF.width() * rectF.height() >= d) {
            return true;
        }
        return false;
    }
}
