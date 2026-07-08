package com.bytedance.pitaya.api.feature.store;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PTYFeatureGroup implements ReflectionCall {
    public abstract List<PTYFeatureDescription> getDescription();

    public abstract String getGroupName();

    public abstract List<String> getTrackEvents();

    public abstract void traceEvent(String str, JSONObject jSONObject);

    private final void traceEvent(String str, String str2) {
        try {
            traceEvent(str, new JSONObject(str2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
