package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_comment_input_dialog_dismiss_fix")
public final class LiveCommentInputDialogDismissFixSetting {
    public static final LiveCommentInputDialogDismissFixSetting INSTANCE = new LiveCommentInputDialogDismissFixSetting();
    public static final InputDialogFixSettingModel DEFAULT = new InputDialogFixSettingModel(false, 0);

    public static final InputDialogFixSettingModel getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        InputDialogFixSettingModel inputDialogFixSettingModel = DEFAULT;
        InputDialogFixSettingModel inputDialogFixSettingModel2 = (InputDialogFixSettingModel) settingsManager.getValueSafely("live_comment_input_dialog_dismiss_fix", inputDialogFixSettingModel);
        return inputDialogFixSettingModel2 != null ? inputDialogFixSettingModel2 : inputDialogFixSettingModel;
    }
}
