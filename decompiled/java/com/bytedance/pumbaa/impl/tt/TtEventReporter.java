package com.bytedance.pumbaa.impl.tt;

import X.C04TD;
import X.C793770VBv;
import com.bytedance.crash.Npth;
import com.bytedance.pumbaa.base2.interfaces.IEventReporter;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class TtEventReporter implements IEventReporter {
    public static IEventReporter LIZJ() {
        Object objLIZ = C04TD.LIZ(IEventReporter.class, false);
        if (objLIZ != null) {
            return (IEventReporter) objLIZ;
        }
        if (C04TD.LJJJLL == null) {
            synchronized (IEventReporter.class) {
                if (C04TD.LJJJLL == null) {
                    C04TD.LJJJLL = new TtEventReporter();
                }
            }
        }
        return C04TD.LJJJLL;
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IEventReporter
    public final void LIZIZ(String str, JSONObject jSONObject) {
        C793770VBv.LJ(str, jSONObject);
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IEventReporter
    public final void LIZ(String str, Throwable th, Map map) {
        Npth.reportBizException("pumbaa_exception", th, str, map);
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IEventReporter
    public final void reportEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
    }
}
