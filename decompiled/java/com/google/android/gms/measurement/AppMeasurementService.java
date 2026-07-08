package com.google.android.gms.measurement;

import X.AbstractC19836612jM;
import X.BinderC19779312a7;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C12Z4;
import X.C12ZV;
import X.C19804712eD;
import X.C19806212eS;
import X.C19836312jJ;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import X.InterfaceC19836812jO;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes31.dex */
public final class AppMeasurementService extends Service implements InterfaceC19836812jO {
    public C19836312jJ<AppMeasurementService> LL;

    public final C19836312jJ<AppMeasurementService> LIZJ() {
        if (this.LL == null) {
            this.LL = new C19836312jJ<>(this);
        }
        return this.LL;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        LIZJ().LIZ();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C19804712eD.LIZIZ(LIZJ().LIZ, null, null).LJIILJJIL().LJIILIIL.LIZJ("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // X.InterfaceC19836812jO
    public final void LIZ(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray<PowerManager.WakeLock> sparseArray = AbstractC19836612jM.LIZ;
            synchronized (sparseArray) {
                try {
                    PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
                    if (wakeLock != null) {
                        wakeLock.release();
                        sparseArray.remove(intExtra);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC19836812jO
    public final void LIZIZ(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC19836812jO
    public final boolean LJII(int i) {
        return stopSelfResult(i);
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
    public final IBinder onBind(Intent intent) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/google/android/gms/measurement/AppMeasurementService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOIDV0vF1YHiWgBzezMWS+Nkthl8V2rA=", new String[]{"016a9"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        C19836312jJ<AppMeasurementService> c19836312jJLIZJ = LIZJ();
        if (intent == null) {
            c19836312jJLIZJ.LIZJ().LJFF.LIZJ("onBind called with null intent");
            return null;
        }
        c19836312jJLIZJ.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC19779312a7(C12Z4.LJIIIZ(c19836312jJLIZJ.LIZ));
        }
        c19836312jJLIZJ.LIZJ().LJIIIIZZ.LIZ(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        LIZJ().LIZIZ(intent);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        LIZJ().LIZLLL(intent);
        return true;
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final C19836312jJ<AppMeasurementService> c19836312jJLIZJ = LIZJ();
        final C19806212eS c19806212eSLJIILJJIL = C19804712eD.LIZIZ(c19836312jJLIZJ.LIZ, null, null).LJIILJJIL();
        if (intent == null) {
            c19806212eSLJIILJJIL.LJIIIIZZ.LIZJ("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c19806212eSLJIILJJIL.LJIILIIL.LIZIZ(Integer.valueOf(i2), "Local AppMeasurementService called. startId, action", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: X.12jK
            public final void LIZ() {
                C19836312jJ c19836312jJ = c19836312jJLIZJ;
                int i3 = i2;
                C19806212eS c19806212eS = c19806212eSLJIILJJIL;
                Intent intent2 = intent;
                if (c19836312jJ.LIZ.LJII(i3)) {
                    c19806212eS.LJIILIIL.LIZ(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    c19836312jJ.LIZJ().LJIILIIL.LIZJ("Completed wakeful intent.");
                    c19836312jJ.LIZ.LIZ(intent2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzmg@399b.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzmg@399b.run");
            }
        };
        C12Z4 c12z4LJIIIZ = C12Z4.LJIIIZ(c19836312jJLIZJ.LIZ);
        c12z4LJIIIZ.LJIIL().LJIILL(new C12ZV(c12z4LJIIIZ, runnable));
        return 2;
    }
}
