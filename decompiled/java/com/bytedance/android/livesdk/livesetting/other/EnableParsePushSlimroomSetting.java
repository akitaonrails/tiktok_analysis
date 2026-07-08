package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("enable_parse_push_slimroom")
public final class EnableParsePushSlimroomSetting {
    public static final boolean DEFAULT = false;
    public static final EnableParsePushSlimroomSetting INSTANCE = new EnableParsePushSlimroomSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_parse_push_slimroom", DEFAULT);
    }
}
