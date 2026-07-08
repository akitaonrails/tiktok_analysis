package ms.bd.o;

import X.C08RN;
import X.C0VSJ;
import X.C2179971ATj;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C788530UwV;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ms.bd.o.w2;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes14.dex */
public class l3 implements Application.ActivityLifecycleCallbacks, e3 {
    public static volatile l3 LLJILJIL = null;
    public static int LLJILJILJ = 200;
    public Application LLJ;
    public final w2 LLJIJIL;
    public boolean LL = false;
    public boolean LLILLJJLI = false;
    public boolean LLILZ = false;
    public boolean LLIZ = false;
    public final WeakHashMap<Activity, Integer> LLIZLLLIL = new WeakHashMap<>();
    public long LLJI = 0;
    public final Lock LLILZLL = new ReentrantLock();
    public final LinkedList<j3> LLILZIL = new LinkedList<>();
    public final c LLILLL = new c();

    public class a implements w2.a {
        @Override // ms.bd.o.w2.a
        public final Object a(String str) {
            String[] strArrSplit = str.split((String) k.a(16777217, 0, 0L, "2dc865", new byte[]{111}));
            if (strArrSplit.length >= 5) {
                return new j3(CastIntegerProtector.parseInt(strArrSplit[0]), CastDoubleProtector.parseDouble(strArrSplit[1]), CastDoubleProtector.parseDouble(strArrSplit[2]), CastLongProtector.parseLong(strArrSplit[3]), strArrSplit[4]);
            }
            return null;
        }

        @Override // ms.bd.o.w2.a
        public final String a(Object obj) {
            j3 j3Var = (j3) obj;
            return C786410Ut5.k4(Locale.ENGLISH, (String) k.a(16777217, 0, 0L, "546284", new byte[]{97, 50, 9, 3, 73, 113, 48, 89, 34, 44, 118, 48, 9, 3, 3, 111, 115, 6}), new Object[]{Integer.valueOf(j3Var.LIZ), Double.valueOf(j3Var.LIZIZ), Double.valueOf(j3Var.LIZJ), Long.valueOf(j3Var.LIZLLL), j3Var.LJ});
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    l3 l3Var = l3.this;
                    Application application = l3Var.LLJ;
                    c cVar = l3Var.LLILLL;
                    ReceiverRegisterLancet.loge(cVar, false);
                    application.unregisterReceiver(cVar);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                    return;
                }
            } catch (IllegalArgumentException | Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            l3.this.LLIZLLLIL.clear();
        }
    }

    public static l3 LIZJ(Context context) {
        if (LLJILJIL == null) {
            synchronized (l3.class) {
                try {
                    if (LLJILJIL == null) {
                        LLJILJIL = new l3(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJILJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0008, B:10:0x0014, B:12:0x001e, B:14:0x0028, B:21:0x0043, B:23:0x004d, B:24:0x0051, B:25:0x0055, B:27:0x005b, B:19:0x003d, B:20:0x0040), top: B:36:0x0000 }] */
    @Override // ms.bd.o.e3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.MotionEvent r13, java.lang.String r14) {
        /*
            r12 = this;
            boolean r0 = r12.LL     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L75
            boolean r0 = r12.LLILZ     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L75
            int r0 = r13.getAction()     // Catch: java.lang.Throwable -> L79
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            if (r0 != r3) goto L7d
        L14:
            java.util.concurrent.locks.Lock r0 = r12.LLILZLL     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.tryLock()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L7d
            java.util.LinkedList<ms.bd.o.j3> r0 = r12.LLILZIL     // Catch: java.lang.Throwable -> L79
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L79
            int r0 = ms.bd.o.l3.LLJILJILJ     // Catch: java.lang.Throwable -> L79
            if (r1 >= r0) goto L7d
            ms.bd.o.k3 r5 = ms.bd.o.k3.a     // Catch: java.lang.Throwable -> L79
            int r4 = r5.a()     // Catch: java.lang.Throwable -> L79
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L79
            int r0 = r13.getAction()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L40
            if (r0 == r2) goto L3d
            if (r0 != r3) goto L55
            goto L43
        L3d:
            ms.bd.o.k3 r0 = ms.bd.o.k3.d     // Catch: java.lang.Throwable -> L79
            goto L51
        L40:
            ms.bd.o.k3 r0 = ms.bd.o.k3.b     // Catch: java.lang.Throwable -> L79
            goto L51
        L43:
            long r0 = r12.LLJI     // Catch: java.lang.Throwable -> L79
            long r3 = r9 - r0
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L71
            r12.LLJI = r9     // Catch: java.lang.Throwable -> L79
            ms.bd.o.k3 r0 = ms.bd.o.k3.c     // Catch: java.lang.Throwable -> L79
        L51:
            int r4 = r0.a()     // Catch: java.lang.Throwable -> L79
        L55:
            int r0 = r5.a()     // Catch: java.lang.Throwable -> L79
            if (r4 == r0) goto L7d
            java.util.LinkedList<ms.bd.o.j3> r1 = r12.LLILZIL     // Catch: java.lang.Throwable -> L79
            ms.bd.o.j3 r3 = new ms.bd.o.j3     // Catch: java.lang.Throwable -> L79
            float r0 = r13.getX()     // Catch: java.lang.Throwable -> L79
            double r5 = (double) r0     // Catch: java.lang.Throwable -> L79
            float r0 = r13.getY()     // Catch: java.lang.Throwable -> L79
            double r7 = (double) r0     // Catch: java.lang.Throwable -> L79
            r11 = r14
            r3.<init>(r4, r5, r7, r9, r11)     // Catch: java.lang.Throwable -> L79
            r1.add(r3)     // Catch: java.lang.Throwable -> L79
            goto L7d
        L71:
            r12.LJI()
            return
        L75:
            r12.LJI()
            return
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7d:
            r12.LJI()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.l3.LIZ(android.view.MotionEvent, java.lang.String):void");
    }

    public final Object[] LIZLLL(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(16);
        if (this.LLILZIL.size() > 0) {
            StringBuilder sb = new StringBuilder();
            JSONArray jSONArray2 = new JSONArray();
            Locale locale = Locale.ENGLISH;
            int i = 0;
            for (j3 j3Var : this.LLILZIL) {
                i++;
                if (i > LLJILJILJ) {
                    break;
                }
                if (j3Var != null) {
                    String strK4 = C786410Ut5.k4(locale, (String) k.a(16777217, 0, 0L, "aa1a3c", new byte[]{53, 45, 16, 19}), new Object[]{Double.valueOf(j3Var.LIZIZ)});
                    String strK42 = C786410Ut5.k4(locale, (String) k.a(16777217, 0, 0L, "a3ee24", new byte[]{53, 127, 68, 23}), new Object[]{Double.valueOf(j3Var.LIZJ)});
                    sb.append(j3Var.LIZLLL);
                    sb.append(',');
                    sb.append(j3Var.LIZ);
                    sb.append(',');
                    sb.append(strK4);
                    sb.append(',');
                    sb.append(strK42);
                    sb.append(',');
                    if (k3.b.a() == j3Var.LIZ) {
                        sb.append(j3Var.LJ);
                    }
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(j3Var.LIZLLL);
                    jSONArray3.put(j3Var.LIZ);
                    jSONArray3.put(strK4);
                    jSONArray3.put(strK42);
                    jSONArray3.put(j3Var.LJ);
                    jSONArray2.put(jSONArray3);
                    if (k3.d.a() == j3Var.LIZ) {
                        arrayList.add(sb.toString());
                        sb.delete(0, sb.length());
                        jSONArray.put(jSONArray2);
                        jSONArray2 = new JSONArray();
                    } else {
                        sb.append(';');
                    }
                }
            }
        }
        return arrayList.toArray();
    }

    public final void LJ() {
        synchronized (this) {
            try {
                this.LLILZ = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF() {
        Application application;
        if (!this.LL || this.LLJ == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LL && (application = this.LLJ) != null) {
                    this.LL = false;
                    if (this.LLILLJJLI) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new b());
                        this.LLILLJJLI = false;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI() {
        try {
            ((ReentrantLock) this.LLILZLL).unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Window.Callback callback = activity.getWindow().getCallback();
        if (callback == null || this.LLIZ || this.LLIZLLLIL.containsKey(activity)) {
            return;
        }
        activity.getWindow().setCallback(new h3(callback, activity.getClass().getName(), this));
        this.LLIZLLLIL.put(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.LLIZLLLIL.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        public final void LIZ(Intent intent) {
            String action = intent.getAction();
            if (action.equals(k.a(16777217, 0, 0L, "c02399", new byte[]{81, 29, 108, 9, 54, 0, 83, 95, 70, 77, 70, 23, 115, 120, 50, 6, 73, 35, 71, 92, 81, 29, 111, 115, 39, 7, 78, 52, 81}))) {
                l3 l3Var = l3.this;
                synchronized (l3Var) {
                    try {
                        l3Var.LLILZ = true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            if (action.equals(k.a(16777217, 0, 0L, "33c7f7", new byte[]{1, 30, 61, 13, 105, 14, 3, 92, 30, 66, 3, 7, 53, 124, 109, 8, 25, 32, 22, 88, 1, 30, 62, 119, 120, 9, 30, 55, 0}))) {
                l3.this.LJ();
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                LIZ(intent);
            } else {
                C2408409cA.LIZ();
                LIZ(intent);
            }
        }
    }

    public l3(Context context) throws Throwable {
        Object obj;
        Context applicationContext = null;
        this.LLJIJIL = null;
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        this.LLJIJIL = new w2(new C0VSJ(file, (String) k.a(16777217, 0, 0L, "fe09e6", new byte[]{57, 106, 80, 64, 101, 34, 100, 71, 105, 108})), (String) k.a(16777217, 0, 0L, "e8de92", new byte[]{58, 55, 3, 18, 14}), new a());
    }
}
