package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_debug_enigma_match")
public final class LiveMatchEnigmaDebugSettings {
    public static final LiveMatchEnigmaDebugSettings INSTANCE = new LiveMatchEnigmaDebugSettings();
    public static final LiveMatchEnigmaData DEFAULT = new LiveMatchEnigmaData(false, false, 0, 0, true);

    private final LiveMatchEnigmaData getConfig() {
        return (LiveMatchEnigmaData) SettingsManager.INSTANCE.getValueSafely("live_debug_enigma_match", DEFAULT);
    }

    public final boolean getIsAllowPersonalScoreAnimation() {
        LiveMatchEnigmaData config = getConfig();
        if (config != null) {
            return config.isAllowPersonalScoreAnimation;
        }
        return true;
    }

    public final int getOpponentEnigmaScore() {
        LiveMatchEnigmaData config = getConfig();
        if (config != null) {
            return config.opponentEnigmaScore;
        }
        return 0;
    }

    public final int getSelfEnigmaScore() {
        LiveMatchEnigmaData config = getConfig();
        if (config != null) {
            return config.selfEnigmaScore;
        }
        return 0;
    }

    public final boolean isEnigmaMatchEnabled() {
        LiveMatchEnigmaData config = getConfig();
        if (config != null) {
            return config.isEnigmaMatchEnabled;
        }
        return false;
    }

    public final boolean isUserEnigma() {
        LiveMatchEnigmaData config = getConfig();
        if (config != null) {
            return config.isUserEnigma;
        }
        return false;
    }
}
