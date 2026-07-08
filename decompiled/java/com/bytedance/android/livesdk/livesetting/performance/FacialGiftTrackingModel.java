package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FacialGiftTrackingModel {
    public static final TypeAdapter ADAPTER = new FacialGiftTrackingModel_OptTypeAdapter(NormalGson.singleton());

    @C09CT("link_tracking_min_version")
    public Integer linkTrackingMinVersion;

    @C09CT("enable_tracking")
    public Boolean trackingEnabled;

    public FacialGiftTrackingModel() {
        this(Boolean.TRUE, 270900);
    }

    public FacialGiftTrackingModel(Boolean bool, Integer num) {
        this.trackingEnabled = bool;
        this.linkTrackingMinVersion = num;
    }
}
