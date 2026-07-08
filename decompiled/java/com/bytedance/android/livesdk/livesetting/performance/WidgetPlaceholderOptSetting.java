package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("widget_placeholder_opt_v1")
public final class WidgetPlaceholderOptSetting {
    public static final int DEFAULT = 0;
    public static final WidgetPlaceholderOptSetting INSTANCE = new WidgetPlaceholderOptSetting();
    public static int value = -1;

    public static final boolean enable() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return value > 0;
    }

    public static final boolean enableAllOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return value == Integer.MAX_VALUE;
    }

    public static final boolean enableAudienceRankListOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 16777216) == 16777216;
    }

    public static final boolean enableBackWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 2097152) == 2097152;
    }

    public static final boolean enableBarrageLayoutOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 2) == 2;
    }

    public static final boolean enableCloseWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 268435456) == 268435456;
    }

    public static final boolean enableCumulativeWatchAudienceOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 67108864) == 67108864;
    }

    public static final boolean enableDrawGuessCanvasWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 8) == 8;
    }

    public static final boolean enableEcBarrageLayoutOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 4) == 4;
    }

    public static final boolean enableEndWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 262144) == 262144;
    }

    public static final boolean enableFloatingSkylightWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 536870912) == 536870912;
    }

    public static final boolean enableFullVideoLayoutOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 32768) == 32768;
    }

    public static final boolean enableGameLinkmicInfoContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 64) == 64;
    }

    public static final boolean enableGreetingAnimWidgetOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 256) == 256;
    }

    public static final boolean enableInteractCutShortWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 128) == 128;
    }

    public static final boolean enableInteractDebugInfoContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 131072) == 131072;
    }

    public static final boolean enableKaraokeHoverBallContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 8192) == 8192;
    }

    public static final boolean enableLikeUserInfoAnimContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 8388608) == 8388608;
    }

    public static final boolean enableLiveDecorationContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 2048;
    }

    public static final boolean enableLiveRoomStickerContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 4096;
    }

    public static final boolean enableNormalInteractWindowContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 32) == 32;
    }

    public static final boolean enableOthersLikeWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 512) == 512;
    }

    public static final boolean enablePcsAudienceDslDecoration() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 536870912) == 536870912;
    }

    public static final boolean enablePkContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 1) == 1;
    }

    public static final boolean enableProgrammedLiveTitleOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 33554432) == 33554432;
    }

    public static final boolean enableSelfLikeWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 1024) == 1024;
    }

    public static final boolean enableSkylightSwitchWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 134217728) == 134217728;
    }

    public static final boolean enableSubscribeMaskLayerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 16) == 16;
    }

    public static final boolean enableTreasureBoxWidgetContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 65536) == 65536;
    }

    public static final boolean enableUserInfoContainerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v1", DEFAULT);
        }
        return (value & 4194304) == 4194304;
    }
}
