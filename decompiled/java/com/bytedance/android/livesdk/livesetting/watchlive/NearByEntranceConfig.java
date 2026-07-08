package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class NearByEntranceConfig {
    public static final TypeAdapter ADAPTER = new NearByEntranceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_banner")
    public boolean enableBanner;

    @C09CT("enable_request_location")
    public boolean enableRequestLocation;

    @C09CT("enable")
    public boolean entranceEnable;

    @C09CT("data_update_time")
    public long dataUpdateTime = 180;

    @C09CT("nearby_reject_location_max_times")
    public int rejectMaxTimes = 3;

    @C09CT("enable_nearby")
    public boolean enableNearby = true;
}
