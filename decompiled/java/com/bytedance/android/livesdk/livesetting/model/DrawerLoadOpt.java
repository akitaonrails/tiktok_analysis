package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawerLoadOpt {
    public static final TypeAdapter ADAPTER = new DrawerLoadOpt_OptTypeAdapter(NormalGson.singleton());

    @C09CT("tt_live_drawer_load_opt_delay_preload_data_duration")
    public double delayDataDuration;

    @C09CT(" tt_live_drawer_load_opt_delay_preload_ui_duration")
    public double delayUIDuration;

    @C09CT("tt_live_drawer_load_opt_default_landing_game")
    public boolean isLandingGame;

    @C09CT("tt_live_drawer_load_opt_preloading_foru_data")
    public boolean isPreLoadingForuData;

    @C09CT("tt_live_drawer_load_opt_preloading_foru_ui")
    public boolean isPreLoadingForuUI;

    @C09CT("tt_live_drawer_load_opt_preloading_game_data")
    public boolean isPreLoadingGameData;

    @C09CT("tt_live_drawer_load_opt_preloading_game_ui")
    public boolean isPreLoadingGameUI;
}
