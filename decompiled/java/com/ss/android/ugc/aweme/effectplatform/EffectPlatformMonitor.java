package com.ss.android.ugc.aweme.effectplatform;

import X.C0CHQ;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public class EffectPlatformMonitor implements IMonitorService {
    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
        C0CHQ.LIZ().LIZJ().LJII(str, jSONObject);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
        C0CHQ.LIZ().LIZJ().LJIILIIL(str, str2, jSONObject);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorDirectOnTimer(String str, String str2, float f) {
        C0CHQ.LIZ().LIZJ().LIZIZ(f, str, str2);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorOnTimer(String str, String str2, float f) {
        C0CHQ.LIZ().LIZJ().LIZIZ(f, str, str2);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C0CHQ.LIZ().LIZJ().LIZLLL(str, i, jSONObject, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C0CHQ.LIZ().LIZJ().LJIIIZ(str, i, jSONObject, jSONObject2);
    }
}
