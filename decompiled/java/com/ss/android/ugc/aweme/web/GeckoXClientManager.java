package com.ss.android.ugc.aweme.web;

import X.C04TD;
import X.C1551950qUL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class GeckoXClientManager implements IGeckoXClientManager {
    public final HashMap<String, C1551950qUL> LIZ = new HashMap<>();
    public final Map<String, C1551950qUL> LIZIZ = new LinkedHashMap();

    public static IGeckoXClientManager LJ() {
        Object objLIZ = C04TD.LIZ(IGeckoXClientManager.class, false);
        if (objLIZ != null) {
            return (IGeckoXClientManager) objLIZ;
        }
        if (C04TD.c6 == null) {
            synchronized (IGeckoXClientManager.class) {
                if (C04TD.c6 == null) {
                    C04TD.c6 = new GeckoXClientManager();
                }
            }
        }
        return C04TD.c6;
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final C1551950qUL LIZIZ(String str) {
        C1551950qUL c1551950qUL;
        synchronized (this.LIZIZ) {
            try {
                c1551950qUL = (C1551950qUL) ((LinkedHashMap) this.LIZIZ).get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1551950qUL;
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final C1551950qUL LIZLLL(String str) {
        C1551950qUL c1551950qUL;
        if (str != null && str.length() != 0) {
            synchronized (this.LIZ) {
                try {
                    c1551950qUL = this.LIZ.get(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c1551950qUL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final void LIZ(String str, C1551950qUL c1551950qUL) {
        synchronized (this.LIZIZ) {
            try {
                this.LIZIZ.put(str, c1551950qUL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.web.IGeckoXClientManager
    public final void LIZJ(String str, C1551950qUL c1551950qUL) {
        synchronized (this.LIZ) {
            try {
                this.LIZ.put(str, c1551950qUL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
