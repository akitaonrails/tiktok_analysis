package com.bytedance.android.livesdk.livesetting.game;

import X.C19748512Ol;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("ttlive_game_bitrate_error_prompt_setting")
public final class BitrateErrorPromptSetting {
    public static final String DEFAULT = "";
    public static final BitrateErrorPromptSetting INSTANCE = new BitrateErrorPromptSetting();

    private final String getStringValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_bitrate_error_prompt_setting", DEFAULT);
    }

    public final BitrateErrorPromptData getData() {
        try {
            return (BitrateErrorPromptData) C19748512Ol.LIZIZ.LJII(getStringValue(), BitrateErrorPromptData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final boolean isEnable() {
        BitrateErrorPromptData data = getData();
        if (data != null) {
            return Intrinsics.LJFF(data.enable, Boolean.TRUE);
        }
        return false;
    }
}
