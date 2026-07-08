package com.bytedance.android.livesdk.settings;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_player_logger_disable")
public final class LivePlayerLoggerDisableExp {
    public static final PlayerLoggerDisableConfig DEFAULT;
    public static final LivePlayerLoggerDisableExp INSTANCE = new LivePlayerLoggerDisableExp();
    public static final C01GW disableKeySet$delegate;
    public static final PlayerLoggerDisableConfig value;

    static {
        PlayerLoggerDisableConfig playerLoggerDisableConfig = new PlayerLoggerDisableConfig(false, new ArrayList(), false);
        DEFAULT = playerLoggerDisableConfig;
        PlayerLoggerDisableConfig playerLoggerDisableConfig2 = (PlayerLoggerDisableConfig) SettingsManager.INSTANCE.getValueSafely("live_player_logger_disable", playerLoggerDisableConfig);
        if (playerLoggerDisableConfig2 != null) {
            playerLoggerDisableConfig = playerLoggerDisableConfig2;
        }
        value = playerLoggerDisableConfig;
        disableKeySet$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(105));
    }

    private final Set<String> getDisableKeySet() {
        return (Set) disableKeySet$delegate.getValue();
    }

    public final boolean isEventDisable(String str) {
        if (str == null) {
            return false;
        }
        PlayerLoggerDisableConfig playerLoggerDisableConfig = value;
        if (!playerLoggerDisableConfig.disable) {
            return false;
        }
        if (!playerLoggerDisableConfig.disableAll && !getDisableKeySet().contains(str)) {
            return false;
        }
        return true;
    }
}
