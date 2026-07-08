package com.ss.bduploader.smartserver;

import X.C1509310pNZ;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface SmartServiceInterface {
    void configServer();

    int getIntelligentInput(JSONObject jSONObject, C1509310pNZ c1509310pNZ);

    void preloadEnv();

    void runAsync(Map map, SmartServiceListener smartServiceListener);

    float runAsyncJsonObject(JSONObject jSONObject, SmartServiceListener smartServiceListener);

    float runSync(Map map);

    float runSyncJsonObject(JSONObject jSONObject);

    boolean serviceEnabled();

    void setIntValue(int i, int i2);

    void setStringValue(int i, String str);
}
