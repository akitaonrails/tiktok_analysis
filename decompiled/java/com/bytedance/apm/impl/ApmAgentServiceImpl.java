package com.bytedance.apm.impl;

import X.C0V5Q;
import X.C0VD9;
import X.C787900UvU;
import X.C792400V6o;
import X.C793770VBv;
import Y.ARunnableS18S1100000_13;
import android.content.Context;
import com.bytedance.services.apm.api.IApmAgent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ApmAgentServiceImpl implements IApmAgent {
    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(C0V5Q c0v5q) {
        throw null;
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        C793770VBv.LJ(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorExceptionLog(String str, JSONObject jSONObject) {
        JSONObject jSONObjectLJIILLIIL;
        if (C793770VBv.LIZLLL) {
            jSONObjectLJIILLIIL = C793770VBv.LJIILL(jSONObject);
        } else {
            jSONObjectLJIILLIIL = C793770VBv.LJIILLIIL(jSONObject);
        }
        C787900UvU.LIZ.LIZJ(new ARunnableS18S1100000_13(str, jSONObjectLJIILLIIL, 26));
        if (C792400V6o.LIZJ) {
            C0VD9.LIZ().LIZIZ(new ARunnableS18S1100000_13(str, jSONObjectLJIILLIIL, 27));
        }
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorLog(String str, JSONObject jSONObject) {
        C793770VBv.LJ(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C793770VBv.LJFF(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C793770VBv.LJIIJJI(str, i, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C793770VBv.LJIIIZ(str, i, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void reportLegacyMonitorLog(Context context, long j, long j2, boolean z) {
        Context context2 = C792400V6o.LIZ;
    }
}
