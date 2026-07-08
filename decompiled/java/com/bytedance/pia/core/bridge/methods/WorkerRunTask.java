package com.bytedance.pia.core.bridge.methods;

import X.C09CT;
import X.C1287700jc8;
import X.C1BOW;
import X.C1BP0;
import X.C1BP1;
import X.C1BP4;
import X.C1BP6;
import X.C1BP9;
import X.C1BPO;
import X.C1BQ0;
import X.C2188811AlT;
import X.C2204051BNz;
import X.C2204191BOn;
import X.C2204401BPi;
import X.C2204431BPl;
import X.C786410Ut5;
import X.InterfaceC1530550pvp;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import android.text.TextUtils;
import com.bytedance.pia.core.bridge.methods.WorkerRunTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes35.dex */
public final class WorkerRunTask implements InterfaceC2204471BPp<Params, Result> {
    public static final C1BP1<Params, Result> LIZ = new C1BP1<>("pia.internal.worker.runTask", C1BP0.Render, new InterfaceC1537230q6b() { // from class: X.1BQL
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new WorkerRunTask();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static class Params {

        @C09CT("execute_time_limit")
        public Long executeTimeLimit;

        @C09CT("location")
        public String location;

        @C09CT("name")
        public String name;

        @C09CT("params")
        public k params;

        @C09CT("url")
        public String url;
    }

    public static class Result {

        @C09CT("result")
        public final n result;

        public Result(n nVar) {
            this.result = nVar;
        }
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, final C1BPO c1bpo, final C2204431BPl c2204431BPl) {
        String str;
        long jLongValue;
        Params params = (Params) obj;
        if (params.url == null) {
            c2204431BPl.accept(new C1BQ0("Parameter 'url' is required!"));
            return;
        }
        if (!TextUtils.isEmpty(params.name)) {
            str = params.name;
        } else {
            str = "RunTask";
        }
        Long l = params.executeTimeLimit;
        if (l != null) {
            if (l.longValue() >= 0 && params.executeTimeLimit.longValue() <= 600) {
                jLongValue = params.executeTimeLimit.longValue();
            } else {
                c2204431BPl.accept(new C1BQ0("Parameter 'execute_time_limit' should be in range 0~600!"));
                return;
            }
        } else {
            jLongValue = 30;
        }
        Object nVar = params.params;
        if (nVar != null && !(nVar instanceof m)) {
            if (!(nVar instanceof n)) {
                c2204431BPl.accept(new C1BQ0("Parameters 'params' must be an object!"));
                return;
            }
        } else {
            nVar = new n();
        }
        C2204051BNz c2204051BNz = c1bp6.LIZIZ;
        C1BOW c1bow = new C1BOW();
        c1bow.LIZJ = c2204051BNz;
        c1bow.LJI = str;
        c1bow.LIZ = params.location;
        c1bow.LIZIZ = params.url;
        c1bow.LIZLLL = new InterfaceC1530550pvp() { // from class: X.1BQ3
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj2) {
                c1bpo.accept(new WorkerRunTask.Result((n) obj2));
            }
        };
        c1bow.LJII = c2204051BNz.LJIIL;
        C1BP9 c1bp9LIZ = c1bow.LIZ();
        if (c1bp9LIZ == null) {
            c2204431BPl.accept(new C2204191BOn(-10001));
            return;
        }
        Object obj2 = c2204051BNz.get(c1bp9LIZ.LIZJ);
        if (obj2 instanceof String) {
            Object obj3 = c2204051BNz.get((String) obj2);
            if ((obj3 instanceof C1BP4) && ((C1BP4) obj3).LIZ()) {
                c2204431BPl.accept(new C2204191BOn(-10005));
                return;
            }
        }
        try {
            final C1BP4 c1bp4 = new C1BP4(c1bp9LIZ);
            final String strLIZJ = c1bp6.LIZIZ.LIZJ(c1bp4);
            C2204051BNz c2204051BNz2 = c1bp6.LIZIZ;
            String string = c1bp4.LJIIIIZZ.toString();
            if (TextUtils.isEmpty(string)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("javascript:");
                sbLIZ.append(c1bp4.LJIIIZ);
                string = C2188811AlT.LIZIZ(sbLIZ);
            }
            c2204051BNz2.LIZ(strLIZJ, string);
            final WeakReference weakReference = new WeakReference(c1bp6.LIZIZ);
            C786410Ut5.LJLIIL(jLongValue * 1000, C1287700jc8.LIZ(), new Runnable() { // from class: X.1BOm
                @Override // java.lang.Runnable
                public final void run() {
                    WeakReference weakReference2 = weakReference;
                    String str2 = strLIZJ;
                    InterfaceC1530550pvp interfaceC1530550pvp = c2204431BPl;
                    C1C7U.LIZ("WorkerRunTask@4ffc.invoke$1L");
                    InterfaceC2204171BOl interfaceC2204171BOl = (InterfaceC2204171BOl) weakReference2.get();
                    if (interfaceC2204171BOl == null) {
                        C1C7U.LIZIZ("WorkerRunTask@4ffc.invoke$1L");
                        return;
                    }
                    Object obj4 = interfaceC2204171BOl.get(str2);
                    if (obj4 instanceof C1BP4) {
                        C1BP4 c1bp42 = (C1BP4) obj4;
                        if (c1bp42.LIZ()) {
                            interfaceC1530550pvp.accept(new C2204191BOn(-10006));
                            c1bp42.LJFF(null);
                            interfaceC2204171BOl.remove(str2);
                        }
                    }
                    C1C7U.LIZIZ("WorkerRunTask@4ffc.invoke$1L");
                }
            });
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("!function(a){globalThis._pia_task_={params:a,callback:function(a){NativeModules.get(\"BaseModule\").terminateWithResult(a)}}}(");
            sbLIZ2.append(nVar);
            sbLIZ2.append(")");
            c1bp4.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c1bp4.LJ();
            c1bp4.LIZLLL.LIZJ(new InterfaceC1530550pvp() { // from class: X.1BNW
                @Override // X.InterfaceC1530550pvp
                public final void accept(Object obj4) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[RunTask] unhandled message: ");
                    sbLIZ3.append(obj4);
                    C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                }
            });
            c1bp4.LIZIZ.LIZJ(new C2204401BPi(new InterfaceC1530550pvp() { // from class: X.1BPs
                @Override // X.InterfaceC1530550pvp
                public final void accept(Object obj4) {
                    InterfaceC1530550pvp interfaceC1530550pvp = c2204431BPl;
                    C1BP4 c1bp42 = c1bp4;
                    interfaceC1530550pvp.accept(new C2204191BOn(-10007, (String) obj4));
                    c1bp42.LJFF(null);
                }
            }, c1bp4));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof C2204191BOn) {
                c2204431BPl.accept(th);
            } else {
                c2204431BPl.accept(new C2204191BOn(th.toString()));
            }
        }
    }
}
