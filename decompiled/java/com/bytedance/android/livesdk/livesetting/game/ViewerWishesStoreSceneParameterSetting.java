package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "viewer_wishes_store_scene_parameter")
public final class ViewerWishesStoreSceneParameterSetting {
    public static final boolean DEFAULT = false;
    public static final ViewerWishesStoreSceneParameterSetting INSTANCE = new ViewerWishesStoreSceneParameterSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("viewer_wishes_store_scene_parameter", DEFAULT);
    }
}
