package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_skylight_load_async")
public final class TopLiveSkylightLoadAsyncSetting {
    public static final boolean DEFAULT = false;
    public static final TopLiveSkylightLoadAsyncSetting INSTANCE;
    public static final boolean loadAsync;

    static {
        TopLiveSkylightLoadAsyncSetting topLiveSkylightLoadAsyncSetting = new TopLiveSkylightLoadAsyncSetting();
        INSTANCE = topLiveSkylightLoadAsyncSetting;
        loadAsync = topLiveSkylightLoadAsyncSetting.getValue();
    }

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("toplive_skylight_load_async", DEFAULT);
    }

    public final boolean getLoadAsync() {
        return loadAsync;
    }
}
