package com.ss.android.ugc.aweme.hybridkit.task;

import X.C08RN;
import X.C098200Yq;
import X.C0BNM;
import X.C0CBO;
import X.C0CCZ;
import X.C0PEM;
import X.C0VSJ;
import X.C0VZ0;
import X.C10UI;
import X.C1253204vK;
import X.C1311905Bl;
import X.C13BV;
import X.C1530030puz;
import X.C1535830q4L;
import X.C1536660q5g;
import X.C1536670q5h;
import X.C1537820q7Y;
import X.C1538260q8G;
import X.C1538580q8m;
import X.C1539320q9y;
import X.C1545760qKM;
import X.C15O7;
import X.C1867110ygf;
import X.C189200o6;
import X.C20107413lw;
import X.C2188811AlT;
import X.C2213981Bky;
import X.C2281008wi;
import X.C23250099c;
import X.C2373809Rw;
import X.C587540N2q;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C799890VZj;
import X.C799900VZk;
import X.C817503Hh;
import X.EnumC668160QIs;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1539390qA5;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.common.autoservice.ISDUIAPI;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.font.FontLoadManager$init$1;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridKitInitTask implements C0CCZ {
    public static final HybridKitInitTask LL = new HybridKitInitTask();
    public static volatile EnumC668160QIs LLILLJJLI = EnumC668160QIs.INIT;
    public static final List<InterfaceC1539390qA5> LLILLL = new ArrayList();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "HybridKitInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    static {
        C1538580q8m c1538580q8m = new C1538580q8m();
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.LLJJJJLIIL(c1538580q8m);
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C0CBO.LIZ() == 1 ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.BOOT_FINISH;
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static void LJ(Context context) {
        String str;
        C1535830q4L c1535830q4LLJJLIIIJL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LLILLJJLI = EnumC668160QIs.LOADING;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HybridKitInitTask executeTask : ");
        sbLIZ.append(System.currentTimeMillis());
        C1530030puz.LIZIZ("HybridSdkInitLogger", C2188811AlT.LIZIZ(sbLIZ), null);
        if (C1867110ygf.LIZ()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0q6r
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("HybridKitInitTask@c3e9.executeTask$1");
                    try {
                        WebViewHooker.LIZLLL(new FontLoadManager$init$1());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("HybridKitInitTask@c3e9.executeTask$1");
                }
            });
        }
        C1537820q7Y c1537820q7Y = C1538260q8G.LIZ;
        C1536660q5g.LIZ.getClass();
        C1536670q5h.LIZ.getClass();
        if (!C1536670q5h.LIZJ) {
            c1537820q7Y.LJ(null);
        }
        if (!C1539320q9y.LIZJ) {
            C587540N2q.LIZ.getClass();
            ISDUIAPI isduiapi = (ISDUIAPI) C587540N2q.LIZ(ISDUIAPI.class);
            if (isduiapi != null) {
                isduiapi.initSDUIKit();
            }
        }
        try {
            if (!C10UI.LIZ()) {
                C1545760qKM.LIZ.getClass();
                C1545760qKM.LIZIZ(context);
            } else {
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi != null) {
                    new AwS567S0100000_23(context, 97);
                    iSparkHostApi.LLILLIZIL();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi2 == null || !iSparkHostApi2.LLIIZ()) {
            new HybridKitInitWebKitTask().run(context);
        }
        try {
            HybridSettings.INSTANCE.startFetch();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        HashMap map = new HashMap();
        if (iSparkHostApi2 == null || (c1535830q4LLJJLIIIJL = iSparkHostApi2.LJJLIIIJL()) == null || (str = c1535830q4LLJJLIIIJL.LIZIZ) == null) {
            str = "";
        }
        if (str.length() > 0) {
            map.put(str, C13BV.INSTANCE);
        }
        try {
            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
            C0VSJ c0vsj = new C0VSJ(LIZ(c2213981Bky.getApplicationContext()), "offlineX");
            if (!map.isEmpty()) {
                C20107413lw.LIZ.LIZJ(c2213981Bky.getApplicationContext(), C15O7.LJI, c0vsj, map, C2373809Rw.LIZ);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        if (C1253204vK.LIZ()) {
            new HybridPerformanceInitTask().run(context);
        } else {
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new HybridPerformanceInitTask());
            c799890VZj.LIZIZ();
        }
        LLILLJJLI = EnumC668160QIs.FINISHED;
        Iterator it2 = ((ArrayList) LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1539390qA5) it2.next()).LIZ();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
        C2281008wi c2281008wi = C2281008wi.LIZ;
        long j2 = jCurrentTimeMillis2 - HybridKitConfigTask.LLJ;
        c2281008wi.getClass();
        C2281008wi.LIZ(j, j2, "init");
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        long jLongValue = ((Number) C0BNM.LIZ.getValue()).longValue();
        if (jLongValue > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HybridKitInitTask run start: ");
            sbLIZ.append(System.currentTimeMillis());
            C1530030puz.LIZIZ("HybridSdkInitLogger", C2188811AlT.LIZIZ(sbLIZ), null);
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1311905Bl(jLongValue, context, null), 2);
            return;
        }
        LJ(context);
    }
}
