package com.bytedance.pumbaa.hybrid.external.gateway;

import X.C0WNJ;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface IHybridExternalGateway {
    C0WNJ LIZ();

    void LIZIZ(JSONObject jSONObject, String str, Map map);

    Object LIZJ(Class cls, String str, Object obj);

    void LIZLLL(String str, Map<String, String> map);

    void ensureNotReachHere(Throwable th, String str, Map<String, String> map);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
}
