package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("enable_parse_push_slimroom_new")
public final class EnableParsePushSlimRoomSettingV2 {
    public static final int DEFAULT = 0;
    public static final EnableParsePushSlimRoomSettingV2 INSTANCE = new EnableParsePushSlimRoomSettingV2();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_parse_push_slimroom_new", DEFAULT);
    }

    public final boolean enable() {
        return getValue() > 0;
    }

    public final boolean pushWithRoomData() {
        return getValue() == 1;
    }

    public final boolean pushWithRoomDataAndServerCheck() {
        return getValue() == 2;
    }
}
