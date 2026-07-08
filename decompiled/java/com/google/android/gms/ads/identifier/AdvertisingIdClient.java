package com.google.android.gms.ads.identifier;

import X.C089W;
import X.C0W3J;
import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C812630VuH;
import X.C812660VuK;
import X.C812710VuP;
import X.C829100Wfk;
import X.InterfaceC812680VuM;
import X.ServiceConnectionC812650VuJ;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class AdvertisingIdClient {
    public ServiceConnectionC812650VuJ LIZ;
    public InterfaceC812680VuM LIZIZ;
    public boolean LIZJ;
    public final Object LIZLLL = new Object();
    public C089W LJ;
    public final Context LJFF;
    public final boolean LJI;
    public final long LJII;

    public static final class Info {
        public final String LIZ;
        public final boolean LIZIZ;

        public Info(String str, boolean z) {
            this.LIZ = str;
            this.LIZIZ = z;
        }

        public final String getId() {
            return this.LIZ;
        }

        public final String toString() {
            String str = this.LIZ;
            boolean z = this.LIZIZ;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(boolean z, Context context, boolean z2) {
        Context contextN3;
        C0W3J.LJIIIIZZ(context);
        if (z && (contextN3 = C786410Ut5.N3(context)) != null) {
            context = contextN3;
        }
        this.LJFF = context;
        this.LIZJ = false;
        this.LJII = -1L;
        this.LJI = z2;
    }

    public static ServiceConnectionC812650VuJ LIZJ(Context context, boolean z) throws IOException, C812710VuP {
        try {
            C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 0);
            int iIsGooglePlayServicesAvailable = C829100Wfk.getInstance().isGooglePlayServicesAvailable(context, 12451000);
            if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            ServiceConnectionC812650VuJ serviceConnectionC812650VuJ = new ServiceConnectionC812650VuJ();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (C812630VuH.LIZIZ().LIZ(context, intent, serviceConnectionC812650VuJ, 1)) {
                    return serviceConnectionC812650VuJ;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C812710VuP(9);
        }
    }

    public static void LJFF(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return;
        }
        final HashMap map = new HashMap();
        map.put("app_context", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        if (info != null) {
            map.put("limit_ad_tracking", info.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
            if (C2204961BRm.LLLLLIL(info, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9ekUFh1BJP6s0fCcTZvdIjrISLOm3Bz/AZUJ29N4ewPvp", new String[]{"016a9"})) != null) {
                map.put("ad_id_size", Integer.toString(C2204961BRm.LLLLLIL(info, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9ekUFh1BJP6s0fCcTZvdIjrISLOm3Bz/AZUJ29N4ewPvp", new String[]{"016a9"})).length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new BPEAThread() { // from class: X.08ZQ
            public final void LIZLLL() {
                Map map2 = map;
                Uri.Builder builderBuildUpon = UriProtector.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str2 : map2.keySet()) {
                    builderBuildUpon.appendQueryParameter(str2, (String) map2.get(str2));
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) LIZJ(new URL(builderBuildUpon.build().toString()));
                    try {
                        httpURLConnection.getResponseCode();
                        httpURLConnection.disconnect();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                } catch (IOException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                } catch (IndexOutOfBoundsException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                } catch (RuntimeException e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("zza@638b.run");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    LIZLLL();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("zza@638b.run");
            }

            public static URLConnection LIZJ(URL url) {
                return C2204961BRm.e0(url, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9ekUFh1BJP6s0fCcTZvdzkKU=", new String[]{"016a9"}));
            }
        }.start();
    }

    public final void LIZ() {
        C0W3J.LJII("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.LJFF == null || this.LIZ == null) {
                    return;
                }
                try {
                    if (this.LIZJ) {
                        C812630VuH.LIZIZ().LIZJ(this.LJFF, this.LIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                this.LIZJ = false;
                this.LIZIZ = null;
                this.LIZ = null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final Info LIZIZ() {
        Info info;
        C0W3J.LJII("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.LIZJ) {
                    synchronized (this.LIZLLL) {
                        try {
                            C089W c089w = this.LJ;
                            if (c089w == null || !c089w.LLILZ) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    try {
                        LJ();
                        if (!this.LIZJ) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                C0W3J.LJIIIIZZ(this.LIZ);
                C0W3J.LJIIIIZZ(this.LIZIZ);
                try {
                    info = new Info(this.LIZIZ.getId(), this.LIZIZ.LLLZL(true));
                } catch (RemoteException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LJI();
        return info;
    }

    public final void LJ() {
        C0W3J.LJII("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.LIZJ) {
                    LIZ();
                }
                ServiceConnectionC812650VuJ serviceConnectionC812650VuJLIZJ = LIZJ(this.LJFF, this.LJI);
                this.LIZ = serviceConnectionC812650VuJLIZJ;
                this.LIZIZ = LIZLLL(serviceConnectionC812650VuJLIZJ);
                this.LIZJ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI() {
        synchronized (this.LIZLLL) {
            try {
                C089W c089w = this.LJ;
                if (c089w != null) {
                    c089w.LLILLL.countDown();
                    try {
                        this.LJ.join();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (this.LJII > 0) {
                    this.LJ = new C089W(this, this.LJII);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        LIZ();
        super.finalize();
    }

    public static InterfaceC812680VuM LIZLLL(ServiceConnectionC812650VuJ serviceConnectionC812650VuJ) throws IOException {
        try {
            IBinder iBinderLIZ = serviceConnectionC812650VuJ.LIZ(TimeUnit.MILLISECONDS);
            IInterface iInterfaceQueryLocalInterface = iBinderLIZ.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC812680VuM) {
                return (InterfaceC812680VuM) iInterfaceQueryLocalInterface;
            }
            return new C812660VuK(iBinderLIZ);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new IOException(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context r9) {
        /*
            X.0UtT r2 = new X.0UtT
            r2.<init>(r9)
            java.lang.String r0 = "gads:ad_id_app_context:enabled"
            boolean r4 = r2.LIZ(r0)
            java.lang.String r3 = "gads:ad_id_app_context:ping_ratio"
            android.content.SharedPreferences r0 = X.C2080308Cz.LIZ
            if (r0 == 0) goto L30
            java.lang.reflect.Field r0 = X.C2080308Cz.LIZJ
            if (r0 == 0) goto L30
            monitor-enter(r2)
            java.lang.reflect.Field r1 = X.C2080308Cz.LIZJ     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Field r1 = X.C2080308Cz.LIZJ     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences r0 = X.C2080308Cz.LIZ     // Catch: java.lang.Throwable -> L24
            r1.set(r2, r0)     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            goto L30
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L30:
            r1 = 0
            android.content.SharedPreferences r0 = r2.LIZ     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L3e
            float r5 = r0.getFloat(r3, r1)     // Catch: java.lang.Throwable -> L3a
            goto L3f
        L3a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3e:
            r5 = 0
        L3f:
            java.lang.String r8 = r2.LIZIZ()
            java.lang.String r0 = "gads:ad_id_use_persistent_service:enabled"
            boolean r0 = r2.LIZ(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient r2 = new com.google.android.gms.ads.identifier.AdvertisingIdClient
            r2.<init>(r4, r9, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L66
            r2.LJ()     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r3 = r2.LIZIZ()     // Catch: java.lang.Throwable -> L66
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L66
            long r6 = r6 - r0
            r9 = 0
            LJFF(r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L66
            r2.LIZ()
            return r3
        L66:
            r9 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r9)     // Catch: java.lang.Throwable -> L71
            r3 = 0
            r6 = -1
            LJFF(r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L71
            throw r9     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L71
            r2.LIZ()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(android.content.Context):com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }
}
