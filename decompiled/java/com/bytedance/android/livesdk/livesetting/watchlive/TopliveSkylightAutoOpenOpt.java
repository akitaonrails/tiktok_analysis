package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_skylight_auto_open_opt")
public final class TopliveSkylightAutoOpenOpt {
    public static final boolean DEFAULT = false;
    public static final TopliveSkylightAutoOpenOpt INSTANCE;
    public static final boolean autoOpenOpt;

    static {
        TopliveSkylightAutoOpenOpt topliveSkylightAutoOpenOpt = new TopliveSkylightAutoOpenOpt();
        INSTANCE = topliveSkylightAutoOpenOpt;
        autoOpenOpt = topliveSkylightAutoOpenOpt.getValue();
    }

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("toplive_skylight_auto_open_opt", DEFAULT);
    }

    public final boolean getAutoOpenOpt() {
        return autoOpenOpt;
    }
}
