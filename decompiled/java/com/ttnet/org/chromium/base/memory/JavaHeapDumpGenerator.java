package com.ttnet.org.chromium.base.memory;

import X.C08VH;
import X.C2188811AlT;
import android.os.Debug;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class JavaHeapDumpGenerator {
    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error writing to file ");
            sbLIZ.append(str);
            sbLIZ.append(". Error: ");
            sbLIZ.append(e.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Object[] objArr = new Object[0];
            C08VH.LIZIZ(strLIZIZ, C08VH.LIZJ(objArr), objArr);
            return false;
        }
    }
}
