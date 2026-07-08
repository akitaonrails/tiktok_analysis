package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_editor_config")
public final class MultiGuestNoticeboardEditorSetting {
    public static final MultiGuestNoticeboardEditorSetting INSTANCE = new MultiGuestNoticeboardEditorSetting();
    public static final MultiGuestNoticeboardEditorConfig DEFAULT = new MultiGuestNoticeboardEditorConfig(60, 30, 30, 20, 720, 1280, 6, 20, 100);

    private final MultiGuestNoticeboardEditorConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestNoticeboardEditorConfig multiGuestNoticeboardEditorConfig = DEFAULT;
        MultiGuestNoticeboardEditorConfig multiGuestNoticeboardEditorConfig2 = (MultiGuestNoticeboardEditorConfig) settingsManager.getValueSafely("live_editor_config", multiGuestNoticeboardEditorConfig);
        return multiGuestNoticeboardEditorConfig2 != null ? multiGuestNoticeboardEditorConfig2 : multiGuestNoticeboardEditorConfig;
    }

    public final int getHistoryExpireTime() {
        return getValue().historyExpireTime;
    }

    public final int getHistoryMaxCount() {
        return getValue().historyMaxCount;
    }

    public final int getMaxCanvasHeight() {
        return getValue().canvasHeight;
    }

    public final int getMaxCanvasWidth() {
        return getValue().canvasWidth;
    }

    public final int getTemplatePreloadCount() {
        return getValue().templatePreloadCount;
    }

    public final int getTemplateQuickSelectMaxCount() {
        return getValue().templateQuickSelectMaxCount;
    }

    public final int getTextInputMaxCount() {
        return getValue().textInputMaxCount;
    }

    public final int getTextStickerCountLimited() {
        return getValue().textStickerCountLimited;
    }
}
