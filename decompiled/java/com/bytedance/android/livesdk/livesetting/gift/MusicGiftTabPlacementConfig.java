package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MusicGiftTabPlacementConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("first_exposure_threshold")
    public int firstExposureThreshold = 3;

    @C09CT("second_exposure_threshold")
    public int secondExposureThreshold = 6;

    static {
        NormalGson.singleton();
        ADAPTER = new MusicGiftTabPlacementConfig_OptTypeAdapter();
    }
}
