package com.lynx.canvas;

import X.AbstractC1286160jZe;
import X.C2188811AlT;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.eventreport.LynxEventReporter;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class LynxKryptonTelemetryService extends AbstractC1286160jZe {
    public final int mInstanceId;

    public LynxKryptonTelemetryService(WeakReference<s> weakReference) {
        s sVar = weakReference.get();
        if (sVar != null) {
            this.mInstanceId = sVar.LLJLILLLLZIIL;
        } else {
            this.mInstanceId = -1;
            LynxLog.e("LynxKryptonTelemetryService", "LynxKryptonTelemetryService created with invalid context");
        }
    }

    @Override // X.AbstractC1286160jZe
    public void reportEvent(String str, Map<String, String> map) {
        if (this.mInstanceId > -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report ");
            sbLIZ.append(str);
            sbLIZ.append(" ");
            sbLIZ.append(map);
            LynxLog.e("LynxKryptonTelemetryService", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("lynxsdk_krypton_");
            sbLIZ2.append(str);
            LynxEventReporter.onEvent(C2188811AlT.LIZIZ(sbLIZ2), new HashMap(map), this.mInstanceId);
        }
    }
}
