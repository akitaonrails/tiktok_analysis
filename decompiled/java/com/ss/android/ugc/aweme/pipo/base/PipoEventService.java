package com.ss.android.ugc.aweme.pipo.base;

import X.C04TD;
import X.C0VCC;
import X.C0VCZ;
import X.C1717770unn;
import X.C1AF0;
import X.C290830Bab;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.IPipoEventService;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoEventService implements IPipoEventService {
    public C0VCC LIZ;
    public boolean LIZIZ;

    static {
        new Object() { // from class: X.0vMg
        };
    }

    public static IPipoEventService LIZJ() {
        Object objLIZ = C04TD.LIZ(IPipoEventService.class, false);
        if (objLIZ != null) {
            return (IPipoEventService) objLIZ;
        }
        if (C04TD.c3 == null) {
            synchronized (IPipoEventService.class) {
                if (C04TD.c3 == null) {
                    C04TD.c3 = new PipoEventService();
                }
            }
        }
        return C04TD.c3;
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoEventService
    public final void LIZIZ() throws JSONException {
        if (C290830Bab.LIZ() && !this.LIZIZ) {
            SDKMonitorUtils.setConfigUrl("4108", Collections.singletonList("https://mon.isnssdk.com/monitor/appmonitor/v2/settings"));
            SDKMonitorUtils.setDefaultReportUrl("4108", Collections.singletonList("https://mon.isnssdk.com/monitor/collect/"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_id", C1717770unn.LIZJ().getDeviceId());
            jSONObject.put("host_aid", "1180");
            jSONObject.put("sdk_version", "1.0.0.0");
            jSONObject.put("channel", C1717770unn.LIZJ().getChannel());
            jSONObject.put("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
            jSONObject.put("update_version_code", String.valueOf(C1717770unn.LIZJ().getVersionInfo().LIZIZ));
            SDKMonitorUtils.initMonitor(C1717770unn.LIZJ().getApplicationContext(), "4108", jSONObject, new C0VCZ() { // from class: X.07Rr
                @Override // X.C0VCZ
                public final String getSessionId() {
                    return null;
                }

                @Override // X.C0VCZ
                public final Map<String, String> getCommonParams() {
                    HashMap map = new HashMap();
                    map.put("oversea", "1");
                    return map;
                }
            });
            this.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.IPipoEventService
    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (!C290830Bab.LIZ()) {
                return;
            }
            LIZIZ();
            if (this.LIZ == null) {
                this.LIZ = SDKMonitorUtils.getInstance("4108");
            }
            C0VCC c0vcc = this.LIZ;
            if (c0vcc != null) {
                c0vcc.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}
