package com.ss.android.ugc.aweme.social.creation.edit.spi;

import X.C1450480nqg;
import X.C1455790nzF;
import X.InterfaceC578090Mlr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.social.creation.api.edit.spi.IPendingPhotoCanvasInjectorService;

/* JADX INFO: loaded from: classes23.dex */
public final class PendingPhotoCanvasInjectorServiceImpl implements IPendingPhotoCanvasInjectorService {
    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IPendingPhotoCanvasInjectorService
    public final void LIZIZ(String str) {
        if (str.length() != 0) {
            C1450480nqg.LIZ.putIfAbsent(str, new C1455790nzF());
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IPendingPhotoCanvasInjectorService
    public final void LIZ(String str, CanvasVideoData canvasVideoData) {
        C1455790nzF c1455790nzF;
        InterfaceC578090Mlr interfaceC578090Mlr;
        if (str.length() != 0 && (c1455790nzF = C1450480nqg.LIZ.get(str)) != null) {
            synchronized (c1455790nzF) {
                try {
                    c1455790nzF.LIZ = canvasVideoData;
                    c1455790nzF.LIZIZ = null;
                    c1455790nzF.LIZJ = true;
                    interfaceC578090Mlr = c1455790nzF.LIZLLL;
                    c1455790nzF.LIZLLL = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (interfaceC578090Mlr != null) {
                interfaceC578090Mlr.LIZIZ(canvasVideoData);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IPendingPhotoCanvasInjectorService
    public final void LIZJ(String str, Throwable th) {
        C1455790nzF c1455790nzF;
        InterfaceC578090Mlr interfaceC578090Mlr;
        if (str.length() != 0 && (c1455790nzF = C1450480nqg.LIZ.get(str)) != null) {
            synchronized (c1455790nzF) {
                try {
                    c1455790nzF.LIZ = null;
                    c1455790nzF.LIZIZ = th;
                    c1455790nzF.LIZJ = true;
                    interfaceC578090Mlr = c1455790nzF.LIZLLL;
                    c1455790nzF.LIZLLL = null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            if (interfaceC578090Mlr != null) {
                interfaceC578090Mlr.LIZ(th);
            }
        }
    }
}
