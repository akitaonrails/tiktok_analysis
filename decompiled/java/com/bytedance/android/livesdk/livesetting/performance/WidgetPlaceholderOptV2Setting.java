package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("widget_placeholder_opt_v2")
public final class WidgetPlaceholderOptV2Setting {
    public static final int DEFAULT = 0;
    public static final WidgetPlaceholderOptV2Setting INSTANCE = new WidgetPlaceholderOptV2Setting();
    public static int value = -1;

    public static final boolean enable() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return value > 0;
    }

    public static final boolean enableAllOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return value == Integer.MAX_VALUE;
    }

    public static final boolean enableBackupTipOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 262144) == 262144;
    }

    public static final boolean enableBottomLeftLinkHostOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 4194304) == 4194304;
    }

    public static final boolean enableBottomLeftSlotOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 16777216) == 16777216;
    }

    public static final boolean enableCaptionDeleteTopOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 65536) == 65536;
    }

    public static final boolean enableCaptionTextOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 1048576) == 1048576;
    }

    public static final boolean enableCommentInputOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 67108864) == 67108864;
    }

    public static final boolean enableDebugInfoOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 131072) == 131072;
    }

    public static final boolean enableDonationStickerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 64) == 64;
    }

    public static final boolean enableDrawerEntranceOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 1024) == 1024;
    }

    public static final boolean enableGamePartnershipEntranceOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 8388608) == 8388608;
    }

    public static final boolean enableGlobalNotificationOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 16) == 16;
    }

    public static final boolean enableHashTagOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 128) == 128;
    }

    public static final boolean enableLeftToolbarOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 2097152) == 2097152;
    }

    public static final boolean enableLiveDetectOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 524288) == 524288;
    }

    public static final boolean enableMicRoomInfoOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 4) == 4;
    }

    public static final boolean enableProgrammedLiveMenuOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 32) == 32;
    }

    public static final boolean enableProgrammedLiveOnlineAudienceWhenMenuCollapseOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 1) == 1;
    }

    public static final boolean enableProgrammedLiveOnlineAudienceWhenMenuExpandOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 8) == 8;
    }

    public static final boolean enableProgrammedLiveUserInfoOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 2) == 2;
    }

    public static final boolean enableRank1Opt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 256) == 256;
    }

    public static final boolean enableRank2Opt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 512) == 512;
    }

    public static final boolean enableRightToolbarOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 134217728) == 134217728;
    }

    public static final boolean enableShortTouchOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 2048;
    }

    public static final boolean enableShortTouchPreviewWidgetOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 16384) == 16384;
    }

    public static final boolean enableSubscribeIconLeftOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 33554432) == 33554432;
    }

    public static final boolean enableTopEffectOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 32768) == 32768;
    }

    public static final boolean enableTopRightBannerOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & 8192) == 8192;
    }

    public static final boolean enableWishListOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("widget_placeholder_opt_v2", DEFAULT);
        }
        return (value & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 4096;
    }

    public static final boolean enableSecondRowChainOpt() {
        return enableDonationStickerOpt() || enableHashTagOpt() || enableRank1Opt() || enableRank2Opt();
    }

    public static final boolean enableThirdRowSpacingResolverOpt() {
        return enableShortTouchOpt() || enableWishListOpt() || enableTopRightBannerOpt();
    }
}
