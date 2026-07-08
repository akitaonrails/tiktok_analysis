package com.bytedance.pia.core.bridge.methods;

import X.C09CT;
import X.C1BOW;
import X.C1BP0;
import X.C1BP1;
import X.C1BP4;
import X.C1BP6;
import X.C1BP9;
import X.C1BPO;
import X.C1BQ0;
import X.C2204051BNz;
import X.C2204191BOn;
import X.C2204401BPi;
import X.C2204431BPl;
import X.InterfaceC1530550pvp;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import com.bytedance.pia.core.bridge.methods.WorkerCreate;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;

/* JADX INFO: loaded from: classes35.dex */
public final class WorkerCreate implements InterfaceC2204471BPp<Params, Result> {
    public static final C1BP1<Params, Result> LIZ = new C1BP1<>("pia.internal.worker.create", C1BP0.Render, new InterfaceC1537230q6b() { // from class: X.1BQJ
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new WorkerCreate();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static class Params {

        @C09CT("location")
        public String location;

        @C09CT("name")
        public String name;

        @C09CT("url")
        public String url;
    }

    public static class Result {

        @C09CT("worker")
        public final String worker;

        public Result(String str) {
            this.worker = str;
        }
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(final C1BP6 c1bp6, Object obj, C1BPO c1bpo, C2204431BPl c2204431BPl) {
        Params params = (Params) obj;
        String str = params.url;
        if (str == null) {
            c2204431BPl.accept(new C1BQ0("Parameter 'url' is required!"));
            return;
        }
        C2204051BNz c2204051BNz = c1bp6.LIZIZ;
        C1BOW c1bow = new C1BOW();
        c1bow.LIZJ = c2204051BNz;
        c1bow.LJI = params.name;
        c1bow.LIZ = params.location;
        c1bow.LIZIZ = str;
        c1bow.LJII = c2204051BNz.LJIIL;
        C1BP9 c1bp9LIZ = c1bow.LIZ();
        if (c1bp9LIZ == null) {
            c2204431BPl.accept(new C2204191BOn(-10001));
            return;
        }
        try {
            C1BP4 c1bp4 = new C1BP4(c1bp9LIZ);
            c1bp4.LJ();
            final String strLIZJ = c2204051BNz.LIZJ(c1bp4);
            if (strLIZJ == null) {
                c2204431BPl.accept(new C2204191BOn(-10002));
                return;
            }
            c1bp4.LIZLLL.LIZJ(new InterfaceC1530550pvp() { // from class: X.1BOp
                @Override // X.InterfaceC1530550pvp
                public final void accept(Object obj2) {
                    InterfaceC21281518Qb interfaceC21281518Qb = c1bp6;
                    final String str2 = strLIZJ;
                    final n nVar = (n) obj2;
                    if (nVar != null) {
                        interfaceC21281518Qb.LIZ(new Object(str2, nVar) { // from class: com.bytedance.pia.core.bridge.methods.WorkerOnMessage$Params

                            @C09CT("message")
                            public n message;

                            @C09CT("worker")
                            public String worker;

                            {
                                this.worker = str2;
                                this.message = nVar;
                            }
                        }, "pia.internal.worker.onMessage");
                    }
                }
            });
            c1bp4.LIZIZ.LIZJ(new C2204401BPi(new InterfaceC1530550pvp() { // from class: X.1BQ6
                @Override // X.InterfaceC1530550pvp
                public final void accept(Object obj2) {
                    InterfaceC21281518Qb interfaceC21281518Qb = c1bp6;
                    final String str2 = strLIZJ;
                    final String str3 = (String) obj2;
                    if (str3 != null) {
                        interfaceC21281518Qb.LIZ(new Object(str2, str3) { // from class: com.bytedance.pia.core.bridge.methods.WorkerOnError$Params

                            @C09CT("error")
                            public String error;

                            @C09CT("worker")
                            public String worker;

                            {
                                this.worker = str2;
                                this.error = str3;
                            }
                        }, "pia.internal.worker.onError");
                    }
                }
            }, c1bp4));
            c1bpo.accept(new Result(strLIZJ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof C2204191BOn) {
                c2204431BPl.accept(th);
            } else {
                c2204431BPl.accept(new C2204191BOn(-10002, th.toString()));
            }
        }
    }
}
