package com.ss.android.ugc.aweme.livewallpaper;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import X.C842910X4v;
import X.C842930X4x;
import android.content.Context;
import android.content.Intent;
import android.service.wallpaper.WallpaperService;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class AmeLiveWallpaper extends WallpaperService implements IAmeLiveWallpaperHost {
    public volatile IAmeLiveWallpaperDelegate LLILLJJLI;
    public final ArrayList<C842930X4x> LL = new ArrayList<>();
    public final Object LLILLL = new Object();

    @Override // com.ss.android.ugc.aweme.livewallpaper.IAmeLiveWallpaperHost
    public final void LIZIZ() {
        Iterator it2 = new ArrayList(this.LL).iterator();
        while (it2.hasNext()) {
            try {
                IAmeLiveWallpaperEngineDelegate iAmeLiveWallpaperEngineDelegateLIZ = ((C842930X4x) it2.next()).LIZ();
                if (iAmeLiveWallpaperEngineDelegateLIZ != null) {
                    try {
                        iAmeLiveWallpaperEngineDelegateLIZ.LJFF();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public final IAmeLiveWallpaperDelegate LIZJ() {
        boolean zLIZ;
        IAmeLiveWallpaperDelegate iAmeLiveWallpaperDelegate = this.LLILLJJLI;
        if (iAmeLiveWallpaperDelegate != null) {
            return iAmeLiveWallpaperDelegate;
        }
        synchronized (this.LLILLL) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
            if (this.LLILLJJLI != null) {
                return this.LLILLJJLI;
            }
            try {
                C842910X4v.LIZ.getClass();
                zLIZ = C842910X4v.LIZ();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                zLIZ = false;
            }
            if (!zLIZ) {
                try {
                    C842910X4v.LIZ.LIZIZ();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                return null;
            }
            try {
                Object objNewInstance = Class.forName("com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaperDelegateImpl", true, getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof IAmeLiveWallpaperDelegate) {
                    IAmeLiveWallpaperDelegate iAmeLiveWallpaperDelegate2 = (IAmeLiveWallpaperDelegate) objNewInstance;
                    if (iAmeLiveWallpaperDelegate2 != null) {
                        try {
                            iAmeLiveWallpaperDelegate2.onCreate(this, this);
                            this.LLILLJJLI = iAmeLiveWallpaperDelegate2;
                            return iAmeLiveWallpaperDelegate2;
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            return null;
                        }
                    }
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
            }
            return null;
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // android.service.wallpaper.WallpaperService
    public final WallpaperService.Engine onCreateEngine() {
        C842930X4x c842930X4x = new C842930X4x(this);
        this.LL.add(c842930X4x);
        return c842930X4x;
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public final void onDestroy() {
        IAmeLiveWallpaperDelegate iAmeLiveWallpaperDelegate = this.LLILLJJLI;
        if (iAmeLiveWallpaperDelegate != null) {
            try {
                iAmeLiveWallpaperDelegate.onDestroy();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLILLJJLI = null;
        this.LL.clear();
        super.onDestroy();
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.IAmeLiveWallpaperHost
    public final void LIZ(float f) {
        Iterator it2 = new ArrayList(this.LL).iterator();
        while (it2.hasNext()) {
            try {
                IAmeLiveWallpaperEngineDelegate iAmeLiveWallpaperEngineDelegateLIZ = ((C842930X4x) it2.next()).LIZ();
                if (iAmeLiveWallpaperEngineDelegateLIZ != null) {
                    try {
                        iAmeLiveWallpaperEngineDelegateLIZ.LIZLLL(f);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        IAmeLiveWallpaperDelegate iAmeLiveWallpaperDelegateLIZJ = LIZJ();
        if (iAmeLiveWallpaperDelegateLIZJ != null) {
            try {
                iAmeLiveWallpaperDelegateLIZJ.onStartCommand(intent, i, i2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
