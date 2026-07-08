package com.lynx.tasm.icu;

import X.C0X8C;
import X.C1285920jZG;
import com.lynx.tasm.service.ILynxI18nService;

/* JADX INFO: loaded from: classes21.dex */
public class ICURegister {
    public static volatile boolean LIZ;

    public static synchronized void LIZ(C0X8C c0x8c) {
        if (LIZ) {
            return;
        }
        ILynxI18nService iLynxI18nService = (ILynxI18nService) C1285920jZG.LIZJ().LIZ(ILynxI18nService.class);
        if (iLynxI18nService != null) {
            LIZ = iLynxI18nService.loadLibrary(c0x8c);
        }
    }

    public static synchronized boolean register(long j) {
        ILynxI18nService iLynxI18nService;
        if (LIZ && (iLynxI18nService = (ILynxI18nService) C1285920jZG.LIZJ().LIZ(ILynxI18nService.class)) != null) {
            return iLynxI18nService.registerNapiEnv(j);
        }
        return false;
    }
}
