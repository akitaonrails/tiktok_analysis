package com.lynx.jsbridge;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;

/* JADX INFO: loaded from: classes4.dex */
public class WebAssemblyBridge {
    public static native void nativeInitWasm(long j);

    public static void LIZ() {
        try {
            long jLongValue = ((Long) Class.forName("com.bytedance.vmsdk.wasm.RegisterWebAssembly").getMethod("registerWebAssembly", new Class[0]).invoke(null, new Object[0])).longValue();
            if (jLongValue != 0) {
                nativeInitWasm(jLongValue);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No webassembly found in the host [ ");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(", ");
            sbLIZ.append(e.getCause());
            sbLIZ.append(" ]");
            LynxLog.e("lynx", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
