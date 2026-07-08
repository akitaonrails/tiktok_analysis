package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("tt_live_drawer_load_opt")
public final class LiveDrawerLoadOptSetting {
    public static final LiveDrawerLoadOptSetting INSTANCE = new LiveDrawerLoadOptSetting();
    public static final DrawerLoadOpt DEFAULT = new DrawerLoadOpt();

    public final DrawerLoadOpt getValue() {
        return (DrawerLoadOpt) SettingsManager.INSTANCE.getValueSafely("tt_live_drawer_load_opt", DEFAULT);
    }
}
