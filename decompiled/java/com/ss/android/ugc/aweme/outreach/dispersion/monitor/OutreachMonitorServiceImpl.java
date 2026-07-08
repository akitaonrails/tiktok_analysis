package com.ss.android.ugc.aweme.outreach.dispersion.monitor;

import X.AnonymousClass0809;
import X.C04TD;
import X.C080E;
import X.C080F;
import X.C080M;
import X.C08VS;
import X.C098200Yq;
import X.C13LP;
import X.C189200o6;
import X.C1911207eA;
import X.C20571615ec;
import X.C2127608Ve;
import X.C2188811AlT;
import X.C23250099c;
import X.C786410Ut5;
import Y.ARunnableS9S1100000_3;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.IOutreachMonitorService;
import com.ss.android.ugc.aweme.outreach.pipeline.OutreachPipelineSampleConfig;
import com.ss.android.ugc.aweme.outreach.pipeline.SignalTriggerSampleConfig;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class OutreachMonitorServiceImpl implements IOutreachMonitorService {
    public static IOutreachMonitorService LIZ() {
        Object objLIZ = C04TD.LIZ(IOutreachMonitorService.class, false);
        if (objLIZ != null) {
            return (IOutreachMonitorService) objLIZ;
        }
        if (C04TD.X2 == null) {
            synchronized (IOutreachMonitorService.class) {
                if (C04TD.X2 == null) {
                    C04TD.X2 = new OutreachMonitorServiceImpl();
                }
            }
        }
        return C04TD.X2;
    }

    @Override // com.ss.android.ugc.aweme.outreach.dispersion.spi.IOutreachMonitorService
    public final void init() {
        Object c098200Yq;
        C23250099c.LIZLLL(C080M.LJ, null, null, new C2127608Ve(null), 3);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C080E.LIZ()) {
            C20571615ec.LIZ.getClass();
            C20571615ec.LIZ("OutreachSignalTriggerMonitor init skipped: pipeline AB disabled");
            return;
        }
        SignalTriggerSampleConfig signalTriggerSampleConfig = ((OutreachPipelineSampleConfig) C1911207eA.LIZIZ.getValue()).signalTriggerSampleConfig;
        if (signalTriggerSampleConfig.events.isEmpty() || signalTriggerSampleConfig.sampleRate <= 0.0d) {
            C20571615ec.LIZ.getClass();
            C20571615ec.LIZ("OutreachSignalTriggerMonitor init skipped: settings empty or sample_rate=0");
            return;
        }
        AnonymousClass0809.LIZ = C13LP.LLIFFJFJJ(signalTriggerSampleConfig.events);
        AnonymousClass0809.LIZIZ = signalTriggerSampleConfig.sampleRate;
        AnonymousClass0809.LIZJ = true;
        C20571615ec c20571615ec = C20571615ec.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachSignalTriggerMonitor init success, events=");
        sbLIZ.append(AnonymousClass0809.LIZ);
        sbLIZ.append(", sampleRate=");
        sbLIZ.append(AnonymousClass0809.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20571615ec.getClass();
        C20571615ec.LIZ(strLIZIZ);
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20571615ec c20571615ec2 = C20571615ec.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("OutreachSignalTriggerMonitor init error: ");
            sbLIZ2.append(thM5exceptionOrNullimpl);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c20571615ec2.getClass();
            C20571615ec.LIZIZ(strLIZIZ2);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.dispersion.spi.IOutreachMonitorService
    public final void onEventV3(String str, Map<String, String> map) {
        List<String> list;
        List<String> list2;
        boolean z = C080M.LIZ;
        if (C080M.LIZ && (((list = C080M.LIZJ) != null && list.contains(str)) || ((list2 = C080M.LIZIZ) != null && list2.contains(str)))) {
            if (((Number) C080F.LIZ.getValue()).intValue() == 1) {
                C786410Ut5.LJJZZIII((Handler) C080M.LJI.getValue(), new ARunnableS9S1100000_3(map, str, 21));
            } else {
                C23250099c.LIZLLL(C080M.LJ, null, null, new C08VS(str, map, null), 3);
            }
        }
        AnonymousClass0809.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.outreach.dispersion.spi.IOutreachMonitorService
    public final void onEventV3(String str, JSONObject jSONObject) {
        boolean z = C080M.LIZ;
        C080M.LIZJ(str, jSONObject);
        AnonymousClass0809.LIZ(str);
    }
}
