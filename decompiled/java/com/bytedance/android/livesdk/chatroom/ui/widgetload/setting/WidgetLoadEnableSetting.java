package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("widget_load_new_framework")
public final class WidgetLoadEnableSetting {
    public static final WidgetCustomLoadOptConfig DEFAULT;
    public static final WidgetLoadEnableSetting INSTANCE = new WidgetLoadEnableSetting();
    public static final WidgetCustomLoadOptConfig value;

    static {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = new WidgetCustomLoadOptConfig();
        DEFAULT = widgetCustomLoadOptConfig;
        value = (WidgetCustomLoadOptConfig) SettingsManager.INSTANCE.getValueSafely("widget_load_new_framework", widgetCustomLoadOptConfig);
    }

    public final boolean enable() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig == null || !widgetCustomLoadOptConfig.enable) {
            return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && WidgetLoadLocalTestEnableSetting.INSTANCE.enable();
        }
        return true;
    }

    public final boolean enableScreenShotOpt() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        return widgetCustomLoadOptConfig != null && widgetCustomLoadOptConfig.enableScreenShotOpt;
    }

    public final int enterInteractionRoomExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.enterInteractionRoomExecutePhaseIndex;
        }
        return -1;
    }

    public final boolean firstPhaseLoadInsert2FrameWhenAfterFirstFrame() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        return widgetCustomLoadOptConfig != null && widgetCustomLoadOptConfig.firstPhaseLoadStrategy == 2;
    }

    public final int gameOnInteractShowExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.gameOnInteractShowExecutePhaseIndex;
        }
        return -1;
    }

    public final int initWidgetLogDataExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.initWidgetLogDataExecutePhaseIndex;
        }
        return -1;
    }

    public final int likeViewsInitExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.likeViewsInitExecutePhaseIndex;
        }
        return -1;
    }

    public final int loadingViewExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.loadingViewExecutePhaseIndex;
        }
        return -1;
    }

    public final int orientationSwitchVisibleExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.orientationSwitchVisibleExecutePhaseIndex;
        }
        return -1;
    }

    public final int p1InitDataExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.p1InitDataExecutePhaseIndex;
        }
        return -1;
    }

    public final int p2EndExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.p2EndExecutePhaseIndex;
        }
        return -1;
    }

    public final int phaseLoadDelay() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.phaseLoadDelay;
        }
        return 5000;
    }

    public final int preCreatePlayerExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.preCreatePlayerExecutePhaseIndex;
        }
        return 1;
    }

    public final int preloadMatchAnchorResourceExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.preloadMatchAnchorResourceExecutePhaseIndex;
        }
        return -1;
    }

    public final int showSlideGuideExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.showSlideGuideExecutePhaseIndex;
        }
        return -1;
    }

    public final int starCommentLogicExecutePhaseIndex() {
        WidgetCustomLoadOptConfig widgetCustomLoadOptConfig = value;
        if (widgetCustomLoadOptConfig != null) {
            return widgetCustomLoadOptConfig.starCommentLogicExecutePhaseIndex;
        }
        return -1;
    }
}
