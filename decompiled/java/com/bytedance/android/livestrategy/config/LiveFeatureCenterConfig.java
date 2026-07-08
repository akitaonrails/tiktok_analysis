package com.bytedance.android.livestrategy.config;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveFeatureCenterConfig {
    public static final TypeAdapter ADAPTER = new LiveFeatureCenterConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("appFeatureCenter")
    public FeatureCenter appFeatureCenter;

    @C09CT("liveAnchorFeatureCenter")
    public FeatureCenter liveAnchorFeatureCenter;

    @C09CT("liveRoomFeatureCenter")
    public FeatureCenter liveRoomFeatureCenter;

    @C09CT("liveSessionFeatureCenter")
    public FeatureCenter liveSessionFeatureCenter;

    public LiveFeatureCenterConfig() {
        this(new FeatureCenter(null, null, null, null, 15, null), new FeatureCenter(null, null, null, null, 15, null), new FeatureCenter(null, null, null, null, 15, null), new FeatureCenter(null, null, null, null, 15, null));
    }

    public LiveFeatureCenterConfig(FeatureCenter featureCenter, FeatureCenter featureCenter2, FeatureCenter featureCenter3, FeatureCenter featureCenter4) {
        this.appFeatureCenter = featureCenter;
        this.liveSessionFeatureCenter = featureCenter2;
        this.liveRoomFeatureCenter = featureCenter3;
        this.liveAnchorFeatureCenter = featureCenter4;
    }
}
