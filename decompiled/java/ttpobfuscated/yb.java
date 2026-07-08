package ttpobfuscated;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class yb {
    public final String a(xb xbVar) {
        String strName;
        if (xbVar == null || (strName = xbVar.name()) == null) {
            return "";
        }
        return strName;
    }

    public final xb a(String str) {
        try {
            return xb.valueOf(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
