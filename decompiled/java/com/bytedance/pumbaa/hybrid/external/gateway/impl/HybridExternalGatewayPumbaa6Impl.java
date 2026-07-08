package com.bytedance.pumbaa.hybrid.external.gateway.impl;

import X.C01GW;
import X.C098200Yq;
import X.C0WNJ;
import X.C189200o6;
import X.C2097608Jq;
import X.C308480C7i;
import X.C452501pT;
import X.C823280WRi;
import com.bytedance.pumbaa.base2.interfaces.IEventReporter;
import com.bytedance.pumbaa.hybrid.external.gateway.IHybridExternalGateway;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tiktok.pns.ldp.api.ILDPService;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS129S1200000_13;
import kotlin.jvm.internal.AwS79S1300000_13;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridExternalGatewayPumbaa6Impl implements IHybridExternalGateway {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(46));
    public final Map<String, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("tech_end", "mobile"), new Pair("tech_aspect", "hybrid"));

    @Override // com.bytedance.pumbaa.hybrid.external.gateway.IHybridExternalGateway
    public final C0WNJ LIZ() {
        return (C0WNJ) this.LIZ.getValue();
    }

    @Override // com.bytedance.pumbaa.hybrid.external.gateway.IHybridExternalGateway
    public final void LIZLLL(String str, Map<String, String> map) {
        Unit unit;
        if (map == null) {
            return;
        }
        try {
            ILDPService iLDPService = (ILDPService) ServiceManager.get().getService(ILDPService.class);
            if (iLDPService != null) {
                iLDPService.LIZLLL(str, new AwS129S1200000_13(str, (String) map, (Map<String, String>) this, (HybridExternalGatewayPumbaa6Impl) 1));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.external.gateway.IHybridExternalGateway
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
        C823280WRi.LIZ.getClass();
        C823280WRi.LJIIIZ();
        IEventReporter iEventReporter = C823280WRi.LIZIZ;
        if (iEventReporter != null) {
            iEventReporter.LIZIZ(str, jSONObject);
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.external.gateway.IHybridExternalGateway
    public final void LIZIZ(JSONObject jSONObject, String str, Map map) {
        Unit unit;
        if (map == null) {
            return;
        }
        try {
            ILDPService iLDPService = (ILDPService) ServiceManager.get().getService(ILDPService.class);
            if (iLDPService != null) {
                iLDPService.LIZLLL(str, new AwS79S1300000_13(str, (String) map, (Map<String, String>) this, (HybridExternalGatewayPumbaa6Impl) jSONObject, (JSONObject) 2));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.external.gateway.IHybridExternalGateway
    public final Object LIZJ(Class cls, String str, Object obj) {
        return C308480C7i.LIZLLL(cls, str, obj);
    }

    @Override // com.bytedance.pumbaa.hybrid.external.gateway.IHybridExternalGateway
    public final void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        if (!map.containsKey("pumbaa_exception_type")) {
            map.put("pumbaa_exception_type", "hybrid");
        }
        C823280WRi.LJ(th, str, map);
    }

    @Override // com.bytedance.pumbaa.hybrid.external.gateway.IHybridExternalGateway
    public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C823280WRi.LJI(str, jSONObject, jSONObject2, jSONObject3);
    }
}
