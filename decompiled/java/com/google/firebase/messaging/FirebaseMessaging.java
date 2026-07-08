package com.google.firebase.messaging;

import X.AbstractC835450Wpz;
import X.C0VH4;
import X.C0W3J;
import X.C786410Ut5;
import X.C800340VaS;
import X.C800350VaT;
import X.C811030Vrh;
import X.C811090Vrn;
import X.C812200Vta;
import X.C812300Vtk;
import X.C814400Vx8;
import X.C818880WAk;
import X.C822650WOx;
import X.C822660WOy;
import X.C835460Wq0;
import X.C835510Wq5;
import X.C835520Wq6;
import X.InterfaceC811000Vre;
import X.InterfaceC811540VsW;
import X.InterfaceC812380Vts;
import X.InterfaceC812410Vtv;
import X.InterfaceC812420Vtw;
import X.InterfaceC812430Vtx;
import X.InterfaceC814220Vwq;
import X.InterfaceC835680WqM;
import X.InterfaceC835700WqO;
import X.InterfaceC835710WqP;
import X.RunnableC790530Uzj;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class FirebaseMessaging {
    public static final long LJIIL = TimeUnit.HOURS.toSeconds(8);
    public static C800340VaS LJIILIIL;
    public static InterfaceC814220Vwq LJIILJJIL;
    public static C822660WOy LJIILL;
    public final C818880WAk LIZ;
    public final InterfaceC811000Vre LIZIZ;
    public final InterfaceC812420Vtw LIZJ;
    public final Context LIZLLL;
    public final C812300Vtk LJ;
    public final C811090Vrn LJFF;
    public final C811030Vrh LJI;
    public final Executor LJII;
    public final Executor LJIIIIZZ;
    public final Executor LJIIIZ;
    public final C812200Vta LJIIJ;
    public boolean LJIIJJI;

    public FirebaseMessaging() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LIZ() throws IOException {
        AbstractC835450Wpz abstractC835450WpzLJIIIIZZ;
        InterfaceC811000Vre interfaceC811000Vre = this.LIZIZ;
        if (interfaceC811000Vre != null) {
            try {
                return (String) C835460Wq0.LIZ(interfaceC811000Vre.LIZJ());
            } catch (InterruptedException | ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IOException(e);
            }
        }
        final C800350VaT c800350VaTLJFF = LJFF();
        if (!LJIIJ(c800350VaTLJFF)) {
            return c800350VaTLJFF.LIZ;
        }
        final String strLIZJ = C812200Vta.LIZJ(this.LIZ);
        final C811090Vrn c811090Vrn = this.LJFF;
        synchronized (c811090Vrn) {
            abstractC835450WpzLJIIIIZZ = (AbstractC835450Wpz) c811090Vrn.LIZIZ.get(strLIZJ);
            if (abstractC835450WpzLJIIIIZZ == null) {
                C812300Vtk c812300Vtk = this.LJ;
                abstractC835450WpzLJIIIIZZ = c812300Vtk.LIZ(c812300Vtk.LIZJ(C812200Vta.LIZJ(c812300Vtk.LIZ), "*", new Bundle())).LJIILLIIL(this.LJIIIZ, new InterfaceC835700WqO() { // from class: X.0Vrf
                    @Override // X.InterfaceC835700WqO
                    public final C835510Wq5 then(Object obj) {
                        String strJ3;
                        FirebaseMessaging firebaseMessaging = this.LIZ;
                        String str = strLIZJ;
                        C800350VaT c800350VaT = c800350VaTLJFF;
                        String str2 = (String) obj;
                        C800340VaS c800340VaSLIZLLL = FirebaseMessaging.LIZLLL(firebaseMessaging.LIZLLL);
                        String strLJ = firebaseMessaging.LJ();
                        String strLIZ = firebaseMessaging.LJIIJ.LIZ();
                        synchronized (c800340VaSLIZLLL) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("token", str2);
                                jSONObject.put("appVersion", strLIZ);
                                jSONObject.put("timestamp", jCurrentTimeMillis);
                                strJ3 = C786410Ut5.J3(jSONObject);
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            if (strJ3 != null) {
                                SharedPreferences.Editor editorEdit = c800340VaSLIZLLL.LIZ.edit();
                                editorEdit.putString(C800340VaS.LIZ(strLJ, str), strJ3);
                                editorEdit.commit();
                            }
                        }
                        if (c800350VaT == null || !str2.equals(c800350VaT.LIZ)) {
                            C818880WAk c818880WAk = firebaseMessaging.LIZ;
                            c818880WAk.LIZ();
                            if ("[DEFAULT]".equals(c818880WAk.LIZIZ)) {
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new C811600Vsc(firebaseMessaging.LIZLLL).LIZLLL(intent);
                            }
                        }
                        return C835460Wq0.LJ(str2);
                    }
                }).LJIIIIZZ(c811090Vrn.LIZ, new InterfaceC835680WqM() { // from class: X.0Vrl
                    @Override // X.InterfaceC835680WqM
                    public final Object LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                        C811090Vrn c811090Vrn2 = c811090Vrn;
                        String str = strLIZJ;
                        synchronized (c811090Vrn2) {
                            try {
                                c811090Vrn2.LIZIZ.remove(str);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return abstractC835450Wpz;
                    }
                });
                c811090Vrn.LIZIZ.put(strLIZJ, abstractC835450WpzLJIIIIZZ);
            }
        }
        try {
            return (String) C835460Wq0.LIZ(abstractC835450WpzLJIIIIZZ);
        } catch (InterruptedException | ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IOException(e2);
        }
    }

    public final C835510Wq5 LIZIZ() {
        if (this.LIZIZ != null) {
            final C835520Wq6 c835520Wq6 = new C835520Wq6();
            this.LJII.execute(new Runnable() { // from class: X.0Vrd
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging firebaseMessaging = this.LL;
                    C835520Wq6 c835520Wq62 = c835520Wq6;
                    firebaseMessaging.getClass();
                    C1C7U.LIZ("FirebaseMessaging@b71a.deleteToken$1L");
                    try {
                        InterfaceC811000Vre interfaceC811000Vre = firebaseMessaging.LIZIZ;
                        C812200Vta.LIZJ(firebaseMessaging.LIZ);
                        interfaceC811000Vre.LIZIZ();
                        c835520Wq62.LIZIZ(null);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c835520Wq62.LIZ(e);
                    }
                    C1C7U.LIZIZ("FirebaseMessaging@b71a.deleteToken$1L");
                }
            });
            return c835520Wq6.LIZ;
        }
        if (LJFF() == null) {
            return C835460Wq0.LJ(null);
        }
        final C835520Wq6 c835520Wq62 = new C835520Wq6();
        C786410Ut5.i4(new C0VH4("Firebase-Messaging-Network-Io")).execute(new Runnable() { // from class: X.0Vrc
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = this.LL;
                C835520Wq6 c835520Wq63 = c835520Wq62;
                firebaseMessaging.getClass();
                C1C7U.LIZ("FirebaseMessaging@b71a.deleteToken$2L");
                try {
                    C812300Vtk c812300Vtk = firebaseMessaging.LJ;
                    c812300Vtk.getClass();
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("delete", "1", bundle);
                    C835460Wq0.LIZ(c812300Vtk.LIZ(c812300Vtk.LIZJ(C812200Vta.LIZJ(c812300Vtk.LIZ), "*", bundle)));
                    C800340VaS c800340VaSLIZLLL = FirebaseMessaging.LIZLLL(firebaseMessaging.LIZLLL);
                    String strLJ = firebaseMessaging.LJ();
                    String strLIZJ = C812200Vta.LIZJ(firebaseMessaging.LIZ);
                    synchronized (c800340VaSLIZLLL) {
                        String strLIZ = C800340VaS.LIZ(strLJ, strLIZJ);
                        SharedPreferences.Editor editorEdit = c800340VaSLIZLLL.LIZ.edit();
                        editorEdit.remove(strLIZ);
                        editorEdit.commit();
                    }
                    c835520Wq63.LIZIZ(null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c835520Wq63.LIZ(e);
                }
                C1C7U.LIZIZ("FirebaseMessaging@b71a.deleteToken$2L");
            }
        });
        return c835520Wq62.LIZ;
    }

    public final String LJ() {
        C818880WAk c818880WAk = this.LIZ;
        c818880WAk.LIZ();
        return "[DEFAULT]".equals(c818880WAk.LIZIZ) ? "" : this.LIZ.LIZJ();
    }

    public final C800350VaT LJFF() {
        C800350VaT c800350VaTLIZ;
        C800340VaS c800340VaSLIZLLL = LIZLLL(this.LIZLLL);
        String strLJ = LJ();
        String strLIZJ = C812200Vta.LIZJ(this.LIZ);
        synchronized (c800340VaSLIZLLL) {
            c800350VaTLIZ = C800350VaT.LIZ(c800340VaSLIZLLL.LIZ.getString(C800340VaS.LIZ(strLJ, strLIZJ), null));
        }
        return c800350VaTLIZ;
    }

    public final boolean LJI() {
        boolean zBooleanValue;
        C811030Vrh c811030Vrh = this.LJI;
        synchronized (c811030Vrh) {
            c811030Vrh.LIZ();
            Boolean bool = c811030Vrh.LIZJ;
            zBooleanValue = bool != null ? bool.booleanValue() : c811030Vrh.LIZLLL.LIZ.LJI();
        }
        return zBooleanValue;
    }

    public final void LJIIIIZZ() {
        InterfaceC811000Vre interfaceC811000Vre = this.LIZIZ;
        if (interfaceC811000Vre != null) {
            interfaceC811000Vre.getToken();
        } else if (LJIIJ(LJFF())) {
            synchronized (this) {
                if (!this.LJIIJJI) {
                    LJIIIZ(0L);
                }
            }
        }
    }

    public static synchronized C800340VaS LIZLLL(Context context) {
        if (LJIILIIL == null) {
            LJIILIIL = new C800340VaS(context);
        }
        return LJIILIIL;
    }

    public static synchronized FirebaseMessaging getInstance(C818880WAk c818880WAk) {
        FirebaseMessaging firebaseMessaging;
        c818880WAk.LIZ();
        firebaseMessaging = (FirebaseMessaging) c818880WAk.LIZLLL.LIZIZ(FirebaseMessaging.class);
        C0W3J.LJIIIZ(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final synchronized void LJII(boolean z) {
        this.LJIIJJI = z;
    }

    public final synchronized void LJIIIZ(long j) {
        LIZJ(j, new RunnableC790530Uzj(this, Math.min(Math.max(30L, 2 * j), LJIIL)));
        this.LJIIJJI = true;
    }

    public final boolean LJIIJ(C800350VaT c800350VaT) {
        if (c800350VaT == null) {
            return true;
        }
        String strLIZ = this.LJIIJ.LIZ();
        if (System.currentTimeMillis() > c800350VaT.LIZJ + C800350VaT.LIZLLL || !strLIZ.equals(c800350VaT.LIZIZ)) {
            return true;
        }
        return false;
    }

    public static void LIZJ(long j, RunnableC790530Uzj runnableC790530Uzj) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (LJIILL == null) {
                    LJIILL = new C822660WOy(1, new C0VH4("TAG"));
                }
                LJIILL.schedule(runnableC790530Uzj, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public FirebaseMessaging(C818880WAk c818880WAk, InterfaceC811000Vre interfaceC811000Vre, InterfaceC812380Vts<InterfaceC812430Vtx> interfaceC812380Vts, InterfaceC812380Vts<InterfaceC812410Vtv> interfaceC812380Vts2, InterfaceC812420Vtw interfaceC812420Vtw, InterfaceC814220Vwq interfaceC814220Vwq, InterfaceC811540VsW interfaceC811540VsW) {
        c818880WAk.LIZ();
        final C812200Vta c812200Vta = new C812200Vta(c818880WAk.LIZ);
        final C812300Vtk c812300Vtk = new C812300Vtk(c818880WAk, c812200Vta, interfaceC812380Vts, interfaceC812380Vts2, interfaceC812420Vtw);
        ExecutorService executorServiceI4 = C786410Ut5.i4(new C0VH4("Firebase-Messaging-Task"));
        C822660WOy c822660WOy = new C822660WOy(1, new C0VH4("Firebase-Messaging-Init"));
        C822650WOx c822650WOx = new C822650WOx(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0VH4("Firebase-Messaging-File-Io"));
        LJIILJJIL = interfaceC814220Vwq;
        this.LIZ = c818880WAk;
        this.LIZIZ = interfaceC811000Vre;
        this.LIZJ = interfaceC812420Vtw;
        this.LJI = new C811030Vrh(this, interfaceC811540VsW);
        c818880WAk.LIZ();
        final Context context = c818880WAk.LIZ;
        this.LIZLLL = context;
        C814400Vx8 c814400Vx8 = new C814400Vx8();
        this.LJIIJ = c812200Vta;
        this.LJIIIIZZ = executorServiceI4;
        this.LJ = c812300Vtk;
        this.LJFF = new C811090Vrn(executorServiceI4);
        this.LJII = c822660WOy;
        this.LJIIIZ = c822650WOx;
        c818880WAk.LIZ();
        Context context2 = c818880WAk.LIZ;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(c814400Vx8);
        }
        if (interfaceC811000Vre != null) {
            interfaceC811000Vre.LIZ();
        }
        c822660WOy.execute(new Runnable() { // from class: X.0Vrj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue;
                FirebaseMessaging firebaseMessaging = this.LL;
                firebaseMessaging.getClass();
                C1C7U.LIZ("FirebaseMessaging@b71a.<init>$1L");
                C811030Vrh c811030Vrh = firebaseMessaging.LJI;
                synchronized (c811030Vrh) {
                    c811030Vrh.LIZ();
                    Boolean bool = c811030Vrh.LIZJ;
                    zBooleanValue = bool != null ? bool.booleanValue() : c811030Vrh.LIZLLL.LIZ.LJI();
                }
                if (zBooleanValue) {
                    firebaseMessaging.LJIIIIZZ();
                }
                C1C7U.LIZIZ("FirebaseMessaging@b71a.<init>$1L");
            }
        });
        final C822660WOy c822660WOy2 = new C822660WOy(1, new C0VH4("Firebase-Messaging-Topics-Io"));
        C835460Wq0.LIZJ(c822660WOy2, new Callable() { // from class: X.0VrX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C810940VrY c810940VrY;
                Context context3 = context;
                ScheduledExecutorService scheduledExecutorService = c822660WOy2;
                FirebaseMessaging firebaseMessaging = this;
                C812200Vta c812200Vta2 = c812200Vta;
                C812300Vtk c812300Vtk2 = c812300Vtk;
                C1C7U.LIZ("TopicsSubscriber@7a3.createInstance$1L");
                synchronized (C810940VrY.class) {
                    WeakReference<C810940VrY> weakReference = C810940VrY.LIZLLL;
                    if (weakReference == null || (c810940VrY = weakReference.get()) == null) {
                        c810940VrY = new C810940VrY(C810670Vr7.LIZJ(context3, 0, "com.google.android.gms.appid"), scheduledExecutorService);
                        c810940VrY.LIZIZ();
                        C810940VrY.LIZLLL = new WeakReference<>(c810940VrY);
                    }
                }
                C810910VrV c810910VrV = new C810910VrV(firebaseMessaging, c812200Vta2, c810940VrY, c812300Vtk2, context3, scheduledExecutorService);
                C1C7U.LIZIZ("TopicsSubscriber@7a3.createInstance$1L");
                return c810910VrV;
            }
        }).LJI(c822660WOy, new InterfaceC835710WqP() { // from class: X.0VrZ
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                boolean z;
                C810910VrV c810910VrV = (C810910VrV) obj;
                if (this.LIZ.LJI() && c810910VrV.LJII.LIZ() != null) {
                    synchronized (c810910VrV) {
                        z = c810910VrV.LJI;
                    }
                    if (!z) {
                        c810910VrV.LJI(0L);
                    }
                }
            }
        });
        c822660WOy.execute(new Runnable() { // from class: X.0Vrg
            @Override // java.lang.Runnable
            public final void run() {
                Context contextN3;
                PackageManager packageManager;
                ApplicationInfo applicationInfoV3;
                Bundle bundle;
                FirebaseMessaging firebaseMessaging = this.LL;
                firebaseMessaging.getClass();
                C1C7U.LIZ("FirebaseMessaging@b71a.<init>$2L");
                final Context context3 = firebaseMessaging.LIZLLL;
                Context contextN32 = C786410Ut5.N3(context3);
                if (contextN32 == null) {
                    contextN32 = context3;
                }
                if (!C810670Vr7.LIZJ(contextN32, 0, "com.google.firebase.messaging").getBoolean("proxy_notification_initialized", false)) {
                    try {
                        contextN3 = C786410Ut5.N3(context3);
                        packageManager = contextN3.getPackageManager();
                    } catch (PackageManager.NameNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    final boolean z = (packageManager == null || (applicationInfoV3 = C786410Ut5.V3(packageManager, contextN3.getPackageName(), 128)) == null || (bundle = applicationInfoV3.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfoV3.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    if (Build.VERSION.SDK_INT >= 29) {
                        final C835520Wq6 c835520Wq6 = new C835520Wq6();
                        new Runnable() { // from class: X.0Vri
                            @Override // java.lang.Runnable
                            public final void run() {
                                Context context4 = context3;
                                boolean z2 = z;
                                C835520Wq6 c835520Wq62 = c835520Wq6;
                                C1C7U.LIZ("ProxyNotificationInitializer@b53e.setEnableProxyNotification$1L");
                                try {
                                    if (Binder.getCallingUid() != context4.getApplicationInfo().uid) {
                                        c835520Wq62.LIZLLL(null);
                                        C1C7U.LIZIZ("ProxyNotificationInitializer@b53e.setEnableProxyNotification$1L");
                                        return;
                                    }
                                    Context contextN33 = C786410Ut5.N3(context4);
                                    if (contextN33 == null) {
                                        contextN33 = context4;
                                    }
                                    SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(contextN33, 0, "com.google.firebase.messaging").edit();
                                    editorEdit.putBoolean("proxy_notification_initialized", true);
                                    editorEdit.apply();
                                    NotificationManager notificationManager = (NotificationManager) context4.getSystemService(NotificationManager.class);
                                    if (z2) {
                                        notificationManager.setNotificationDelegate("com.google.android.gms");
                                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                        notificationManager.setNotificationDelegate(null);
                                    }
                                    c835520Wq62.LIZLLL(null);
                                    C1C7U.LIZIZ("ProxyNotificationInitializer@b53e.setEnableProxyNotification$1L");
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c835520Wq62.LIZLLL(null);
                                    throw th;
                                }
                            }
                        }.run();
                    } else {
                        C835460Wq0.LJ(null);
                    }
                }
                C1C7U.LIZIZ("FirebaseMessaging@b71a.<init>$2L");
            }
        });
    }
}
