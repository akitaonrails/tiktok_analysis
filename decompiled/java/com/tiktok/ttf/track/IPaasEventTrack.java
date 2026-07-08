package com.tiktok.ttf.track;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface IPaasEventTrack {
    void onEventV3(String str, Map<String, String> map);

    void onEventV3(String str, JSONObject jSONObject);
}
