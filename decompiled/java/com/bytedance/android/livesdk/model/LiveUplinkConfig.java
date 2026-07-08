package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveUplinkConfig {
    public static final TypeAdapter ADAPTER = new LiveUplinkConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("uplink_strategy")
    public int uplinkStrategy = 1;

    @C09CT("ws_uplink_wait_timeout")
    public long wsUplinkWaitTimeout = 15000;

    @C09CT("uplink_api_allowed_list")
    public Map<String, ? extends Map<String, Long>> uplinkApiAllowedList = new HashMap();

    @C09CT("uplink_api_alternative_service_id_list")
    public Map<String, ? extends Map<String, Long>> uplinkApiAlternativeServiceIdList = new HashMap();

    @C09CT("ws_fail_fallback_to_http")
    public boolean wsFailFallbackToHttp = true;
}
