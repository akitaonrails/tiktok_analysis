package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_playbook_editor_test_toolkit_enable")
public final class MultiGuestPlaybookEditorTestToolkitSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestPlaybookEditorTestToolkitSetting INSTANCE = new MultiGuestPlaybookEditorTestToolkitSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_playbook_editor_test_toolkit_enable", DEFAULT);
    }
}
