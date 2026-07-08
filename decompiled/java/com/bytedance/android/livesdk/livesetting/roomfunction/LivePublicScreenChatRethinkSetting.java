package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_update_rethink_strategy_for_comments")
public final class LivePublicScreenChatRethinkSetting {
    public static final int DEFAULT = 0;
    public static final LivePublicScreenChatRethinkSetting INSTANCE = new LivePublicScreenChatRethinkSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_update_rethink_strategy_for_comments", DEFAULT) != 0;
    }

    private final boolean enableV1() {
        return SettingsManager.INSTANCE.getIntValue("live_update_rethink_strategy_for_comments", DEFAULT) == 1;
    }

    private final boolean enableV2() {
        return SettingsManager.INSTANCE.getIntValue("live_update_rethink_strategy_for_comments", DEFAULT) == 2;
    }

    public static final boolean enableV3() {
        return SettingsManager.INSTANCE.getIntValue("live_update_rethink_strategy_for_comments", DEFAULT) == 3;
    }

    public static final int getRethinkVersion() {
        return SettingsManager.INSTANCE.getIntValue("live_update_rethink_strategy_for_comments", DEFAULT);
    }

    public final int getRethinkMsg() {
        if (enableV1()) {
            return 2131843991;
        }
        return enableV2() ? 2131846527 : 2131846528;
    }

    public final int getRethinkTitle() {
        if (enableV1()) {
            return 2131843994;
        }
        return enableV2() ? 2131846529 : 2131846530;
    }
}
