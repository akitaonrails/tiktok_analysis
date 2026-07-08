package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sei_parser_setting")
public final class LiveSeiParserSetting {
    public static final LiveSeiConfig DEFAULT;
    public static final LiveSeiParserSetting INSTANCE = new LiveSeiParserSetting();
    public static final LiveSeiConfig config;

    static {
        LiveSeiConfig liveSeiConfig = new LiveSeiConfig(0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        DEFAULT = liveSeiConfig;
        LiveSeiConfig liveSeiConfig2 = (LiveSeiConfig) SettingsManager.INSTANCE.getValueSafely("live_sei_parser_setting", liveSeiConfig);
        if (liveSeiConfig2 != null) {
            liveSeiConfig = liveSeiConfig2;
        }
        config = liveSeiConfig;
    }

    public final int seiParserInterval() {
        return config.interval;
    }

    public final int seiParserType() {
        return config.parseType;
    }
}
