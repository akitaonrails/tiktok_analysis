package com.bytedance.android.livestrategy.config;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveFeatureCenterAllConfig {
    public static final TypeAdapter ADAPTER = new LiveFeatureCenterAllConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("appFeatureCenter")
    public FeatureAllCenter appFeatureCenter;

    @C09CT("liveAnchorFeatureCenter")
    public FeatureAllCenter liveAnchorFeatureCenter;

    @C09CT("liveRoomFeatureCenter")
    public FeatureAllCenter liveRoomFeatureCenter;

    @C09CT("liveSessionFeatureCenter")
    public FeatureAllCenter liveSessionFeatureCenter;

    public LiveFeatureCenterAllConfig() {
        this(new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()), new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()), new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()), new FeatureAllCenter(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()));
    }

    public LiveFeatureCenterAllConfig(FeatureAllCenter featureAllCenter, FeatureAllCenter featureAllCenter2, FeatureAllCenter featureAllCenter3, FeatureAllCenter featureAllCenter4) {
        this.appFeatureCenter = featureAllCenter;
        this.liveSessionFeatureCenter = featureAllCenter2;
        this.liveRoomFeatureCenter = featureAllCenter3;
        this.liveAnchorFeatureCenter = featureAllCenter4;
    }
}
