package com.ss.android.ugc.aweme.services;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public interface IAVMobService {
    <T> T appendCreationParams(T t, Aweme aweme);

    <T> T appendDetailParams(T t, String str, Map<String, String> map);

    <T> T appendValues(T t, Map<String, String> map);

    void onEventV3(String str, Map<String, String> map);

    void onEventV3(String str, JSONObject jSONObject);
}
