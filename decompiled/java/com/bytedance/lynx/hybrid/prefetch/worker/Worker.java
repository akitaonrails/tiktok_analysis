package com.bytedance.lynx.hybrid.prefetch.worker;

import X.C098200Yq;
import X.C1521680phW;
import X.C1522300piW;
import X.C1531220pwu;
import X.C1531370px9;
import X.C1531420pxE;
import X.C1531430pxF;
import X.C1535630q41;
import X.C1537480q70;
import X.C1537710q7N;
import X.C1543720qH4;
import X.C189200o6;
import X.C20544083a;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1531440pxG;
import X.InterfaceC21345618gA;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.monitorV2.jsworker.JsWorkerModule;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lynx.hybrid.prefetch.bridge.WorkerBridgeModule;
import com.bytedance.lynx.hybrid.prefetch.bridge.WorkerEnvModule;
import com.bytedance.lynx.hybrid.prefetch.worker.Worker;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.jsbridge.JSModuleWrapper;
import com.bytedance.vmsdk.monitor.VmSdkMonitor;
import com.bytedance.vmsdk.worker.JsWorker;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class Worker {
    public final InterfaceC1531440pxG LIZ;
    public final String LIZIZ;
    public final C1543720qH4 LIZJ;
    public final C1531370px9 LIZLLL;
    public final JSModuleManager LJ;
    public final JsWorker LJFF;

    public final void LIZIZ() {
        JSModule module;
        JsWorkerModule jsWorkerModule;
        C1521680phW module2;
        JsWorker jsWorker = this.LJFF;
        if (jsWorker != null) {
            jsWorker.terminate();
        }
        try {
            JSModuleWrapper jSModuleWrapperLIZ = this.LJ.LIZ("hybridMonitor");
            Unit unit = null;
            if (jSModuleWrapperLIZ != null && (module = jSModuleWrapperLIZ.getModule()) != null && (module instanceof JsWorkerModule) && (jsWorkerModule = (JsWorkerModule) module) != null && (module2 = jsWorkerModule.getModule()) != null) {
                module2.LJ();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LIZJ.LIZ.LJII();
    }

    public static void LIZ(boolean z) {
        try {
            VmSdkMonitor.LJ("hybrid-prefetch", new JSONObject().put("use_vmsdk_worker", z));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public Worker(InterfaceC1531440pxG interfaceC1531440pxG, final String str, C1543720qH4 c1543720qH4, C1531370px9 c1531370px9) {
        Object c098200Yq;
        C1531220pwu c1531220pwu;
        C1537480q70 c1537480q70;
        View view;
        View view2;
        this.LIZ = interfaceC1531440pxG;
        this.LIZIZ = str;
        this.LIZJ = c1543720qH4;
        this.LIZLLL = c1531370px9;
        long jOptLong = 30000;
        if (C1535630q41.LJIIZILJ) {
            final WeakReference weakReference = new WeakReference(this.LIZ);
            BPEAHandler bPEAHandler = C20544083a.LIZ;
            Runnable runnable = new Runnable() { // from class: X.0pwv
                public final void LIZ() {
                    C1531220pwu c1531220pwu2;
                    InterfaceC1531440pxG interfaceC1531440pxG2 = weakReference.get();
                    if (!(interfaceC1531440pxG2 instanceof C1531220pwu) || (c1531220pwu2 = (C1531220pwu) interfaceC1531440pxG2) == null) {
                        return;
                    }
                    String str2 = str;
                    EnumC1531250pwx enumC1531250pwx = c1531220pwu2.LJFF;
                    if (enumC1531250pwx == EnumC1531250pwx.Unusable || enumC1531250pwx == EnumC1531250pwx.Terminate) {
                        return;
                    }
                    C1531220pwu.LJIIJ(c1531220pwu2, -999, "prefetch time out", null, 4);
                    C1522300piW.LIZIZ("hybrid_prefetch_worker_finish", c1531220pwu2.LIZIZ, str2, new JSONObject().put("success", 0).put("errorMsg", "prefetch time out").put("errorCode", -999));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Worker@50bd.<init>$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Worker@50bd.<init>$1");
                }
            };
            try {
                JSONObject config = HybridSettings.INSTANCE.getConfig("hybrid_lynx_prefetch");
                if (config != null) {
                    jOptLong = config.optLong("worker_max_execution_duration", 30000L);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C786410Ut5.LJLIIL(jOptLong, bPEAHandler, runnable);
        } else {
            BPEAHandler bPEAHandler2 = new BPEAHandler(Looper.getMainLooper());
            Runnable runnable2 = new Runnable() { // from class: X.0pww
                public final void LIZ() {
                    C1531220pwu c1531220pwu2;
                    EnumC1531250pwx enumC1531250pwx;
                    Worker worker = this.LL;
                    InterfaceC1531440pxG interfaceC1531440pxG2 = worker.LIZ;
                    if (!(interfaceC1531440pxG2 instanceof C1531220pwu) || (c1531220pwu2 = (C1531220pwu) interfaceC1531440pxG2) == null || (enumC1531250pwx = c1531220pwu2.LJFF) == EnumC1531250pwx.Unusable || enumC1531250pwx == EnumC1531250pwx.Terminate) {
                        return;
                    }
                    C1531220pwu.LJIIJ(c1531220pwu2, -999, "prefetch time out", null, 4);
                    C1522300piW.LIZIZ("hybrid_prefetch_worker_finish", worker.LIZLLL.LIZJ.LIZIZ, worker.LIZIZ, new JSONObject().put("success", 0).put("errorMsg", "prefetch time out").put("errorCode", -999));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Worker@50bd.<init>$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Worker@50bd.<init>$2");
                }
            };
            try {
                JSONObject config2 = HybridSettings.INSTANCE.getConfig("hybrid_lynx_prefetch");
                if (config2 != null) {
                    jOptLong = config2.optLong("worker_max_execution_duration", 30000L);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C786410Ut5.LJLIIL(jOptLong, bPEAHandler2, runnable2);
        }
        Context context = C1531370px9.LIZLLL;
        JSModuleManager jSModuleManager = new JSModuleManager(context == null ? null : context);
        try {
            if (jSModuleManager.LIZ("hybridMonitor") == null) {
                jSModuleManager.LIZIZ("hybridMonitor", JsWorkerModule.class, null);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LJ = jSModuleManager;
        try {
            c098200Yq = new JsWorker(jSModuleManager, JsWorker.EngineType.QUICKJS, null, false, "hybrid_lynx_prefetch");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            JsWorker jsWorker = (JsWorker) c098200Yq;
            this.LIZLLL.getClass();
            InterfaceC1531440pxG interfaceC1531440pxG2 = this.LIZ;
            if ((interfaceC1531440pxG2 instanceof C1531220pwu) && (c1531220pwu = (C1531220pwu) interfaceC1531440pxG2) != null && (c1537480q70 = c1531220pwu.LIZIZ) != null) {
                Object objLJIJJ = c1537480q70.LJIJJ();
                if ((objLJIJJ instanceof C1537710q7N) && (view2 = (View) objLJIJJ) != null) {
                    C1531420pxE.LIZ(view2, this.LJ);
                } else {
                    c1537480q70.LJJ(JSModuleManager.class, this.LJ);
                    Object objLJIJJ2 = c1537480q70.LJIJJ();
                    if ((objLJIJJ2 instanceof C1537710q7N) && (view = (View) objLJIJJ2) != null) {
                        C1531420pxE.LIZ(view, this.LJ);
                    }
                }
            }
            this.LJ.LIZIZ("bridge", WorkerBridgeModule.class, new C1531430pxF(this.LIZIZ, this.LIZJ));
            this.LJ.LIZIZ("workerEnv", WorkerEnvModule.class, this.LIZLLL);
            jsWorker.setOnErrorCallback(new InterfaceC21345618gA() { // from class: com.bytedance.lynx.hybrid.prefetch.worker.Worker$mWorker$2$2
                @Override // X.InterfaceC21345618gA
                public final void LIZ(String str2) {
                    this.LIZ.LIZ.onError(str2);
                }
            });
            jsWorker.setOnMessageCallback(new InterfaceC21345618gA() { // from class: com.bytedance.lynx.hybrid.prefetch.worker.Worker$mWorker$2$3
                @Override // X.InterfaceC21345618gA
                public final void LIZ(String str2) {
                    this.LIZ.LIZ.LIZIZ(str2);
                }
            });
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Worker create successfully, prefetch url: ");
            sbLIZ.append(this.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1522300piW.LIZIZ("hybrid_prefetch_worker_start", this.LIZLLL.LIZJ.LIZIZ, this.LIZIZ, null);
            LIZ(true);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            this.LJFF = (JsWorker) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
            return;
        }
        LIZ(false);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init JsWorker failed, ");
        sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
